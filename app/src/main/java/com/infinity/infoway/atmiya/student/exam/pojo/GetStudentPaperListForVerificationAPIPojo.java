package com.infinity.infoway.atmiya.student.exam.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetStudentPaperListForVerificationAPIPojo {

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

        @SerializedName("Title")
        @Expose
        private String title;
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
        @SerializedName("stud_enrollment_no")
        @Expose
        private String studEnrollmentNo;
        @SerializedName("stud_admission_no")
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
        @SerializedName("semester_all_subject_is_compulsory")
        @Expose
        private Integer semesterAllSubjectIsCompulsory;
        @SerializedName("spv_id")
        @Expose
        private Integer spvId;
        @SerializedName("Name_of_Institute")
        @Expose
        private String nameOfInstitute;
        @SerializedName("Name_of_College")
        @Expose
        private String nameOfCollege;
        @SerializedName("Name_of_Faculty")
        @Expose
        private String nameOfFaculty;
        @SerializedName("Name_of_Course")
        @Expose
        private String nameOfCourse;
        @SerializedName("Name_of_Semester")
        @Expose
        private String nameOfSemester;
        @SerializedName("Name_of_Department")
        @Expose
        private String nameOfDepartment;
        @SerializedName("Name_of_Division")
        @Expose
        private String nameOfDivision;
        @SerializedName("Name_of_Batch")
        @Expose
        private String nameOfBatch;
        @SerializedName("Name_of_Subject")
        @Expose
        private String nameOfSubject;
        @SerializedName("institute_logo_path")
        @Expose
        private String instituteLogoPath;
        @SerializedName("ac_full_name")
        @Expose
        private String acFullName;
        @SerializedName("im_full_name")
        @Expose
        private String imFullName;
        @SerializedName("college_logo_path")
        @Expose
        private String collegeLogoPath;
        @SerializedName("institute_logo")
        @Expose
        private String instituteLogo;
        @SerializedName("college_logo")
        @Expose
        private String collegeLogo;
        @SerializedName("base64string")
        @Expose
        private String base64string;
        @SerializedName("Filename")
        @Expose
        private String filename;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

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

        public Integer getSemesterAllSubjectIsCompulsory() {
            return semesterAllSubjectIsCompulsory;
        }

        public void setSemesterAllSubjectIsCompulsory(Integer semesterAllSubjectIsCompulsory) {
            this.semesterAllSubjectIsCompulsory = semesterAllSubjectIsCompulsory;
        }

        public Integer getSpvId() {
            return spvId;
        }

        public void setSpvId(Integer spvId) {
            this.spvId = spvId;
        }

        public String getNameOfInstitute() {
            return nameOfInstitute;
        }

        public void setNameOfInstitute(String nameOfInstitute) {
            this.nameOfInstitute = nameOfInstitute;
        }

        public String getNameOfCollege() {
            return nameOfCollege;
        }

        public void setNameOfCollege(String nameOfCollege) {
            this.nameOfCollege = nameOfCollege;
        }

        public String getNameOfFaculty() {
            return nameOfFaculty;
        }

        public void setNameOfFaculty(String nameOfFaculty) {
            this.nameOfFaculty = nameOfFaculty;
        }

        public String getNameOfCourse() {
            return nameOfCourse;
        }

        public void setNameOfCourse(String nameOfCourse) {
            this.nameOfCourse = nameOfCourse;
        }

        public String getNameOfSemester() {
            return nameOfSemester;
        }

        public void setNameOfSemester(String nameOfSemester) {
            this.nameOfSemester = nameOfSemester;
        }

        public String getNameOfDepartment() {
            return nameOfDepartment;
        }

        public void setNameOfDepartment(String nameOfDepartment) {
            this.nameOfDepartment = nameOfDepartment;
        }

        public String getNameOfDivision() {
            return nameOfDivision;
        }

        public void setNameOfDivision(String nameOfDivision) {
            this.nameOfDivision = nameOfDivision;
        }

        public String getNameOfBatch() {
            return nameOfBatch;
        }

        public void setNameOfBatch(String nameOfBatch) {
            this.nameOfBatch = nameOfBatch;
        }

        public String getNameOfSubject() {
            return nameOfSubject;
        }

        public void setNameOfSubject(String nameOfSubject) {
            this.nameOfSubject = nameOfSubject;
        }

        public String getInstituteLogoPath() {
            return instituteLogoPath;
        }

        public void setInstituteLogoPath(String instituteLogoPath) {
            this.instituteLogoPath = instituteLogoPath;
        }

        public String getAcFullName() {
            return acFullName;
        }

        public void setAcFullName(String acFullName) {
            this.acFullName = acFullName;
        }

        public String getImFullName() {
            return imFullName;
        }

        public void setImFullName(String imFullName) {
            this.imFullName = imFullName;
        }

        public String getCollegeLogoPath() {
            return collegeLogoPath;
        }

        public void setCollegeLogoPath(String collegeLogoPath) {
            this.collegeLogoPath = collegeLogoPath;
        }

        public String getInstituteLogo() {
            return instituteLogo;
        }

        public void setInstituteLogo(String instituteLogo) {
            this.instituteLogo = instituteLogo;
        }

        public String getCollegeLogo() {
            return collegeLogo;
        }

        public void setCollegeLogo(String collegeLogo) {
            this.collegeLogo = collegeLogo;
        }

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

    }

}
