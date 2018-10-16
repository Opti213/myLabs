package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab_10 {
    public static String recursion(String str) {
        if (str.length() == 1) {
            return "palindrome ";
        } else {
            if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
                // Базовый случай
                if (str.length() == 2) {
                    return "palindrome ";
                }
                return recursion(str.substring(1, str.length() - 1));
            } else {
                return "not palindrome ";
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        System.out.println(recursion(str));
    }
}