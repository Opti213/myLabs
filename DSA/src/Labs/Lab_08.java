package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Lab_08 {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        String answer;
        String testString = "This_is_string_for_test";
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("choose your type: ");
            System.out.println("1.integers");
            System.out.println("2.string");
            while (!(answer=reader.readLine()).equals("1") && !(answer.equals("2")));
            System.out.println("enter size of matrix");
            int sizeX = Integer.parseInt(reader.readLine());
            int sizeY = Integer.parseInt(reader.readLine());
            for (int i = 0; i < sizeX; i++) {
                ArrayList innerArray = new ArrayList();
                for (int j = 0; j < sizeY; j++) {
                    if(answer.equals("1"))innerArray.add(new Random().nextInt(10));
                    else innerArray.add(testString.charAt(new Random().nextInt(testString.length()))); //random char from testString
                    System.out.print(innerArray.get(j));
                }
                System.out.println();
                array.add(innerArray);
            }
        }catch (IOException | NumberFormatException e){
            System.out.println("input error");
        }
        //todo отсортировать по столбцам
    }
}
