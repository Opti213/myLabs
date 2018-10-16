package Labs.Lab_11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


public class Lab_11 {
    public static void main(String[] args) {
        //generate
        Student.randomFile();
        //reading
        ArrayList <Student>students = new ArrayList<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader("students.txt"))) {
            int countOfStudent = Integer.parseInt(fileReader.readLine());
            for (int i = 0; i < countOfStudent; i++) {
                int tmpCipher = Integer.parseInt(fileReader.readLine());
                String tmpName = fileReader.readLine();
                String tmpGroup = fileReader.readLine();
                int tmpMark = Integer.parseInt(fileReader.readLine());
                students.add(new Student(tmpCipher, tmpName, tmpGroup, tmpMark));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //sort
        Collections.sort(students);
        //print
        for (Student student : students) {
            System.out.println(student);
        }
        //search
        ArrayList <Student>rez = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("enter field and value(1.cipher 2.Name 3.Group 4.Mark)");
            String value;
            switch (bf.readLine().toLowerCase()) {
                case "cipher":
                    value = bf.readLine();
                    for (Student student : students) {
                        if (student.cipher == Integer.parseInt(value)) rez.add(student);
                    }
                    break;
                case "name":
                    value = bf.readLine();
                    for (Student student : students) {
                        if (student.name.equals(value)) rez.add(student);
                    }
                    break;
                case "group":
                    value = bf.readLine();
                    for (Student student : students) {
                        if (student.group.equals(value)) rez.add(student);
                    }
                    break;
                case "mark":
                    value = bf.readLine();
                    for (Student student : students) {
                        if (student.mark == Integer.parseInt(value)) rez.add(student);
                    }
                    break;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        for(Student student : rez){
            System.out.println(student);
        }
        //todo binary data
    }

}
