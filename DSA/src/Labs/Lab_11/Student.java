package Labs.Lab_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Student implements Comparable{
    int cipher;
    String name;
    String group;
    int mark;

    Student(int cipher, String name, String group, int mark){
        this.cipher = cipher;
        this.name = name;
        this.group = group;
        this.mark = mark;
    }

    @Override
    public int compareTo(Object obj) {
        Student student = (Student)obj;
        if(this.cipher < student.cipher) return -1;
        else if (this.cipher > student.cipher) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "cipher: " + Integer.toString(cipher) + "\n" + "name: " + name + "\n" + "group: " + group + "\n" + "mark: " + Integer.toString(mark) + "\n";
    }

    static void randomFile(){
        String[] names = new String[]{"Mark", "Alice"};
        Random rnd = new Random();
        int countOfStudent = rnd.nextInt(10) + 5;
        try(BufferedWriter fileWriter = new BufferedWriter(new FileWriter("students.txt"))){
            fileWriter.write(countOfStudent + "\n");
            for (int i = 0; i < countOfStudent; i++) {
                fileWriter.write(rnd.nextInt(100) + "\n"); //cipher
                fileWriter.write(names[rnd.nextInt(2)] + "\n"); //name
                fileWriter.write("ИКБО-13-17\n"); // group
                fileWriter.write(rnd.nextInt(6) + "\n"); //mark
            }
        }catch (IOException e){

        }
    }
}
