package services.DutiesImplementation;
import models.Courses;
import models.Staff;
import services.TeacherDuties;

public class TeacherDutyImplementation implements TeacherDuties {
    public TeacherDutyImplementation() {
    }

    @Override
    public String teacherCanTeachACourse(String classes, Courses course, Staff teacher) {
        if (teacher.getPosition() == "TEACHER") {
            if ((teacher.getClassess() == course.getClasses()) && teacher.getCourse().equalsIgnoreCase(course.getCourseCode())) {
                return  "Teacher can take this course";
            } else {
                return  "unauthorized";
            }
        }else {
            return  " You are not a teacher";
        }
    }
}
