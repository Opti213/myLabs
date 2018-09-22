package ru.mirea.gobachev.labs.lab_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> myList = new ArrayList<>();
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.isEmpty()) break;
            myList.add(line);
        }

        System.out.println(myList);

    }
}