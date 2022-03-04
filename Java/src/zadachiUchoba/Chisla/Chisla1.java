package zadachiUchoba.Chisla;

import java.util.Random;
import java.util.Scanner;

/**
 * Разложить число на цифры и сложить их
 */

/**
 * !!! Надо это сделать и с рекурсией !!!!
 */
public class Chisla1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter nubmer");
            int namber = scanner.nextInt();

            int res = namber;
            int sum = 0;
            while (namber != 0) {

                res = namber%10;
                System.out.print(res + " ");
                sum += res;
                namber = namber/10;


            }
            System.out.println();
            System.out.println(sum + " sum");
        }

    }

