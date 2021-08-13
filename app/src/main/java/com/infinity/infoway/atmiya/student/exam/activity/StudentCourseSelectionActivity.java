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
import com.infinity.infoway.atmiya.student.exam.pojo.GetGrantTermConfigurationForStudentRegExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForVerificationAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.InsertStudentPaperVerificationAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;
import com.infinity.infoway.atmiya.utils.ConnectionDetector;
import com.infinity.infoway.atmiya.utils.DialogUtil;
import com.infinity.infoway.atmiya.utils.GeneratePDFFileFromBase64String;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

import okhttp3.MediaType;
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
    private HashMap<String, GetStudentPaperListForVerificationAPIPojo.Table> compulsoryCourseHashMap = new HashMap<>();
    private HashMap<String, GetStudentPaperListForVerificationAPIPojo.Table> electiveCourseHashMap = new HashMap<>();
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
            RequestBody req_spv_stud_id = RequestBody.create(MediaType.parse("text/plain"), spv_stud_id);
            RequestBody req_spv_sem_id = RequestBody.create(MediaType.parse("text/plain"), spv_sem_id);
            RequestBody req_spv_paper_id = RequestBody.create(MediaType.parse("text/plain"), spv_paper_id);
            RequestBody req_spv_created_by = RequestBody.create(MediaType.parse("text/plain"), spv_created_by);
            RequestBody req_spv_created_ip = RequestBody.create(MediaType.parse("text/plain"), spv_created_ip);

            JSONArray item_array = new JSONArray();
            for (String dateKey : compulsoryCourseHashMap.keySet()) {
                JSONObject jsonObject = new JSONObject();
                GetStudentPaperListForVerificationAPIPojo.Table table = compulsoryCourseHashMap.get(dateKey);
                try {
                    jsonObject.put("spv_stud_id", table.getSwdStudentId());
                    jsonObject.put("spv_sem_id", table.getSwdSemId());
                    jsonObject.put("spv_paper_id", table.getPaperId());
                    jsonObject.put("spv_created_by", String.valueOf(table.getSwdStudentId()));
                    jsonObject.put("spv_created_ip", "0");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                item_array.put(jsonObject);
            }

            for (String dateKey : electiveCourseHashMap.keySet()) {
                JSONObject jsonObject = new JSONObject();
                GetStudentPaperListForVerificationAPIPojo.Table table = electiveCourseHashMap.get(dateKey);
                try {
                    jsonObject.put("spv_stud_id", table.getSwdStudentId());
                    jsonObject.put("spv_sem_id", table.getSwdSemId());
                    jsonObject.put("spv_paper_id", table.getPaperId());
                    jsonObject.put("spv_created_by", String.valueOf(table.getSwdStudentId()));
                    jsonObject.put("spv_created_ip", "0");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                item_array.put(jsonObject);
            }
            String jsonString = item_array.toString();
            insertCourseSelectionApiCall(req_spv_stud_id, req_spv_sem_id, req_spv_paper_id,
                    req_spv_created_by, req_spv_created_ip);

        } else if (v.getId() == R.id.btnDownload) {
            if (!CommonUtil.checkIsEmptyOrNullCommon(base64String)) {
                new GeneratePDFFileFromBase64String(StudentCourseSelectionActivity.this, "Course Selection", CommonUtil.generateUniqueFileName(fileName), base64String);
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onElectiveSubSelected(boolean isSelected, GetStudentPaperListForVerificationAPIPojo.Table courseSelectionModel) {
        String key_compulsory_sub = courseSelectionModel.getNameOfCourse() + "_" + courseSelectionModel.getPaperId();
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

    private void storeCompulsorySubIds(ArrayList<GetStudentPaperListForVerificationAPIPojo.Table> courseSelectionModelArrayList) {
        for (int i = 0; i < courseSelectionModelArrayList.size(); i++) {
            GetStudentPaperListForVerificationAPIPojo.Table courseSelectionModel = courseSelectionModelArrayList.get(i);
            if (courseSelectionModel.getSubCourseTypeId().toString().equalsIgnoreCase("1")) {
                String key_compulsory_sub = courseSelectionModel.getNameOfCourse() + "_" + courseSelectionModel.getPaperId();
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
                        DialogUtil.hideProgressDialog();
                        CheckExistsStudentPaperVerificationAPIPojo.Table table = response.body().getTable().get(0);
                        fileName = table.getFilename();
                        base64String = table.getBase64string();
                        llStudentCourseSelection.setVisibility(View.VISIBLE);
                        flSaveAndDownloadBtn.setVisibility(View.VISIBLE);
                        btnSave.setEnabled(false);
                        btnDownload.setEnabled(true);
                        setStudentData(table.getStudName(), table.getProgramme(), table.getStudEnrollmentNo(), table.getStudAdmissionNo());
                        rvStudentCourseSelection.setAdapter(new CourseSelectionAdapter(StudentCourseSelectionActivity.this,
                                (ArrayList<CheckExistsStudentPaperVerificationAPIPojo.Table>) response.body().getTable(), null, false,
                                false));
                        Toast.makeText(StudentCourseSelectionActivity.this, "Course is submitted. Please click on download button to download receipt.", Toast.LENGTH_SHORT).show();
                    } else {
                        getGrantTermConfigurationApiCall(false, false);
                    }
                } else {
                    Toast.makeText(StudentCourseSelectionActivity.this, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
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
                        getStudentPaperListForVerificationApiCall(false, true);
                    } else {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentCourseSelectionActivity.this, "Course Verification date is locked.", Toast.LENGTH_SHORT).show();
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
                if (response.isSuccessful() && response.body() != null && response.body().getTable() != null) {
                    if (response.body().getTable().size() > 0) {
                        storeCompulsorySubIds((ArrayList<GetStudentPaperListForVerificationAPIPojo.Table>) response.body().getTable());
                        GetStudentPaperListForVerificationAPIPojo.Table table = response.body().getTable().get(0);
                        spv_stud_id = table.getSwdStudentId() + "";
                        spv_sem_id = table.getSwdSemId() + "";
                        spv_paper_id = table.getPaperId() + "";
                        spv_created_by = table.getSwdStudentId() + "";
                        spv_created_ip = "0";
                        setStudentData(table.getStudName(), table.getProgramme(), table.getStudEnrollmentNo(), table.getStudAdmissionNo());
                        if (!CommonUtil.checkIsEmptyOrNullCommon(table.getSemesterAllSubjectIsCompulsory()) &&
                                table.getSemesterAllSubjectIsCompulsory().toString().equalsIgnoreCase("1")) {
                            if (!isPdHide) {
                                DialogUtil.hideProgressDialog();
                            }
                            fileName = table.getFilename();
                            base64String = table.getBase64string();
                            llStudentCourseSelection.setVisibility(View.VISIBLE);
                            flSaveAndDownloadBtn.setVisibility(View.VISIBLE);
                            btnSave.setEnabled(false);
                            btnDownload.setEnabled(true);
                            rvStudentCourseSelection.setAdapter(new CourseSelectionAdapter(StudentCourseSelectionActivity.this,
                                    null, (ArrayList<GetStudentPaperListForVerificationAPIPojo.Table>) response.body().getTable(),
                                    true, false));
                            Toast.makeText(StudentCourseSelectionActivity.this, "Course is submitted. Please click on download button to download receipt.", Toast.LENGTH_SHORT).show();
                        } else {
                            llStudentCourseSelection.setVisibility(View.VISIBLE);
                            flSaveAndDownloadBtn.setVisibility(View.VISIBLE);
                            btnSave.setEnabled(true);
                            btnDownload.setEnabled(false);
                            rvStudentCourseSelection.setAdapter(new CourseSelectionAdapter(StudentCourseSelectionActivity.this,
                                    null, (ArrayList<GetStudentPaperListForVerificationAPIPojo.Table>) response.body().getTable(),
                                    true, true));
                        }
                    } else {
                        if (!isPdHide) {
                            DialogUtil.hideProgressDialog();
                        }
                        Toast.makeText(StudentCourseSelectionActivity.this, "Course not found!", Toast.LENGTH_SHORT).show();
                        finish();
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
                            InsertStudentPaperVerificationAPIPojo.Table table = response.body().getTable().get(0);
                            fileName = table.getFilename();
                            base64String = table.getBase64string();
                            btnSave.setEnabled(false);
                            btnDownload.setEnabled(true);
                            Toast.makeText(StudentCourseSelectionActivity.this, "" + table.getErrMsg(), Toast.LENGTH_SHORT).show();
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