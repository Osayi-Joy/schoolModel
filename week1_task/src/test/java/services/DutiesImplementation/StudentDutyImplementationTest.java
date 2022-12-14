package services.DutiesImplementation;

import models.Courses;
import models.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDutyImplementationTest {
    StudentDutyImplementation studentDuty;
    Student student2;
    Student student1;
    Courses course1;
    Courses course2;


    @BeforeEach
    void setUp() {
        studentDuty = new StudentDutyImplementation();
        course1 = new Courses("com_123", "intro_java", "LEVEL1","Mr. Adebayo");
        course2 = new Courses("com_124", "intro_C", "LEVEL1","Mr.Newton");
        student2 = new Student("101/ST","IMOLE ESTHER", 15, "SANGOTEDO","FEMALE", "F", "course1", "LEVEL1");
        student1 = new Student("101/ST","IMOLE ESTHER", 15, "SANGOTEDO","FEMALE", "A", "course1", "LEVEL2");
    }

    @Test
    void studentCanTakeCourse() {
        String expected ="You are eligible to take this course";
        assertEquals(expected, studentDuty.studentCanTakeCourse(student2, course1));
    }


    @Test
    void studentCanNotTakeCourse() {
        String expected ="Pls can you go back to your class now";
        assertEquals(expected, studentDuty.studentCanTakeCourse(student1, course2));
    }

}

