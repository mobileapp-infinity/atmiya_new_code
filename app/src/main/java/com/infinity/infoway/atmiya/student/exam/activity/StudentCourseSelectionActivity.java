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
import com.infinity.infoway.atmiya.student.exam.adapter.CourseSelectionAdapter;
import com.infinity.infoway.atmiya.student.exam.pojo.CheckExistsStudentPaperVerificationAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.CourseSelectionModel;
import com.infinity.infoway.atmiya.student.exam.pojo.GetGrantTermConfigurationForStudentRegExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForVerificationAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.InsertStudentPaperVerificationAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;
import com.infinity.infoway.atmiya.utils.ConnectionDetector;
import com.infinity.infoway.atmiya.utils.DialogUtil;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

import java.util.ArrayList;
import java.util.HashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentCourseSelectionActivity extends AppCompatActivity implements View.OnClickListener,
        CourseSelectionAdapter.IElectiveSubSelection {

    private MySharedPreferences mySharedPreferences;
    private ConnectionDetector connectionDetector;
    private AppCompatImageView ivCloseCourseSelection;
    private LinearLayout llStudentCourseSelection;
    private RecyclerView rvStudentCourseSelection;
    private HashMap<String, CourseSelectionModel> compulsoryCourseHashMap = new HashMap<>();
    private HashMap<String, CourseSelectionModel> electiveCourseHashMap = new HashMap<>();
    private MaterialButton btnSave, btnDownload;
    private TextViewRegularFont tvStudentName;
    private TextViewMediumFont tvProgramme;
    private TextViewMediumFont tvEnrollmentNo;
    private TextViewMediumFont tvAdmissionNo;
    private FrameLayout flSaveAndDownloadBtn;
    private String fileName = "__";
    private String base64String = "";
    private String spv_stud_id = "";
    private String spv_sem_id = "";
    private String spv_paper_id = "";
    private String spv_created_by = "";
    private String spv_created_ip = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_course_selection);
        initView();
        checkStudentExistForPaperVerificationApiCall();
    }

    private void initView() {
        mySharedPreferences = new MySharedPreferences(StudentCourseSelectionActivity.this);
        connectionDetector = new ConnectionDetector(StudentCourseSelectionActivity.this);
        ivCloseCourseSelection = findViewById(R.id.ivCloseCourseSelection);
        ivCloseCourseSelection.setOnClickListener(this);
        tvStudentName = findViewById(R.id.tvStudentName);
        tvProgramme = findViewById(R.id.tvProgramme);
        tvEnrollmentNo = findViewById(R.id.tvEnrollmentNo);
        tvAdmissionNo = findViewById(R.id.tvAdmissionNo);
        llStudentCourseSelection = findViewById(R.id.llStudentCourseSelection);
        flSaveAndDownloadBtn = findViewById(R.id.flSaveAndDownloadBtn);
        rvStudentCourseSelection = findViewById(R.id.rvStudentCourseSelection);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnDownload = findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(this);
        btnSave.setEnabled(false);
        btnDownload.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivCloseCourseSelection) {
            onBackPressed();
        } else if (v.getId() == R.id.btnSave) {
        } else if (v.getId() == R.id.btnDownload) {
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onElectiveSubSelected(boolean isSelected, CourseSelectionModel courseSelectionModel) {
        String key_compulsory_sub = courseSelectionModel.getCourseName() + "_" + courseSelectionModel.getId();
        if (isSelected) {
            electiveCourseHashMap.put(key_compulsory_sub, courseSelectionModel);
        } else {
            electiveCourseHashMap.remove(key_compulsory_sub);
        }
        if (electiveCourseHashMap != null && electiveCourseHashMap.size() > 0) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    private void storeCompulsorySubIds(ArrayList<CourseSelectionModel> courseSelectionModelArrayList) {
        for (int i = 0; i < courseSelectionModelArrayList.size(); i++) {
            CourseSelectionModel courseSelectionModel = courseSelectionModelArrayList.get(i);
            if (courseSelectionModel.isCompulsory()) {
                String key_compulsory_sub = courseSelectionModel.getCourseName() + "_" + courseSelectionModel.getId();
                compulsoryCourseHashMap.put(key_compulsory_sub, courseSelectionModel);
            }
        }
    }

    private void checkStudentExistForPaperVerificationApiCall() {
        DialogUtil.showProgressDialogNotCancelable(StudentCourseSelectionActivity.this, "");
        ApiImplementer.checkExistForPaperVerificationApiImplementer(mySharedPreferences.getStudentId(), new Callback<CheckExistsStudentPaperVerificationAPIPojo>() {
            @Override
            public void onResponse(Call<CheckExistsStudentPaperVerificationAPIPojo> call, Response<CheckExistsStudentPaperVerificationAPIPojo> response) {
                if (response.isSuccessful() && response.body() != null && response.body().getTable() != null) {
                    if (response.body().getTable().size() > 0) {

                    } else {

                    }
                } else {
                    Toast.makeText(StudentCourseSelectionActivity.this, "Something went wrong,Please try agin later.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<CheckExistsStudentPaperVerificationAPIPojo> call, Throwable t) {
                DialogUtil.hideProgressDialog();
                Toast.makeText(StudentCourseSelectionActivity.this, "Failed to check student paper verification!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getGrantTermConfigurationApiCall(boolean isPdShow, boolean isPdHide) {
        if (isPdShow) {
            DialogUtil.showProgressDialogNotCancelable(StudentCourseSelectionActivity.this, "");
        }
        ApiImplementer.getGrantTermConfigurationForStudentApiImplementer(mySharedPreferences.getSmId(), "0", new Callback<GetGrantTermConfigurationForStudentRegExamFormAPIPojo>() {
            @Override
            public void onResponse(Call<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> call, Response<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> response) {
                if (isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                if (response.isSuccessful() && response.body() != null && response.body().getTable() != null) {
                    if (response.body().getTable().size() > 0) {

                    } else {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentCourseSelectionActivity.this, "Your term was not granted. Please contact your Head of Department.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    if (!isPdHide) {
                        DialogUtil.hideProgressDialog();
                    }
                    Toast.makeText(StudentCourseSelectionActivity.this, "Something went wrong,Please try again later!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetGrantTermConfigurationForStudentRegExamFormAPIPojo> call, Throwable t) {
                if (!isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                Toast.makeText(StudentCourseSelectionActivity.this, "Failed to get configuration!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getStudentPaperListForVerificationApiCall(boolean isPdShow, boolean isPdHide) {
        if (isPdShow) {
            DialogUtil.showProgressDialogNotCancelable(StudentCourseSelectionActivity.this, "");
        }
        ApiImplementer.getStudentPaperListForVerificationApiImplementer(mySharedPreferences.getStudentId(), new Callback<GetStudentPaperListForVerificationAPIPojo>() {
            @Override
            public void onResponse(Call<GetStudentPaperListForVerificationAPIPojo> call, Response<GetStudentPaperListForVerificationAPIPojo> response) {
                if (isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                if (response.isSuccessful() && response.body() != null && response.body().getTable() != null &&
                        response.body().getTable().size() > 0) {
                    GetStudentPaperListForVerificationAPIPojo.Table table = response.body().getTable().get(0);
                    if (!CommonUtil.checkIsEmptyOrNullCommon(table.getSemesterAllSubjectIsCompulsory()) &&
                            table.getSemesterAllSubjectIsCompulsory().toString().equalsIgnoreCase("1")) {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentCourseSelectionActivity.this, "'Course is submitted. Please click on download button to download receipt.", Toast.LENGTH_SHORT).show();
                    } else {

                    }
                } else {
                    if (!isPdHide) {
                        DialogUtil.hideProgressDialog();
                    }
                    Toast.makeText(StudentCourseSelectionActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<GetStudentPaperListForVerificationAPIPojo> call, Throwable t) {
                if (!isPdHide) {
                    DialogUtil.hideProgressDialog();
                }
                Toast.makeText(StudentCourseSelectionActivity.this, "Failed to get student verification paper list.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void insertCourseSelectionApiCall(RequestBody spv_stud_id, RequestBody spv_sem_id,
                                            RequestBody spv_paper_id, RequestBody spv_created_by,
                                            RequestBody spv_created_ip) {
        DialogUtil.showProgressDialogNotCancelable(StudentCourseSelectionActivity.this, "");
        ApiImplementer.insertStudentPaperVerificationApiImplementer(spv_stud_id, spv_sem_id,
                spv_paper_id, spv_created_by, spv_created_ip, new Callback<InsertStudentPaperVerificationAPIPojo>() {
                    @Override
                    public void onResponse(Call<InsertStudentPaperVerificationAPIPojo> call, Response<InsertStudentPaperVerificationAPIPojo> response) {
                        DialogUtil.hideProgressDialog();
                        if (response.isSuccessful() && response.body() != null && response.body().getTable() != null
                                && response.body().getTable().size() > 0) {

                        } else {
                            Toast.makeText(StudentCourseSelectionActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<InsertStudentPaperVerificationAPIPojo> call, Throwable t) {
                        DialogUtil.hideProgressDialog();
                        Toast.makeText(StudentCourseSelectionActivity.this, "Failed to insert student course selection!", Toast.LENGTH_SHORT).show();
                    }
                });
    }


}