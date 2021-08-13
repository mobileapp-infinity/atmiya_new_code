package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetGrantTermConfigurationForStudentRegExamFormAPIPojo {

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

        @SerializedName("gtc_id")
        @Expose
        private Integer gtcId;
        @SerializedName("gtc_year_id")
        @Expose
        private Integer gtcYearId;
        @SerializedName("gtc_college_id")
        @Expose
        private Integer gtcCollegeId;
        @SerializedName("gtc_degree_id")
        @Expose
        private Integer gtcDegreeId;
        @SerializedName("gtc_sem_id")
        @Expose
        private Integer gtcSemId;

        public Integer getGtcId() {
            return gtcId;
        }

        public void setGtcId(Integer gtcId) {
            this.gtcId = gtcId;
        }

        public Integer getGtcYearId() {
            return gtcYearId;
        }

        public void setGtcYearId(Integer gtcYearId) {
            this.gtcYearId = gtcYearId;
        }

        public Integer getGtcCollegeId() {
            return gtcCollegeId;
        }

        public void setGtcCollegeId(Integer gtcCollegeId) {
            this.gtcCollegeId = gtcCollegeId;
        }

        public Integer getGtcDegreeId() {
            return gtcDegreeId;
        }

        public void setGtcDegreeId(Integer gtcDegreeId) {
            this.gtcDegreeId = gtcDegreeId;
        }

        public Integer getGtcSemId() {
            return gtcSemId;
        }

        public void setGtcSemId(Integer gtcSemId) {
            this.gtcSemId = gtcSemId;
        }

    }

}
