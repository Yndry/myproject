package zadachiUchoba.Chisla;

import java.util.Random;
import java.util.Scanner;

public class Chisla3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter therst namber");
        int ferst = scanner.nextInt();
        System.out.println("Enter second number");
        int scond = scanner.nextInt();
        outRandom(ferst, scond);

    }
    public static void outRandom(int a, int b) {
        Random random = new Random();
        int res = a + (random.nextInt(b-a) + 1);
        System.out.println(res);
    }
}
