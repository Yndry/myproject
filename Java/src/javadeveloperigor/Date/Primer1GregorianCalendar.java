package javadeveloperigor.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Primer1GregorianCalendar {

        public static void main(String[] args) {
            GregorianCalendar d = new GregorianCalendar();
            int today = d.get(Calendar.DAY_OF_MONTH); //возвращает текущий день месяца
            int month = d.get(Calendar.MONTH); //определяет текущий месяц

            d.set(Calendar.DAY_OF_MONTH, 1); // выставляем день месяца первый sunday

            int weekday = d.get(Calendar.DAY_OF_WEEK); //узнаем какой день недели
            System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat"); //прорисовываем текс

            for (int i = Calendar.SUNDAY; i < weekday; i++) { //ставим счетчик и указываем что будем двигаться с sanday
                System.out.print("      ");
            }

            do {
                int day = d.get(Calendar.DAY_OF_MONTH); //в переменную day вытаскиваем день месяца
                System.out.printf("%4d", day); ///выводим в нужном месте первый день месяца 4d - 4-ре отступа
                if (day == today) { //текущий день равняется today? ставим *
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                if (weekday == Calendar.SATURDAY) { //кода weekday стал субботой перебросили на новую строку курсов
                    System.out.println();
                }
                d.add(Calendar.DAY_OF_MONTH, 1); //прибавляем каждй раз день месяца на 1
                weekday = d.get(Calendar.DAY_OF_WEEK);
            } while (d.get(Calendar.MONTH) == month); //если месяц равен текущему месяцу то работаем иначе выходим из цикла
        }
    }

/**
 * ОТВЕТ:
 *  Sun   Mon   Tue   Wed   Thu   Fri   Sat
 *          1     2     3     4     5     6
 *    7     8     9    10    11    12    13
 *   14    15    16    17    18    19    20
 *   21    22    23    24    25*   26    27
 *   28    29    30

 */
//в григориан календаре  нумрация с воскресенья. а месяц с нуля