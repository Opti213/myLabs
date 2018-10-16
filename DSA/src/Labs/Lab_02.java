package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Lab_02 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(100);
         final  int SIZE = 15;
        int max = -10;
        int x, sizeOfArray;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("enter X:");
            x = Integer.parseInt(reader.readLine());
            System.out.print("enter size of array:");
            sizeOfArray = Integer.parseInt(reader.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println("enter exception");
            return;
        }
        System.out.println("array before:");
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            myList.add(random.nextInt(10));
            if ((int) myList.get(i) > max) {
                max = (int) myList.get(i);
            }
            System.out.print(myList.get(i) + " ");
        }
        System.out.println("\n\n" + "maximum is " + max + "\n");
        System.out.println("array after:");
        //task 4
        for (int i = 0; i < sizeOfArray; i++) {
            if ((int) myList.get(i) == max) {
                myList.add(i + 1, x);
            }
            System.out.print(myList.get(i) + " ");
        }

    }

}
