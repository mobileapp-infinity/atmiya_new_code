package com.infinity.infoway.atmiya.student.exam.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.exam.pojo.StudentExamFormFillListPojo;

import java.util.ArrayList;

public class StudentExamFormAdapter extends RecyclerView.Adapter<StudentExamFormAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<StudentExamFormFillListPojo> studentExamFormFillListPojoArrayList;
    private LayoutInflater layoutInflater;

    public StudentExamFormAdapter(Context context, ArrayList<StudentExamFormFillListPojo> studentExamFormFillListPojoArrayList) {
        this.context = context;
        this.studentExamFormFillListPojoArrayList = studentExamFormFillListPojoArrayList;
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
        StudentExamFormFillListPojo studentExamFormFillListPojo = studentExamFormFillListPojoArrayList.get(position);

//        if (!CommonUtil.checkIsEmptyOrNullCommon(studentExamFormFillListPojo.getSomething)){
//           holder.tvCourseName.setText();
//        }
//
//        if (!CommonUtil.checkIsEmptyOrNullCommon(studentExamFormFillListPojo.getSomething)){
//            holder.tvCourseCode.setText();
//        }
    }

    @Override
    public int getItemCount() {
        return studentExamFormFillListPojoArrayList.size();
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
