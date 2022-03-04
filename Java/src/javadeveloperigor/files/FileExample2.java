package javadeveloperigor.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample2 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        String string;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\Набор массы.txt"));
            while (true) {
                string = br.readLine();
                if (string==null) break;
                st.append(string + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(st.toString());
    }
}
