package ru.mirea.gobachev.labs.lab_08;

import java.io.*;

public class Lab_08 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"))) {
            while (true) {
                line = bufferedReader.readLine();
                if (line.isEmpty()) break;
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}