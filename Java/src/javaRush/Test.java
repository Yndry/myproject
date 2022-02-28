package javaRush;

import java.io.IOException;
import java.util.*;


/** Дан список студентов
 * Написать программу выводящую по номеру студента отвечать
 */
public class Test {
    public static void main(String[] args) throws IOException {
try {


    int area = area(-10, 20);
    System.out.println(area);
}
catch (IllegalArgumentException e) {

}
    }

        private static int area ( int i, int i1) throws IllegalArgumentException{
            if (i < 0 || i1 < 0) { throw new IllegalArgumentException();

            }
            return i * i1;
        }
    }

