package com.infinity.infoway.atmiya.student.exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForRegExamFormAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;

import java.util.ArrayList;

public class StudentExamFormAdapter extends RecyclerView.Adapter<StudentExamFormAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<GetStudentPaperListForRegExamFormAPIPojo.Table> studentExamFormFillListPojoArrayList;
    private ArrayList<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo.Table> forConfigPojoArrayList;
    private boolean isForConfiguration;
    private LayoutInflater layoutInflater;

    public StudentExamFormAdapter(Context context,
                                  boolean isForConfiguration,
                                  ArrayList<GetStudentPaperListForRegExamFormAPIPojo.Table> studentExamFormFillListPojoArrayList,
                                  ArrayList<GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo.Table> forConfigPojoArrayList) {
        this.context = context;
        this.studentExamFormFillListPojoArrayList = studentExamFormFillListPojoArrayList;
        this.forConfigPojoArrayList = forConfigPojoArrayList;
        this.isForConfiguration = isForConfiguration;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.inflater_studdent_exam_form_fill_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String courseName = "-";
        String courseCode = "-";
        if (isForConfiguration) {
            if (!CommonUtil.checkIsEmptyOrNullCommon(forConfigPojoArrayList.get(position).getPaperName())) {
                courseName = forConfigPojoArrayList.get(position).getPaperName() + "";
            }
            if (!CommonUtil.checkIsEmptyOrNullCommon(forConfigPojoArrayList.get(position).getPaperCode())) {
                courseCode = forConfigPojoArrayList.get(position).getPaperCode() + "";
            }
        } else {
            if (!CommonUtil.checkIsEmptyOrNullCommon(studentExamFormFillListPojoArrayList.get(position).getPaperName())) {
                courseName = studentExamFormFillListPojoArrayList.get(position).getPaperName() + "";
            }
            if (!CommonUtil.checkIsEmptyOrNullCommon(studentExamFormFillListPojoArrayList.get(position).getPaperCode())) {
                courseCode = studentExamFormFillListPojoArrayList.get(position).getPaperCode() + "";
            }
        }
        holder.tvCourseName.setText(courseName);
        holder.tvCourseCode.setText(courseCode);
    }

    @Override
    public int getItemCount() {
        return isForConfiguration ? forConfigPojoArrayList.size() : studentExamFormFillListPojoArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextViewRegularFont tvCourseName;
        private TextViewRegularFont tvCourseCode;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCourseName = itemView.findViewById(R.id.tvCourseName);
            tvCourseCode = itemView.findViewById(R.id.tvCourseCode);

        }
    }

}
