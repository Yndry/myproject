package javadeveloperigor.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class HtmlFile {
    public static void main(String[] args) {
        String htmlFile = parseFile("code.html");
        System.out.println(htmlFile);
    }

    private static String parseFile(String path) {
        StringBuilder builder = new StringBuilder();
        try {
           List<String> lines = Files.readAllLines(Paths.get(path));
           lines.forEach(line ->builder.append(line + "\n")); // Загоняем строчки в stringBilder;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return builder.toString();
    }
}
