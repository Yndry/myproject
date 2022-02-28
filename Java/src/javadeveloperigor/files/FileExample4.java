package javadeveloperigor.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileExample4 {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("C:\\Users\\User\\Desktop\\Pechat.txt");
            for (int i =0; i <=1000; i++) {
                printWriter.write(i + "\n");

            }
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }
}
