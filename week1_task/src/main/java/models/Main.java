package models;
import util.ReadandWriteMethod;
import java.io.*;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws IOException {

        //TODO creating instances of course to add to my course file
        List<Courses> newListOfCourses = new ArrayList<>();
        newListOfCourses.add(new Courses("Com_122", "intro_react", "LEVEL1", "Mr. Bond"));
        newListOfCourses.add(new Courses("Com_125", "intro_C#", "LEVEL2", "Mr. Chibuzor"));
        newListOfCourses.add(new Courses("Com_124", "intro_Python", "LEVEL3", "Mr. Adeyemi"));
        newListOfCourses.add(new Courses("Com_122", "intro_Javascript", "LEVEL4", "Mrs. Okoduwa"));

        //TODO creating instances of staffs to write to my staff file
        List<Staff> newListOfStaffs = new ArrayList<>();
        newListOfStaffs.add(new Staff("STD/101", "Mr. Stephen James", "Lekki","male", "BS.c","Teacher","intro_React","LEVEL1"));
        newListOfStaffs.add(new Staff("STD/111", "Mr. Osomond Ebo", "Uromi edo state", "male", "BS.c", "NON_ACADEMIC_STAFF"));
        newListOfStaffs.add(new Staff("STD/112", "Mrs. Blessing", "Sangotedo","female", "BSc","Teacher","Intro_java","LEVEL1"));
        newListOfStaffs.add(new Staff("STD/113", "OSAYI PETER", "Uromi edo state", "male", "BS.c", "NON_ACADEMIC_STAFF"));

        //TODO creating instances of students to write to my student file
        ArrayList<Student> newListOfStudents = new ArrayList<>();
        newListOfStudents.add(new Student("2020/ST/009","ESEGBORIA PIUS", 15, "Ajah eti","FEMALE", "A", "JAVA", "LEVEL1"));
        newListOfStudents.add(new Student("2020/ST/101","IMOLE ESTHER", 15, "SANGOTEDO","FEMALE", "A", "REACT", "LEVEL1"));
        newListOfStudents.add(new Student("2020/ST/102","JOHN TINA", 14, "SANGOTEDO","FEMALE", "F", "NODE.JS", "LEVEL2"));
        newListOfStudents.add(new Student("2020/ST/103","MOSES SAMUEL", 14, "LEKKI","MALE", "A", "PHYTON", "LEVEL2"));


        String pathForStudent = "/Users/decagon/Desktop/DECAGON TASK/week1_task/src/main/resources/fileForStudents.csv";
        String pathForStaff = "/Users/decagon/Desktop/DECAGON TASK/week1_task/src/main/resources/fileForStaff.csv";
        String pathForCourse = "/Users/decagon/Desktop/DECAGON TASK/week1_task/src/main/resources/fileForCourses.csv";

        //TODO calling the reader methods to read the csv files and store in arraylist
        System.out.println(ReadandWriteMethod.readCSV(pathForCourse));
        System.out.println(ReadandWriteMethod.readCSV(pathForStudent));
        System.out.println(ReadandWriteMethod.readCSV(pathForStaff));

        ReadandWriteMethod.writeCSVWithoutOverwriting(pathForCourse, newListOfCourses);
        ReadandWriteMethod.writeCSVWithoutOverwriting(pathForStudent, newListOfStudents);
        ReadandWriteMethod.writeCSVWithoutOverwriting(pathForStaff, newListOfStaffs);


    }
}
