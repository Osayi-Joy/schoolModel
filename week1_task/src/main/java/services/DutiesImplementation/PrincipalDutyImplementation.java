package services.DutiesImplementation;
import models.Applicant;
import models.Principal;
import models.Student;
import services.PrincipalDuties;

public class PrincipalDutyImplementation implements PrincipalDuties {
    public PrincipalDutyImplementation() {
    }

    @Override
    public String admitApplicant(Applicant applicant, Principal principal) {
        if(principal.getPosition() == "Principal"){
            if(applicant.getAge() > 10 && applicant.getAge() < 20){
                applicant.setAdmitted(true);
                boolean admissionStatus = applicant.isAdmitted();
                System.out.println(" Your admission status is "+ admissionStatus);
                return "Congratulations you have been admitted";
            } else{
                return "Sorry Not Admitted";
            }
        } else {
            return "You are not a principal";
        }
    }

    @Override
    public String expelStudent(Principal principal, Student student) {
        if (principal.getPosition() == "Principal") {
            if (student.getGrade() == "F") {
                return "You have been expelled";
            } else {
                return "Not expelled";
            }
        } else {
            return "You are not a principal";
        }
    }

}
