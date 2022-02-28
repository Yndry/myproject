package javadeveloperigor.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) {
        StringBuilder st= new StringBuilder();
        int code;

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\Набор массы.txt");
            while (true) {
                code = fileInputStream.read();
                if(code <0) break;
                char ch = (char) code;
                st.append(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(st.toString());
    }
}
