package services;

import models.Courses;
import models.Student;

public interface StudentDuties {
    String studentCanTakeCourse(Student student, Courses courses);

}