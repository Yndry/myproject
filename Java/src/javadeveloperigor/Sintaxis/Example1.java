package javadeveloperigor.Sintaxis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine(); // в s записываем строку
        int t = Integer.parseInt(bufferedReader.readLine()); // строку преобразуем в int и записываем в int
        System.out.println(s);
        System.out.println(t);
    }
}
