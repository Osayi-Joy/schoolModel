package services.DutiesImplementation;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrincipalDutyImplementationTest {


        Principal principal;
        Applicant applicant;
        Applicant applicant2;
        PrincipalDutyImplementation principalDuty;
        Student student;
        Student student2;
        Courses course1;



        @BeforeEach
        void setUp() {
            principal =  Principal.getSingleInstance();
            principalDuty = new PrincipalDutyImplementation();
            applicant = new Applicant("john", 13,"ajah", "male");
            student2 = new Student("101/ST","IMOLE ESTHER", 15, "SANGOTEDO","FEMALE", "F", "course1", "LEVEL1");
            student = new Student("101/ST","IMOLE ESTHER", 15, "SANGOTEDO","FEMALE", "A", "course1", "LEVEL2");
            course1 = new Courses("com_123", "intro_java", "LEVEL1","Mr. Adebayo");
            applicant2 = new Applicant("john", 9,"ajah", "male");


        }

        @Test
        @DisplayName("Principal can admit applicant if applicant is between 10 and 20 years old")
        void admitGoodApplicant() {

            String expected = "Congratulations you have been admitted";
            assertEquals(expected,principalDuty.admitApplicant(applicant,principal));
        }

        @Test
        @DisplayName("Principal cannot admit applicant if applicant is  not between 10 and 20 years old")
        void admitBadApplicant() {

            String expected = "Sorry Not Admitted";
            assertEquals(expected,principalDuty.admitApplicant(applicant2,principal));
        }

        @Test
        void expelStudent() {
            String expected = "You have been expelled";
            assertEquals(expected,principalDuty.expelStudent(principal,student));
        }

        void expelNotStudent() {
            String expected = "Not expelled";
            assertEquals(expected,principalDuty.expelStudent(principal,student2));
    }
        }


