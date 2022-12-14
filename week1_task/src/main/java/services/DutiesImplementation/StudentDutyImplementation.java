package services.DutiesImplementation;
import models.Courses;
import models.Student;
import services.StudentDuties;

public class StudentDutyImplementation implements StudentDuties {
    public StudentDutyImplementation() {
    }

    @Override
    public String studentCanTakeCourse(Student student, Courses courses) {
        if(student.getClasses() == courses.getClasses()){
            return "You are eligible to take this course";
        }else{
            return "Pls can you go back to your class now";
        }

    }
}
