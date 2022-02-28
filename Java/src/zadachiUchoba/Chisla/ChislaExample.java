package zadachiUchoba.Chisla;

import java.util.Date;
import java.util.Random;

public class ChislaExample {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1)); //Возвращает обсолютное значение числа
        System.out.println(Math.pow(10, 2)); //Возводит число в степень
        System.out.println(Math.ceil(1.3)); //Округление до ближайшего большего большего значения возвращает double
        System.out.println(Math.floor(1.6)); // Округление до ближайшего меньшего большего значения возвращает double
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.6)); //кругление до ближайшего меньшего большего значения

        System.out.println(Integer.toBinaryString(119));
       Random r  = new Random();
        r.setSeed((new Date().getTime()));
        System.out.println(r.nextDouble());


    }
}
