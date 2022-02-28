package task16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task16part1 {
    public static void main(String[] args) throws FileNotFoundException {
File file = new File("text1.txt");
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int sum = 0;
        for(String numbers: ss) {
            sum+=Integer.parseInt(numbers);

        }
        double result = sum / (double)ss.length;
        System.out.printf(result + "--> %.3f", result);

    }
}
