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
import com.infinity.infoway.atmiya.student.exam.pojo.GetStudentPaperListForVerificationAPIPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;

import java.util.ArrayList;

public class StudentCourseSelectionForEditAdapter extends RecyclerView.Adapter<StudentCourseSelectionForEditAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<GetStudentPaperListForVerificationAPIPojo.Table> tableArrayList;
    private LayoutInflater layoutInflater;
    private IEditStudentCourseSelection iEditStudentCourseSelection;

    public StudentCourseSelectionForEditAdapter(Context context, ArrayList<GetStudentPaperListForVerificationAPIPojo.Table> tableArrayList) {
        this.context = context;
        this.tableArrayList = tableArrayList;
        iEditStudentCourseSelection = (IEditStudentCourseSelection) context;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_inflter_for_edit_course_selection, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        GetStudentPaperListForVerificationAPIPojo.Table table = tableArrayList.get(position);

        if (table.getSubCourseTypeId().toString().equalsIgnoreCase("1")) {
            holder.cbElectiveSub.setChecked(true);
            holder.cbElectiveSub.setEnabled(false);
        } else if (!table.getSubCourseTypeId().toString().equalsIgnoreCase("1") &&
                table.getIsSubSelected().toString().equalsIgnoreCase("1")) {
            holder.cbElectiveSub.setChecked(table.getIsSubSelected().toString().equalsIgnoreCase("1"));
            holder.cbElectiveSub.setEnabled(true);
        } else if (!table.getSubCourseTypeId().toString().equalsIgnoreCase("1") &&
                table.getIsSubSelected().toString().equalsIgnoreCase("0")) {
            holder.cbElectiveSub.setChecked(!table.getIsSubSelected().toString().equalsIgnoreCase("0"));
            holder.cbElectiveSub.setEnabled(true);
        }

        holder.cbElectiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table.setIsSubSelected(holder.cbElectiveSub.isChecked() ? 1 : 0);
                iEditStudentCourseSelection.onCourseEdited(holder.cbElectiveSub.isChecked(), table);
            }
        });

        if (!CommonUtil.checkIsEmptyOrNullCommon(table.getNameOfCourse())) {
            holder.tvCourseName.setText(table.getNameOfCourse());
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(table.getPaperCode())) {
            holder.tvCourseCode.setText(table.getPaperCode());
        }

    }

    @Override
    public int getItemCount() {
        return tableArrayList.size();
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

    public interface IEditStudentCourseSelection {
        void onCourseEdited(boolean isAdded, GetStudentPaperListForVerificationAPIPojo.Table table);
    }

}
