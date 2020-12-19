package com.infinity.infoway.atmiya.login.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.login.pojo.RegisterStudentDetailsModel;
import com.infinity.infoway.atmiya.utils.CommonUtil;

import java.util.ArrayList;

public class LoginUserListAdapter extends RecyclerView.Adapter<LoginUserListAdapter.MyViewHolder> {

    Context context;
    ArrayList<RegisterStudentDetailsModel> registerStudentDetailsModelArrayList;
    LayoutInflater layoutInflater;
    IOnLoggedInStudentItemClicked iOnLoggedInStudentItemClicked;

    public LoginUserListAdapter(Context context, ArrayList<RegisterStudentDetailsModel> registerStudentDetailsModelArrayList) {
        this.context = context;
        this.registerStudentDetailsModelArrayList = registerStudentDetailsModelArrayList;
        layoutInflater = LayoutInflater.from(context);
        iOnLoggedInStudentItemClicked = (IOnLoggedInStudentItemClicked) context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.inflater_login_user_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (!CommonUtil.checkIsEmptyOrNullCommon(registerStudentDetailsModelArrayList.get(position).getStuEnrollmentNo()) &&
                !CommonUtil.checkIsEmptyOrNullCommon(registerStudentDetailsModelArrayList.get(position).getStuPassword())) {
            holder.tvLoggedInStudentName.setText(registerStudentDetailsModelArrayList.get(position).getStudentName());
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!CommonUtil.checkIsEmptyOrNullCommon(registerStudentDetailsModelArrayList.get(position).getStuEnrollmentNo()) &&
                        !CommonUtil.checkIsEmptyOrNullCommon(registerStudentDetailsModelArrayList.get(position).getStuPassword())) {
                    iOnLoggedInStudentItemClicked.onStudentItemClick(registerStudentDetailsModelArrayList.get(position).getStudentName(),
                            registerStudentDetailsModelArrayList.get(position).getStuEnrollmentNo(),
                            registerStudentDetailsModelArrayList.get(position).getStuPassword());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return registerStudentDetailsModelArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextViewRegularFont tvLoggedInStudentName;
        public LinearLayout view_background, view_foreground;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view_background = itemView.findViewById(R.id.view_background);
            view_foreground = itemView.findViewById(R.id.view_foreground);
            tvLoggedInStudentName = itemView.findViewById(R.id.tvLoggedInStudentName);
        }
    }

    public interface IOnLoggedInStudentItemClicked {
        void onStudentItemClick(String studentName, String studentUserName, String studentPassword);
    }

}
