package lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(proverka());
         }

public static List<String> proverka() throws FileNotFoundException {
List shouseList = new ArrayList<>();
    File file = new File("shoes.txt");
    File fileOut = new File("shues2.txt");
    PrintWriter pw = new PrintWriter(fileOut);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] massiveLine = line.split(";");
            if (Integer.parseInt(massiveLine[2]) == 0) {
                shouseList.add(line);
                pw.println(massiveLine[0] + massiveLine[1] + massiveLine[2]);

            }
            return shouseList;
        }
        pw.close();
        scanner.close();




return null;
}

}
