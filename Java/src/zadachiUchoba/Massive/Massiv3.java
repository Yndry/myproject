package zadachiUchoba.Massive;
/**
 * Создать Генератор паролей произвольной длинны.
*/

import java.util.Random;

/**
 * Добавляем в массив arr все разрешенные символы, а далее в цикле получаем случайный элемент из массива
 * и добавляем его в набор сиволов из StringBuilder/. После чего преобразуем обьект StringBuilder в строку
 * с помощью toString и возвращаем его.
 */
public class Massiv3 {
    public static void main(String[] args) {
        System.out.println(passGen(50));
    }
    public static String passGen (int countChar) {
        if(countChar <1) return "";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        char[] arr = {'a' , 'b', 'c', 'd', 'i', 'f', 'i','1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for(int i = 0; i < countChar; i++) {
            sb.append(arr[rand.nextInt(arr.length)]);
        }
return sb.toString();
    }
}
