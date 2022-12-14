package services.DutiesImplementation;
import models.Courses;
import models.Staff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TeacherDutyImplementationTest {
    Staff teacher;
    Courses mathematics;
    Courses english;
    Staff teacher2;
    Staff teacher3;
    TeacherDutyImplementation teacherDuty;



    @BeforeEach
    void setUp() {
        teacherDuty = new TeacherDutyImplementation();
        english = new Courses("CD 101", "Intro_Java", "LEVEL1","Mr Adebayo");
        mathematics = new Courses("CD 101", "Intro_Java", "LEVEL1","Mr Adebayo");
        teacher = new Staff("std11", "Mr. SOA", "Sangotedo","male", "BSc","Teacher", "Intro_java", "LEVEL2");
        teacher2 = new Staff("Mosess", "Ajah", "F", "STD007","BSc", "NON_ACADEMIC");

       // teacher3 = new Staff("James", "std11", Position.TEACHER, "ENG", Classes.JSS1);
    }

    @Test
    void teacherCanTeachACourse() {
        String expected = "Teacher can take this course";
        assertEquals(expected, teacherDuty.teacherCanTeachACourse("LEVEL1", mathematics, teacher));
    }

    @Test
    void teacherCanNotTeachACourse() {
        String expected = "unauthorized";
        assertEquals(expected, teacherDuty.teacherCanTeachACourse("LEVEL2", english, teacher));
    }

    @Test
    void TestForNotAteacher() {
        String expected = " You are not a teacher";
        assertEquals(expected, teacherDuty.teacherCanTeachACourse("LEVEL1", mathematics, teacher2));
    }

}