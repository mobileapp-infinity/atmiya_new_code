package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CheckIsStudentFromAtmiyaUniOrNotPojo {

    @SerializedName("Table")
    @Expose
    private List<Table> table = null;

    public List<Table> getTable() {
        return table;
    }

    public void setTable(List<Table> table) {
        this.table = table;
    }

    public class Table {

        @SerializedName("stud_id")
        @Expose
        private Integer studId;
        @SerializedName("ac_id")
        @Expose
        private Integer acId;

        public Integer getStudId() {
            return studId;
        }

        public void setStudId(Integer studId) {
            this.studId = studId;
        }

        public Integer getAcId() {
            return acId;
        }

        public void setAcId(Integer acId) {
            this.acId = acId;
        }

    }
}
