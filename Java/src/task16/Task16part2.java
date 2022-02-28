package task16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task16part2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test1.txt");
        PrintWriter pw1 = new PrintWriter(file);
        Random random = new Random();
for(int i = 0; i<1000; i++) {
    pw1.println(random.nextInt(100));
}
pw1.close();
File file2 = new File("test2.txt");
PrintWriter pw2 = new PrintWriter(file2);
        Scanner scanner = new Scanner(file);
        int counter = 0;
        double sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if(counter == 20) {
                pw2.println(sum/20.0);
                sum = 0;
                counter = 0;
            }
        }
        pw2.close();
    }
}
