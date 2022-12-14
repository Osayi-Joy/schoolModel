package models;


public class Student extends users implements CharSequence{
    private boolean isExpelled = false;
    private String grade;
    private String courses;
    private String classes;
    private String studentID;


    public Student(String studentID, String name, int age, String address, String gender, String grade, String courses, String classes) {
        super(name, age, address, gender);
        this.grade = grade;
        this.courses = courses;
        this.classes = classes;
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Student(String studentID, String name, String address, String gender, String grade, String courses, String classes) {
        super(name, address, gender);
        this.grade = grade;
        this.courses = courses;
        this.classes = classes;
        this.studentID = studentID;
    }



    public boolean isExpelled() {
        return isExpelled;
    }

    public void setExpelled(boolean expelled) {
        isExpelled = expelled;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String string) {
        this.classes = string;
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
        return String.format("%s %s %s %s %s %s %s\n", getStudentID(), getName(), getAddress(), getGender(), getGrade(), getCourses(), getClasses());
    }



}
