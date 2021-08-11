package com.infinity.infoway.atmiya.student.exam.pojo;

public class CourseSelectionModel {

    private int id;
    private boolean isElective = false;
    private boolean isCompulsory = true;
    private boolean isElectiveSelected = false;
    private String courseName;
    private String courseCode;

    public boolean isElectiveSelected() {
        return isElectiveSelected;
    }

    public void setElectiveSelected(boolean electiveSelected) {
        isElectiveSelected = electiveSelected;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public boolean isElective() {
        return isElective;
    }

    public void setElective(boolean elective) {
        isElective = elective;
    }

    public boolean isCompulsory() {
        return isCompulsory;
    }

    public void setCompulsory(boolean compulsory) {
        isCompulsory = compulsory;
    }
}
