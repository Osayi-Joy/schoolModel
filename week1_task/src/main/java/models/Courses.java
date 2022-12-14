package models;


public class Courses implements CharSequence {
    private String courseCode;
    private String classes;
    private String courseTutor;
    private String courseName;

//constructor for courses Class
    public Courses(String courseCode, String courseName, String classes, String courseTutor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.classes = classes;
        this.courseTutor = courseTutor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getCourseTutor() {
        return courseTutor;
    }

    public void setCourseTutor(String courseTutor) {
        this.courseTutor = courseTutor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
         return String.format("%s %s %s %s\n", getCourseCode(), getCourseName(), getClasses(), getCourseTutor());
    }
}
