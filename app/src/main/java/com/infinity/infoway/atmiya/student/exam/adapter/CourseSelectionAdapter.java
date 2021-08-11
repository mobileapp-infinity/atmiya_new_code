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
import com.infinity.infoway.atmiya.student.exam.pojo.CourseSelectionModel;
import com.infinity.infoway.atmiya.utils.CommonUtil;

import java.util.ArrayList;

public class CourseSelectionAdapter extends RecyclerView.Adapter<CourseSelectionAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<CourseSelectionModel> courseSelectionModelArrayList;
    private LayoutInflater layoutInflater;
    private IElectiveSubSelection iElectiveSubSelection;

    public CourseSelectionAdapter(Context context, ArrayList<CourseSelectionModel> courseSelectionModelArrayList) {
        this.context = context;
        this.courseSelectionModelArrayList = courseSelectionModelArrayList;
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
        CourseSelectionModel courseSelectionModel = courseSelectionModelArrayList.get(position);

        if (courseSelectionModel.isCompulsory()) {
            holder.cbElectiveSub.setChecked(courseSelectionModel.isCompulsory());
            holder.cbElectiveSub.setEnabled(false);
        } else {
            holder.cbElectiveSub.setChecked(courseSelectionModel.isElectiveSelected());
            holder.cbElectiveSub.setEnabled(true);
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(courseSelectionModel.getCourseName())) {
            holder.tvCourseName.setText(courseSelectionModel.getCourseName());
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(courseSelectionModel.getCourseCode())) {
            holder.tvCourseCode.setText(courseSelectionModel.getCourseCode());
        }

        holder.cbElectiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                courseSelectionModel.setElectiveSelected(holder.cbElectiveSub.isChecked());
                iElectiveSubSelection.onElectiveSubSelected(holder.cbElectiveSub.isChecked(), courseSelectionModel);
            }
        });

    }

    @Override
    public int getItemCount() {
        return courseSelectionModelArrayList.size();
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
        void onElectiveSubSelected(boolean isSelected, CourseSelectionModel courseSelectionModel);
    }
}
