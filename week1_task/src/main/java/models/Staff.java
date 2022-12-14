package models;
//import Enums.Position;

public class Staff extends users implements CharSequence{
    private String staffID;
    private String qualification;
    public String position;
    private String course;
    private String classess;


    public Staff(String name, int age, String address, String gender, String staffID, String qualification, String position, String course, String classess) {
        super(name, age, address, gender);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
        this.course = course;
        this.classess = classess;
    }

    public Staff(String staffID, String name, String address, String gender, String qualification, String position, String course, String classess) {
        super(name, address, gender);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
        this.course = course;
        this.classess = classess;
    }

    public Staff(String staffID, String name, String address, String gender,  String qualification, String position) {
        super(name, address, gender);
        this.staffID = staffID;
        this.qualification = qualification;
        this.position = position;
    }


    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClassess() {
        return classess;
    }

    public void setClassess(String classess) {
        this.classess = classess;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s\n", getStaffID(), getName(), getAddress(), getGender(), getQualification(), getPosition());
    }
}




