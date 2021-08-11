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
import com.infinity.infoway.atmiya.utils.ConnectionDetector;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

public class StudentExamFormActivity extends AppCompatActivity implements View.OnClickListener {

    private MySharedPreferences mySharedPreferences;
    private ConnectionDetector connectionDetector;
    private AppCompatImageView ivCloseExamForm;
    private LinearLayout llStudentExamForm, llExamFormProgressbar, llNoDataExamForm;
    private RecyclerView rvStudentExamForm;
    private MaterialButton btnSave, btnDownload;
    private TextViewRegularFont tvStudentName;
    private TextViewMediumFont tvProgramme;
    private TextViewMediumFont tvEnrollmentNo;
    private TextViewMediumFont tvAdmissionNo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_exam_form);
        initView();
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
        llExamFormProgressbar = findViewById(R.id.llExamFormProgressbar);
        llNoDataExamForm = findViewById(R.id.llNoDataExamForm);
        rvStudentExamForm = findViewById(R.id.rvStudentExamForm);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
        btnDownload = findViewById(R.id.btnDownload);
        btnDownload.setOnClickListener(this);
        btnSave.setEnabled(false);
        btnDownload.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ivCloseExamForm) {
            onBackPressed();
        } else if (v.getId() == R.id.btnSave) {

        } else if (v.getId() == R.id.btnDownload) {

        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

//    private void getSubjectListApiCall() {
//        //TODO REPLACE BELOW CODE WHENEVER API READY FOR COURSE SELECTION FROM KRISHNA MADAM
//        if (connectionDetector.isConnectingToInternet()) {
//            llStudentExamForm.setVisibility(View.GONE);
//            llExamFormProgressbar.setVisibility(View.VISIBLE);
//            llNoDataExamForm.setVisibility(View.GONE);
//            ApiImplementer.getStudentResultListApiImplementer(mySharedPreferences.getStudentEnrollmentNo(), new Callback<ArrayList<StudentReulstPojo>>() {
//                @Override
//                public void onResponse(Call<ArrayList<StudentReulstPojo>> call, Response<ArrayList<StudentReulstPojo>> response) {
//                    llExamFormProgressbar.setVisibility(View.GONE);
//                    if (response.isSuccessful() && response.body() != null &&
//                            response.body().size() > 0) {
//                        llStudentExamForm.setVisibility(View.VISIBLE);
//                        llNoDataExamForm.setVisibility(View.GONE);
//                        rvStudentExamForm.setAdapter(new StudentExamFormAdapter(StudentExamFormActivity.this, response.body()));
//                    } else {
//                        llStudentExamForm.setVisibility(View.GONE);
//                        llNoDataExamForm.setVisibility(View.VISIBLE);
//                    }
//                }
//
//                @Override
//                public void onFailure(Call<ArrayList<StudentReulstPojo>> call, Throwable t) {
//                    llStudentExamForm.setVisibility(View.GONE);
//                    llExamFormProgressbar.setVisibility(View.GONE);
//                    llNoDataExamForm.setVisibility(View.VISIBLE);
//                    Toast.makeText(StudentExamFormActivity.this, "Request Failed:- " + t.getMessage(), Toast.LENGTH_SHORT).show();
//                }
//            });
//        } else {
//            Toast.makeText(this, "No internet connection,please try again later", Toast.LENGTH_SHORT).show();
//        }
//    }

    private void saveExamFormApiCall() {

    }

    private void downloadExamFormApiCall() {

    }


}