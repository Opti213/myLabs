package ru.mirea.gobachev.labs.lab_01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_01 {
    public static void main(String args[]) {
        int array[] = new int[10];
        int sum=0;
        System.out.println("\ntask 1\n");
        for (int i=0; i < array.length; i++){
            array[i] = new Random().nextInt() % 10;
            System.out.println("args" + i + ": " + array[i]);
            sum+=array[i];
        }
        System.out.println("sum: " + sum);

        System.out.println("\ntask 2\n");
        for (int i=0; i < args.length; i++){
            System.out.println("args" + i + ": " + args[i]);
        }

        System.out.println("\ntask 3\n");
        sum=1;
        for (int i=1; i < 10; i++){
            sum += 1/i;
            System.out.println(i + ": " + sum);
        }

        System.out.println("\ntask 4\n");
        for (int i=0; i < array.length; i++){
            System.out.println("args" + i + ": " + array[i]);
        }
        Arrays.sort(array);
        for (int i=0; i < array.length; i++){
            System.out.println("args" + i + ": " + array[i]);
        }

        System.out.println("\ntask 5\n");
        System.out.print("enter the number: ");
        System.out.print("factorial of your number is " + func(new Scanner(System.in).nextInt()));
    }

    public static int func(int x){
        int res=1;
        for (int i = 1; i < x+1; i++) {
            res*=i;
        }
        return res;
    }
}
