package zadachiUchoba.Chisla;

import java.util.Scanner;

/**
 * Напишите программу на Java для генерации и отображения всех чисел Капрекара в указанном диапазоне
 */
public class Chisla4 {

    public static void main(String[] args) {
        int a;
        int b;
        boolean exit = false;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter b>a");
        a = scaner.nextInt();
        b = scaner.nextInt();
        int m=0;
        int n=0;
        String[] digit = new String[2];
        for(long i = a; i< b; i++ ) {
            if (i==1) {System.out.println(i + " ");}
            else {
                String s = String.valueOf(i*i);
                if(s.length()%2==0) {
                    digit[0] = s.substring(0, s.length()/2);
                    digit[1] = s.substring(s.length()/2);
                }
                else {
                    digit[0] = s.substring(0,(s.length()-1)/2);
                    digit[1] = s.substring((s.length()-1)/2);
                }
                if(digit[0]=="") m=0;
                if(digit[1]=="") n=0;
                if(!digit[0].equals("") && !digit[1].equals("")) {
                    m = Integer.parseInt(digit[0]);
                    n = Integer.parseInt(digit[1]);
                }
                if(i==(m+n)) {
                    System.out.println(i + " " + " " +(i*i)+ " " + m + "+" + n + "");
                    exit = true;
                }
            }
        }
        if(exit == false) System.out.println("В указанном диапазоне нет чисел Капрекара");
    }
}