package com.infinity.infoway.atmiya.student.exam.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.api.ApiImplementer;
import com.infinity.infoway.atmiya.custom_class.TextViewMediumFont;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.exam.adapter.StudentExamFormAdapter;
import com.infinity.infoway.atmiya.student.exam.pojo.GetGrantTermConfigurationForStudentRegExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForRegExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.InsertExamToStudentFromRegularExamFormAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;
import com.infinity.infoway.atmiya.utils.ConnectionDetector;
import com.infinity.infoway.atmiya.utils.DialogUtil;
import com.infinity.infoway.atmiya.utils.GeneratePDFFileFromBase64String;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentExamFormActivity extends AppCompatActivity implements View.OnClickListener {

    private MySharedPreferences mySharedPreferences;
    private ConnectionDetector connectionDetector;
    private AppCompatImageView ivCloseExamForm;
    private LinearLayout llStudentExamForm;
    private RecyclerView rvStudentExamForm;
    private MaterialButton btnSave, btnDownload;
    private TextViewRegularFont tvStudentName;
    private TextViewMediumFont tvProgramme;
    private TextViewMediumFont tvEnrollmentNo;
    private TextViewMediumFont tvAdmissionNo;
    private FrameLayout flSaveAndDownload;
    private String base64String = "";
    private String fileName = "__";
    private String swd_id = "-";
    private String year_id = "-";
    private String college_id = "-";


    private void setStudentData(String studentName, String programmeName, String enrollmentNo, String admissionNo) {
        if (!CommonUtil.checkIsEmptyOrNullCommon(studentName)) {
            tvStudentName.setText(studentName);
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(programmeName)) {
            tvProgramme.setText(studentName);
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(enrollmentNo)) {
            tvEnrollmentNo.setText(studentName);
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(admissionNo)) {
            tvAdmissionNo.setText(studentName);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_exam_form);
        initView();
        getStudentPaperListForRegExamFormApiCall();
    }

    private void initView() {
        mySharedPreferences = new MySharedPreferences(StudentExamFormActivity.this);
        connectionDetector = new ConnectionDetector(StudentExamFormActivity.this);
        ivCloseExamForm = findViewById(R.id.ivCloseExamForm);
        ivCloseExamForm.setOnClickListener(this);
        tvStudentName = findViewById(R.id.tvStudentName);
        tvProgramme = findViewById(R.id.tvProgramme);
        tvEnrollmentNo = findViewById(R.id.tvEnrollmentNo);
        tvAdmissionNo = findViewById(R.id.tvAdmissionNo);
        llStudentExamForm = findViewById(R.id.llStudentExamForm);
        rvStudentExamForm = findViewById(R.id.rvStudentExamForm);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnDownload = findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(this);
        btnSave.setEnabled(false);
        btnDownload.setEnabled(false);
        flSaveAndDownload = findViewById(R.id.flSaveAndDownload);
        flSaveAndDownload.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivCloseExamForm) {
            onBackPressed();
        } else if (v.getId() == R.id.btnSave) {
            insertExamToStudentFromRegularExamApiCall(swd_id, year_id, college_id);
        } else if (v.getId() == R.id.btnDownload) {
            if (!CommonUtil.checkIsEmptyOrNullCommon(base64String)) {
                new GeneratePDFFileFromBase64String(StudentExamFormActivity.this, "Exam Form", CommonUtil.generateUniqueFileName(fileName), base64String);
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void getStudentPaperListForRegExamFormApiCall() {
        DialogUtil.showProgressDialogNotCancelable(StudentExamFormActivity.this, "");
        ApiImplementer.getStudentPaperListOfRegExamFormApiImplementer(mySharedPreferences.getStudentId(), mySharedPreferences.getSmId(),
                new Callback<GetStudentPaperListForRegExamFormAPIPojo>() {
                    @Override
                    public void onResponse(Call<GetStudentPaperListForRegExamFormAPIPojo> call, Response<GetStudentPaperListForRegExamFormAPIPojo> response) {
                        if (response.isSuccessful()) {
                            if (response.body() != null &&
                                    response.body().getTable() != null && response.body().getTable().size() > 0) {
                                DialogUtil.hideProgressDialog();
                                GetStudentPaperListForRegExamFormAPIPojo.Table table = response.body().getTable().get(0);
                                base64String = table.getBase64string();
                                fileName = table.getFilename();
                                llStudentExamForm.setVisibility(View.VISIBLE);
                                flSaveAndDownload.setVisibility(View.VISIBLE);
                                btnSave.setEnabled(false);
                                btnDownload.setEnabled(true);
                                setStudentData(table.getStudName(), table.getProgramme(), table.getStudEnrollmentNo(),
                                        table.getStudAdmissionNo());
                                rvStudentExamForm.setAdapter(new StudentExamFormAdapter(StudentExamFormActivity.this,
                                        false, (ArrayList<GetStudentPaperListForRegExamFormAPIPojo.Table>) response.body().getTable(), null));
                            } else {
                                getGrantTermConfigurationApiCall(false, false);
                            }
                        } else {
                            DialogUtil.hideProgressDialog();
                            Toast.makeText(StudentExamFormActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<GetStudentPaperListForRegExamFormAPIPojo> call, Throwable t) {
                        DialogUtil.hideProgressDialog();
                        Toast.makeText(StudentExamFormActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                    }
                });
    }

    private void getGrantTermConfigurationApiCall(boolean isPdShow, boolean isPdHide) {
        if (isPdShow) {
            DialogUtil.showProgressDialogNotCancelable(StudentExamFormActivity.this, "");
        }
        ApiImplementer.getGrantTermConfigurationForStudentApiImplementer(mySharedPreferences.getSmId(), "0", new Callback<GetGrantTermConfigurationForStudentRegExamFormAPIPojo>() {
            @Override
            public void onResponse(Call<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> call, Response<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> response) {
                if (isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                if (response.isSuccessful() && response.body() != null && response.body().getTable() != null) {
                    if (response.body().getTable().size() > 0) {
                        year_id = response.body().getTable().get(0).getGtcYearId() + "";
                        getStudentPaperListForConfigurationApiCall(false, true);
                    } else {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentExamFormActivity.this, "Your term was not granted. Please contact your Head of Department.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (!isPdHide) {
                        DialogUtil.hideProgressDialog();
                    }
                    Toast.makeText(StudentExamFormActivity.this, "Something went wrong,Please try again later!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> call, Throwable t) {
                if (!isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                Toast.makeText(StudentExamFormActivity.this, "Failed to get configuration!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void getStudentPaperListForConfigurationApiCall(boolean isPdShow, boolean isPdHide) {
        if (isPdShow) {
            DialogUtil.showProgressDialogNotCancelable(StudentExamFormActivity.this, "");
        }
        ApiImplementer.getStudPaperListForRegExamIfConfigFoundApiImplementer(mySharedPreferences.getStudentId(), mySharedPreferences.getSmId(), new Callback<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo>() {
            @Override
            public void onResponse(Call<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo> call, Response<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo> response) {
                if (isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                if (response.isSuccessful() && response.body() != null &&
                        response.body().getTable() != null) {
                    if (response.body().getTable().size() > 0) {
                        GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo.Table table = response.body().getTable().get(0);
                        swd_id = table.getSwdId() + "";
                        college_id = table.getSwdMainSchoolId() + "";
                        llStudentExamForm.setVisibility(View.VISIBLE);
                        flSaveAndDownload.setVisibility(View.VISIBLE);
                        btnSave.setEnabled(true);
                        btnDownload.setEnabled(false);
                        setStudentData(table.getStudName(), table.getProgramme(), table.getStudEnrollmentNo(),
                                table.getStudAdmissionNo());
                        rvStudentExamForm.setAdapter(new StudentExamFormAdapter(StudentExamFormActivity.this,
                                true, null, (ArrayList<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo.Table>) response.body().getTable()));
                    } else {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentExamFormActivity.this, "Exam form date is locked. Please contact your Head of Department.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (!isPdHide) {
                        DialogUtil.hideProgressDialog();
                    }
                    Toast.makeText(StudentExamFormActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo> call, Throwable t) {
                if (!isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                Toast.makeText(StudentExamFormActivity.this, "Failed to get paper list!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void insertExamToStudentFromRegularExamApiCall(String swd_id, String year_id, String college_id) {
        DialogUtil.showProgressDialogNotCancelable(StudentExamFormActivity.this, "");
        ApiImplementer.insertExamToStudentFromRegularExamApiImplementer(mySharedPreferences.getStudentId(),
                swd_id, year_id, mySharedPreferences.getStudentId(), college_id, mySharedPreferences.getSmId(), new Callback<InsertExamToStudentFromRegularExamFormAPIPojo>() {
                    @Override
                    public void onResponse(Call<InsertExamToStudentFromRegularExamFormAPIPojo> call, Response<InsertExamToStudentFromRegularExamFormAPIPojo> response) {
                        DialogUtil.hideProgressDialog();
                        if (response.isSuccessful() && response.body() != null &&
                                response.body().getTable().size() > 0 &&
                                !CommonUtil.checkIsEmptyOrNullCommon(response.body().getTable().get(0).getBase64string())) {
                            base64String = response.body().getTable().get(0).getBase64string();
                            fileName = response.body().getTable().get(0).getFilename();
                            btnSave.setEnabled(false);
                            btnDownload.setEnabled(true);
                        } else {
                            Toast.makeText(StudentExamFormActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<InsertExamToStudentFromRegularExamFormAPIPojo> call, Throwable t) {
                        DialogUtil.hideProgressDialog();
                        Toast.makeText(StudentExamFormActivity.this, "Failed to insert exam!", Toast.LENGTH_SHORT).show();
                    }
                });
    }


}