package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetStudentPaperListForRegExamFormForSubmitExamFormAPIPojo {

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

        @SerializedName("srno")
        @Expose
        private Integer srno;
        @SerializedName("Sub_Course_Type_Id")
        @Expose
        private Integer subCourseTypeId;
        @SerializedName("course_type")
        @Expose
        private String courseType;
        @SerializedName("swd_id")
        @Expose
        private Integer swdId;
        @SerializedName("swd_main_school_id")
        @Expose
        private Integer swdMainSchoolId;
        @SerializedName("swd_course_id")
        @Expose
        private Integer swdCourseId;
        @SerializedName("swd_year_id")
        @Expose
        private Integer swdYearId;
        @SerializedName("swd_sem_id")
        @Expose
        private Integer swdSemId;
        @SerializedName("swd_student_id")
        @Expose
        private Integer swdStudentId;
        @SerializedName("Stud_Enrollment_no")
        @Expose
        private String studEnrollmentNo;
        @SerializedName("Stud_admission_no")
        @Expose
        private String studAdmissionNo;
        @SerializedName("stud_name")
        @Expose
        private String studName;
        @SerializedName("programme")
        @Expose
        private String programme;
        @SerializedName("paper_id")
        @Expose
        private Integer paperId;
        @SerializedName("paper_code")
        @Expose
        private String paperCode;
        @SerializedName("paper_name")
        @Expose
        private String paperName;

        public Integer getSrno() {
            return srno;
        }

        public void setSrno(Integer srno) {
            this.srno = srno;
        }

        public Integer getSubCourseTypeId() {
            return subCourseTypeId;
        }

        public void setSubCourseTypeId(Integer subCourseTypeId) {
            this.subCourseTypeId = subCourseTypeId;
        }

        public String getCourseType() {
            return courseType;
        }

        public void setCourseType(String courseType) {
            this.courseType = courseType;
        }

        public Integer getSwdId() {
            return swdId;
        }

        public void setSwdId(Integer swdId) {
            this.swdId = swdId;
        }

        public Integer getSwdMainSchoolId() {
            return swdMainSchoolId;
        }

        public void setSwdMainSchoolId(Integer swdMainSchoolId) {
            this.swdMainSchoolId = swdMainSchoolId;
        }

        public Integer getSwdCourseId() {
            return swdCourseId;
        }

        public void setSwdCourseId(Integer swdCourseId) {
            this.swdCourseId = swdCourseId;
        }

        public Integer getSwdYearId() {
            return swdYearId;
        }

        public void setSwdYearId(Integer swdYearId) {
            this.swdYearId = swdYearId;
        }

        public Integer getSwdSemId() {
            return swdSemId;
        }

        public void setSwdSemId(Integer swdSemId) {
            this.swdSemId = swdSemId;
        }

        public Integer getSwdStudentId() {
            return swdStudentId;
        }

        public void setSwdStudentId(Integer swdStudentId) {
            this.swdStudentId = swdStudentId;
        }

        public String getStudEnrollmentNo() {
            return studEnrollmentNo;
        }

        public void setStudEnrollmentNo(String studEnrollmentNo) {
            this.studEnrollmentNo = studEnrollmentNo;
        }

        public String getStudAdmissionNo() {
            return studAdmissionNo;
        }

        public void setStudAdmissionNo(String studAdmissionNo) {
            this.studAdmissionNo = studAdmissionNo;
        }

        public String getStudName() {
            return studName;
        }

        public void setStudName(String studName) {
            this.studName = studName;
        }

        public String getProgramme() {
            return programme;
        }

        public void setProgramme(String programme) {
            this.programme = programme;
        }

        public Integer getPaperId() {
            return paperId;
        }

        public void setPaperId(Integer paperId) {
            this.paperId = paperId;
        }

        public String getPaperCode() {
            return paperCode;
        }

        public void setPaperCode(String paperCode) {
            this.paperCode = paperCode;
        }

        public String getPaperName() {
            return paperName;
        }

        public void setPaperName(String paperName) {
            this.paperName = paperName;
        }

    }

}
