/**
 * Напишите программу на Java, чтобы проверить, является ли данное число некрасивым.
 *  В системе счисления уродливые числа являются положительными числами,
 * чьи единственные простые множители равны 2, 3 или 5. Первые 10 уродливых чисел -
 * это 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. По условию 1 - это включен.
 */

package zadachiUchoba.Chisla;

import java.util.Scanner;

public class Chisla2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int n = in.nextInt();
        if (n <= 0) {
            System.out.print("Input a correct number.");
        }
        int x = 0;
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                System.out.print("It is not an ugly number.");
                x = 1;
                break;
            }
        }
        if (x == 0)
            System.out.print("It is an ugly number.\n");
        System.out.print("----");

    }
}
