package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InsertStudentPaperVerificationAPIPojo {

    @SerializedName("Table")
    @Expose
    private List<InsertStudentPaperVerificationAPIPojo.Table> table = null;

    public List<InsertStudentPaperVerificationAPIPojo.Table> getTable() {
        return table;
    }

    public void setTable(List<InsertStudentPaperVerificationAPIPojo.Table> table) {
        this.table = table;
    }

    public class Table {

        @SerializedName("base64string")
        @Expose
        private String base64string;
        @SerializedName("Filename")
        @Expose
        private String filename;
        @SerializedName("err_msg")
        @Expose
        private String errMsg;

        public String getBase64string() {
            return base64string;
        }

        public void setBase64string(String base64string) {
            this.base64string = base64string;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getErrMsg() {
            return errMsg;
        }

        public void setErrMsg(String errMsg) {
            this.errMsg = errMsg;
        }

    }


}
