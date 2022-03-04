package javaRush.exeptions;

import java.io.IOException;

public class Example {

        public static void main(String[] args) throws IOException {
            try {

                int area = area(-10, 20);
                System.out.println(area);
            } catch (IllegalArgumentException e) {
                System.out.println("Bad");
            }
        }

        private static int area ( int i, int i1) throws IllegalArgumentException{
            if (i < 0 || i1 < 0) {
                throw new IllegalArgumentException("Oshibka");
            }
            return i * i1;
        }
    }

