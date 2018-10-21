package Labs.Lab_11;

import java.io.*;
import java.util.ArrayList;
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

    static void parseAndInput(ArrayList<Student> students){
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
    }

    static ArrayList<Student> search(ArrayList<Student> students){
        ArrayList<Student> rez = new ArrayList<>();
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("enter field and value(Cipher Name Group Mark) ex: name [enter] Alice");
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
                default:
                    System.out.println("wrong enter");

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return rez;
    }

    static void binaryWrite(ArrayList<Student> students){
        try (DataOutputStream binaryWriter = new DataOutputStream(new FileOutputStream("Data.bin"))){
            for (Student student : students) {
                binaryWriter.writeInt(student.cipher);
                binaryWriter.writeUTF(student.name);
                binaryWriter.writeUTF(student.group);
                binaryWriter.writeInt(student.mark);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    static void binaryReadAndPrint(int countOfStudents){
        try(DataInputStream binaryReader  = new DataInputStream(new FileInputStream("Data.bin"))){
            System.out.println("\nbinary reading\n");
            for (int i = 0; i < countOfStudents; i++) {
                Student tmp = new Student(
                        binaryReader.readInt(),
                        binaryReader.readUTF(),
                        binaryReader.readUTF(),
                        binaryReader.readInt()
                );
                System.out.println(tmp);
            }


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
