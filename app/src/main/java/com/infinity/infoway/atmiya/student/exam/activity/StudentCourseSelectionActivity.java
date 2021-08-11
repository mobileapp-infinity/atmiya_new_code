package com.infinity.infoway.atmiya.student.exam.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewMediumFont;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.exam.adapter.CourseSelectionAdapter;
import com.infinity.infoway.atmiya.student.exam.pojo.CourseSelectionModel;
import com.infinity.infoway.atmiya.utils.ConnectionDetector;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentCourseSelectionActivity extends AppCompatActivity implements View.OnClickListener,
        CourseSelectionAdapter.IElectiveSubSelection {

    private MySharedPreferences mySharedPreferences;
    private ConnectionDetector connectionDetector;
    private AppCompatImageView ivCloseCourseSelection;
    private LinearLayout llStudentCourseSelection, llCourseSelectionProgressbar, llNoDataCourseSelection;
    private RecyclerView rvStudentCourseSelection;
    private HashMap<String, CourseSelectionModel> compulsoryCourseHashMap = new HashMap<>();
    private HashMap<String, CourseSelectionModel> electiveCourseHashMap = new HashMap<>();
    private MaterialButton btnSave, btnDownload;
    private TextViewRegularFont tvStudentName;
    private TextViewMediumFont tvProgramme;
    private TextViewMediumFont tvEnrollmentNo;
    private TextViewMediumFont tvAdmissionNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_course_selection);
        initView();
        getCourseListApiCall();
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
        llCourseSelectionProgressbar = findViewById(R.id.llCourseSelectionProgressbar);
        llNoDataCourseSelection = findViewById(R.id.llNoDataCourseSelection);
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
            saveCourseSelectionApiCall();
        } else if (v.getId() == R.id.btnDownload) {
            downloadApiCall();
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

    private void getCourseListApiCall() {
        //TODO REPLACE BELOW CODE WHENEVER API READY FOR COURSE SELECTION FROM KRISHNA MADAM
//        if (connectionDetector.isConnectingToInternet()) {
//            llStudentCourseSelection.setVisibility(View.GONE);
//            llCourseSelectionProgressbar.setVisibility(View.VISIBLE);
//            llNoDataCourseSelection.setVisibility(View.GONE);
//            ApiImplementer.getStudentResultListApiImplementer(mySharedPreferences.getStudentEnrollmentNo(), new Callback<ArrayList<StudentReulstPojo>>() {
//                @Override
//                public void onResponse(Call<ArrayList<StudentReulstPojo>> call, Response<ArrayList<StudentReulstPojo>> response) {
//                    llCourseSelectionProgressbar.setVisibility(View.GONE);
//                    if (response.isSuccessful() && response.body() != null &&
//                            response.body().size() > 0) {
//                        llStudentCourseSelection.setVisibility(View.VISIBLE);
//                        llNoDataCourseSelection.setVisibility(View.GONE);
//                        storeCompulsorySubIds(response.body());
//                        rvStudentCourseSelection.setAdapter(new CourseSelectionAdapter(StudentCourseSelectionActivity.this, response.body()));
//                    } else {
//                        llStudentCourseSelection.setVisibility(View.GONE);
//                        llNoDataCourseSelection.setVisibility(View.VISIBLE);
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<ArrayList<StudentReulstPojo>> call, Throwable t) {
//                    llStudentCourseSelection.setVisibility(View.GONE);
//                    llCourseSelectionProgressbar.setVisibility(View.GONE);
//                    llNoDataCourseSelection.setVisibility(View.VISIBLE);
//                    Toast.makeText(StudentCourseSelectionActivity.this, "Request Failed:- " + t.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            });
//        } else {
//            Toast.makeText(this, "No internet connection,please try again later", Toast.LENGTH_SHORT).show();
//        }
    }

    private void saveCourseSelectionApiCall() {
        //TODO API ENDING FROM KRISHNA MADAM
    }

    private void downloadApiCall() {
        //TODO API ENDING FROM KRISHNA MADAM
    }

}