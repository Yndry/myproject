package javadeveloperigor.files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileExample6 {
    public static void main(String[] args) {
List<String> resault = new ArrayList<>();
        List<String> list = new ArrayList<>();
        try {
            list = Files.readAllLines(Paths.get("D:\\tabl.txt"));
            for(String line : list) {
                String[] fragments = line.split("\t");
                if(fragments.length !=3) {
                    System.out.println("wrong line: " + line);
                    continue;
                }
                resault.add(fragments[0]);
            }
            for(String res :resault) {
                System.out.println(res);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
