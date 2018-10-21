package Labs.Lab_11;


import java.util.ArrayList;
import java.util.Collections;


public class Lab_11 {
    public static void main(String[] args) {
        //generate
        Student.randomFile();
        //reading
        ArrayList <Student>students = new ArrayList<>();
        Student.parseAndInput(students);
        //sort
        Collections.sort(students);
        //print
        for (Student student : students) {
            System.out.println(student);
        }
        //search
        ArrayList<Student> rez = Student.search(students);
        for(Student student : rez){
            System.out.println(student);
        }
        //binary writing
        Student.binaryWrite(students);
        //binary reading
        Student.binaryReadAndPrint(students.size());
    }

}
