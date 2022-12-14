package models;
//import management.principal;
public class Applicant extends users {
    private boolean isAdmitted = false;

    public Applicant(String name, int age, String address, String gender) {
        super(name, age, address, gender);

    }

    public boolean isAdmitted() {
        return isAdmitted;
    }

    public void setAdmitted(boolean admitted) {
        isAdmitted = admitted;
    }
}

