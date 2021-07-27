package com.infinity.infoway.atmiya.recent_notification_dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.api.ApiImplementer;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.utils.CommonUtil;
import com.infinity.infoway.atmiya.utils.DialogUtil;
import com.infinity.infoway.atmiya.utils.MySharedPreferences;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UnreadNotificationListAdapter extends RecyclerView.Adapter<UnreadNotificationListAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<GetImpNotificationPojo> getImpNotificationPojoArrayList;
    private LayoutInflater layoutInflater;
    private boolean isFromStudentSide;
    private MySharedPreferences mySharedPreferences;

    public UnreadNotificationListAdapter(Context context, ArrayList<GetImpNotificationPojo> getImpNotificationPojoArrayList,
                                         boolean isFromStudentSide) {
        this.context = context;
        mySharedPreferences = new MySharedPreferences(context);
        this.isFromStudentSide = isFromStudentSide;
        this.getImpNotificationPojoArrayList = getImpNotificationPojoArrayList;
        layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.layout_unread_notifiation_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        GetImpNotificationPojo getImpNotificationPojo = getImpNotificationPojoArrayList.get(position);

        if (!CommonUtil.checkIsEmptyOrNullCommon(getImpNotificationPojo.getAnnouncementDesc())) {
            holder.tvDesc.setText(getImpNotificationPojo.getAnnouncementDesc() + "");
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readNotificationApiCall(getImpNotificationPojo.getAnnouncementId() + "", position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return getImpNotificationPojoArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextViewRegularFont tvDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvDesc = itemView.findViewById(R.id.tvDesc);
        }
    }

    private void readNotificationApiCall(String announcement_id, int position) {

        String user_id = isFromStudentSide ? mySharedPreferences.getStudentId() : mySharedPreferences.getEmpId();
        String institute_id = isFromStudentSide ? mySharedPreferences.getInstituteId() : mySharedPreferences.getEmpInstituteId();
        String ann_for = isFromStudentSide ? CommonUtil.ANNOUNCEMENT_FOR_STUDENT : CommonUtil.ANNOUNCEMENT_FOR_FACULTY;

        DialogUtil.showProgressDialogNotCancelable(context, "");
        ApiImplementer.readImpNotificationApiImplementer(user_id, announcement_id, institute_id, ann_for, new Callback<ReadImpNotificationPojo>() {
            @Override
            public void onResponse(Call<ReadImpNotificationPojo> call, Response<ReadImpNotificationPojo> response) {
                DialogUtil.hideProgressDialog();
                if (response.isSuccessful() && response.body() != null && !CommonUtil.checkIsEmptyOrNullCommon(response.body().getResponse()) &&
                        response.body().getResponse().equalsIgnoreCase("1")) {
                    getImpNotificationPojoArrayList.remove(position);
                    notifyDataSetChanged();
                } else {
                    Toast.makeText(context, "Something went wrong,Please try again later.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ReadImpNotificationPojo> call, Throwable t) {
                DialogUtil.hideProgressDialog();
                Toast.makeText(context, "Request Failed:- " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}
