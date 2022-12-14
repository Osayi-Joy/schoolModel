package services;

import models.Applicant;
import models.Principal;
import models.Student;

public interface PrincipalDuties {
    String admitApplicant(Applicant applicant, Principal principal);

    String expelStudent(Principal principal, Student student);
}
