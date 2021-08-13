package com.infinity.infoway.atmiya.student.exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.exam.pojo.CheckExistsStudentPaperVerificationAPIPojo;
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForVerificationAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;

import java.util.ArrayList;

public class CourseSelectionAdapter extends RecyclerView.Adapter<CourseSelectionAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<CheckExistsStudentPaperVerificationAPIPojo.Table> checkExistStudentPaperArrayList;
    private ArrayList<GetStudentPaperListForVerificationAPIPojo.Table> studentPaperListForConfigArrayList;
    private LayoutInflater layoutInflater;
    private boolean isForCheckExist;
    private IElectiveSubSelection iElectiveSubSelection;
    private boolean isNeedToDisplayCheckBox;

    public CourseSelectionAdapter(Context context,
                                  ArrayList<CheckExistsStudentPaperVerificationAPIPojo.Table> checkExistStudentPaperArrayList,
                                  ArrayList<GetStudentPaperListForVerificationAPIPojo.Table> studentPaperListForConfigArrayList,
                                  boolean isForCheckExist,
                                  boolean isNeedToDisplayCheckBox) {
        this.context = context;
        this.checkExistStudentPaperArrayList = checkExistStudentPaperArrayList;
        this.studentPaperListForConfigArrayList = studentPaperListForConfigArrayList;
        this.isForCheckExist = isForCheckExist;
        this.isNeedToDisplayCheckBox = isNeedToDisplayCheckBox;
        iElectiveSubSelection = (IElectiveSubSelection) context;
        layoutInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public CourseSelectionAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_inflater_student_course_selection, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseSelectionAdapter.MyViewHolder holder, int position) {
        if (isForCheckExist) {
            holder.cbElectiveSub.setVisibility(View.GONE);

            CheckExistsStudentPaperVerificationAPIPojo.Table table = checkExistStudentPaperArrayList.get(position);

            if (!CommonUtil.checkIsEmptyOrNullCommon(table.getNameOfCourse())) {
                holder.tvCourseName.setText(table.getNameOfCourse());
            }

            if (!CommonUtil.checkIsEmptyOrNullCommon(table.getPaperCode())) {
                holder.tvCourseCode.setText(table.getPaperCode());
            }
        } else {
            GetStudentPaperListForVerificationAPIPojo.Table configPojo = studentPaperListForConfigArrayList.get(position);

            if (isNeedToDisplayCheckBox) {
                holder.cbElectiveSub.setVisibility(View.VISIBLE);
                if (configPojo.getSubCourseTypeId().toString().equalsIgnoreCase("1")) {
                    holder.cbElectiveSub.setChecked(true);
                    holder.cbElectiveSub.setEnabled(false);
                } else {
                    holder.cbElectiveSub.setChecked(configPojo.getSubCourseTypeId().toString().equalsIgnoreCase("1"));
                    holder.cbElectiveSub.setEnabled(true);
                }
                holder.cbElectiveSub.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        iElectiveSubSelection.onElectiveSubSelected(holder.cbElectiveSub.isChecked(), configPojo);
                    }
                });
            }else{
                holder.cbElectiveSub.setVisibility(View.GONE);
            }

            if (!CommonUtil.checkIsEmptyOrNullCommon(configPojo.getNameOfCourse())) {
                holder.tvCourseName.setText(configPojo.getNameOfCourse());
            }

            if (!CommonUtil.checkIsEmptyOrNullCommon(configPojo.getPaperCode())) {
                holder.tvCourseCode.setText(configPojo.getPaperCode());
            }

        }
    }

    @Override
    public int getItemCount() {
        return isForCheckExist ? checkExistStudentPaperArrayList.size() :
        studentPaperListForConfigArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private MaterialCardView cvCourseSelection;
        private AppCompatCheckBox cbElectiveSub;
        private TextViewRegularFont tvCourseName;
        private TextViewRegularFont tvCourseCode;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cvCourseSelection = itemView.findViewById(R.id.cvCourseSelection);
            cbElectiveSub = itemView.findViewById(R.id.cbElectiveSub);
            tvCourseName = itemView.findViewById(R.id.tvCourseName);
            tvCourseCode = itemView.findViewById(R.id.tvCourseCode);
        }
    }

    public interface IElectiveSubSelection {
        void onElectiveSubSelected(boolean isSelected, GetStudentPaperListForVerificationAPIPojo.Table courseSelectionModel);
    }
}
