package Labs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab_05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer;
        String str = reader.readLine();
        stringBuffer = new StringBuffer(str);

        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) > '\u0030' && stringBuffer.charAt(i) < '\u0039'){ stringBuffer.setCharAt(i, '*');}
        }
        System.out.println(stringBuffer);


    }
}
