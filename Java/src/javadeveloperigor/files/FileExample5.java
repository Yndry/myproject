package javadeveloperigor.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileExample5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for(int i=2000; i<=3000; i++) {
            list.add(Integer.toString(i));
        }
        try {
            Files.write(Paths.get("C:\\Users\\User\\Desktop\\Набор массы.txt"), list);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("OK");
    }
}
