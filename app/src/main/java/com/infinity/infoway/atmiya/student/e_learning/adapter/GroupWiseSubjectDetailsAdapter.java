package com.infinity.infoway.atmiya.student.e_learning.adapter;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatImageView;

import com.infinity.infoway.atmiya.R;
import com.infinity.infoway.atmiya.custom_class.TextViewRegularFont;
import com.infinity.infoway.atmiya.student.e_learning.activity.ELearningActivity;
import com.infinity.infoway.atmiya.student.e_learning.pojo.LearningManagementGroupDetailsPojo;
import com.infinity.infoway.atmiya.utils.CommonUtil;
import com.infinity.infoway.atmiya.utils.DownloadPdfFromUrl;

import java.util.ArrayList;
import java.util.HashMap;

public class GroupWiseSubjectDetailsAdapter extends BaseExpandableListAdapter {

    private ELearningActivity context;
    private ArrayList<String> headerArrayList;
    private HashMap<String, ArrayList<LearningManagementGroupDetailsPojo.GroupDetailArray>> childListDetailsHashMap;
    private LayoutInflater layoutInflater;

    public GroupWiseSubjectDetailsAdapter(ELearningActivity context, ArrayList<String> headerArrayList,
                                          HashMap<String, ArrayList<LearningManagementGroupDetailsPojo.GroupDetailArray>> childListDetailsHashMap) {
        this.context = context;
        this.headerArrayList = headerArrayList;
        this.childListDetailsHashMap = childListDetailsHashMap;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getGroupCount() {
        return headerArrayList.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return childListDetailsHashMap.get(this.headerArrayList.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return headerArrayList.get(i);
    }

    @Override
    public Object getChild(int headerPosition, int expandedListPosition) {
        return childListDetailsHashMap.get(headerArrayList.get(headerPosition)).get(expandedListPosition);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int headerPosition, int expandedChildId) {
        return expandedChildId;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View view, ViewGroup viewGroup) {
        if (view == null) {
//            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.inflater_group_wise_subject_list_item, null);
        }

        String headerName = headerArrayList.get(groupPosition);

        TextViewRegularFont tvGroupNameGroupWiseSubjectList = view.findViewById(R.id.tvGroupNameGroupWiseSubjectList);
        AppCompatImageView ivViewMoreGroupWiseSubjectList = view.findViewById(R.id.ivViewMoreGroupWiseSubjectList);
        LinearLayout llExpandedGroupWiseSubjectList = view.findViewById(R.id.llExpandedGroupWiseSubjectList);
        TextViewRegularFont tvPostCount = view.findViewById(R.id.tvPostCount);

        tvPostCount.setText("Post : " + childListDetailsHashMap.get(headerName).size());

        tvGroupNameGroupWiseSubjectList.setText(headerName);

        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isExpanded, View view, ViewGroup viewGroup) {

        if (view == null) {
            view = layoutInflater.inflate(R.layout.group_wise_subject_details_child_list_item, null);
        }

        LearningManagementGroupDetailsPojo.GroupDetailArray groupDetailArray = childListDetailsHashMap.get(headerArrayList.get(groupPosition)).get(childPosition);

        TextViewRegularFont tvGroupWiseSubjectName = view.findViewById(R.id.tvGroupWiseSubjectName);
        TextViewRegularFont tvGroupWiseSubjectDate = view.findViewById(R.id.tvGroupWiseSubjectDate);
        TextViewRegularFont tvGroupWiseSubjectDescription = view.findViewById(R.id.tvGroupWiseSubjectDescription);
        LinearLayout llDownloadDocuments = view.findViewById(R.id.llDownloadDocuments);
        TextViewRegularFont btnDownloadGroupWiseSubjectDetails = view.findViewById(R.id.btnDownloadGroupWiseSubjectDetails);

        if (!CommonUtil.checkIsEmptyOrNullCommon(groupDetailArray.getFileSubName())) {
            tvGroupWiseSubjectName.setText(groupDetailArray.getFileSubName() + "");
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(groupDetailArray.getFileUploadDate())) {
            tvGroupWiseSubjectDate.setText(groupDetailArray.getFileUploadDate() + "");
        }

        try {
            if (!CommonUtil.checkIsEmptyOrNullCommon(groupDetailArray.getFileDesc())) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    tvGroupWiseSubjectDescription.setText(Html.fromHtml(groupDetailArray.getFileDesc() + "", Html.FROM_HTML_MODE_COMPACT));
                } else {
                    tvGroupWiseSubjectDescription.setText(Html.fromHtml(groupDetailArray.getFileDesc() + ""));
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (!CommonUtil.checkIsEmptyOrNullCommon(groupDetailArray.getFileUrl())) {
            llDownloadDocuments.setVisibility(View.VISIBLE);
            btnDownloadGroupWiseSubjectDetails.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String fileUrl = groupDetailArray.getFileUrl();
                    String fileExtension = fileUrl.substring(fileUrl.lastIndexOf("."));
                    new DownloadPdfFromUrl(context, groupDetailArray.getFileUrl().trim(), fileExtension, "E-Learning");
                }
            });
        } else {
            llDownloadDocuments.setVisibility(View.GONE);
        }


        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
