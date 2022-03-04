package ZaurTregulovYglub.IO;
/**
 * Есть также и
 * BufferedInputStream;
 * BufferedOutputStream
 * Принцип такой же
 */

import java.io.*;

public class FileInputStreamFileOutpotStream {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream =
                     new FileInputStream("C:\\Users\\User\\Desktop\\panel1_2.png");
             FileOutputStream fileOutputStream = new FileOutputStream("picture.png")) {
            int charEx;
            while ((charEx = fileInputStream.read()) != -1) {
                fileOutputStream.write(charEx);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            }
}
