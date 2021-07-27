package com.infinity.infoway.atmiya.recent_notification_dialog;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetImpNotificationPojo {

    @SerializedName("announcement_id")
    @Expose
    private Integer announcementId;
    @SerializedName("announcement_desc")
    @Expose
    private String announcementDesc;

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementDesc() {
        return announcementDesc;
    }

    public void setAnnouncementDesc(String announcementDesc) {
        this.announcementDesc = announcementDesc;
    }

}
