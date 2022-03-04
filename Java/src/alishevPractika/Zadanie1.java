package alishevPractika;
/**
Вывести на экран слово “JAVA” , в строку, чтобы оно повторилось 10 раз, используя
        цикл while .
        Вывод в консоль должен быть таким:
        JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA JAVA
 */

/**
 * Повторить задание 1, но используя цикл for .
 */

/**
 * Вывести на экран слово “JAVA” , в столбик, чтобы оно повторилось 10 раз,
 * используя цикл на ваше усмотрение ( for или while ).
 */


public class Zadanie1 {
    public static void main(String[] args) {
        zadanie6();
    }
    public static void zadanie1() {
        int counter =0;
        while (counter<10) {
            System.out.print("JAVA ");
            counter++;
        }
    }
    public static void zadanie2() {
        for (int i=0; i<10; i++) {
            System.out.print("JAVA ");
        }
    }
    public static void zadanie3() {
        for (int i=0; i<10; i++) {
            System.out.println("JAVA");
        }
    }
    /**
     * Объявите переменную типа int , имя переменной - year . Присвойте этой
     * переменной значение 1980. Используя цикл while , выведите в столбик строки вида
     * “Олимпиада X года”, где X - это число, которое принимает значения, начиная от 1980
     * до 2020 с шагом увеличения равным 4.
     * То есть на первой итерации цикла, X равен 1980, а на каждой следующей итерации,
     * значение X увеличивается на 4. Строки такого вида выводятся до тех пор, пока
     * значение X не станет больше 2020.
     */
    public static void zadanie4() {
        int year = 1980;
        while (year<=2020) {
            System.out.printf("Олимпиада %d года\n", year);
            year+=4;
        }

    }
    /**
     * Повторить задание 4, но используя цикл for .
     */
    public static void zadanie5() {
        for (int i=1980; i<=2020; i+=4) {
            System.out.printf("Олимпиада %d года\n", i);
        }
    }
    /**
     * Объявите переменную типа int , имя переменной - k . Присвойте этой переменной
     * какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение ( for или while ),
     * выведите в консоль таблицу умножения для этой цифры в следующем формате:
     * 1 x k = …
     * 2 x k = …
     * 3 x k = …
     * ……
     * 9 x k = …
     */
public static void zadanie6() {
    int k=3;
    int rezz=0;
    for (int i=1; i<10;i++) {
        rezz= k*i;
        System.out.printf("%d x %d = %d\n", i,k,rezz);
    }

}

}
