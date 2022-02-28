package javadeveloperigor.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileExample3 {
    public static void main(String[] args) {
       List<String> list;
        try {
            list = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\Набор массы.txt"));
            for(String line : list) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
