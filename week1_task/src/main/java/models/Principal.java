package models;

public class Principal extends Staff {

    private static Principal singleInstance = new Principal();

    private Principal() {

        super("STD/001", "OSAYI JOY", "UROMI EDO STATE", "FEMALE", "MS.C", "PRINCIPAL");
    }


    public static Principal getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Principal();

        }
        return singleInstance;
    }





}


