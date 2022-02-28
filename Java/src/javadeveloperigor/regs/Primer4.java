package javadeveloperigor.regs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primer4 {
           public static void main(String[] args) {
//        В первом случае к первой группе относятся все возможные символы,
//        но при этом остается минимальное количество символов для второй группы.
            myMatches("([a-z]*)([a-z]+)", "abdcxyz"); //1 группа забирает максимум а второй группе
               // только 1 символ, т.к. +  от 1 до макс. а * от 0 до макс

//        Во втором случае для первой группы выбирается наименьшее количество
//        символов, т. к. используется слабое совпадение.
            myMatches("([a-z]?)([a-z]+)", "abdcxyz");
            // 1 я группа не берет ничего... т.к. ? 0 или 1 используется слабое совпадение

//        В третьем случае первой группе будет соответствовать вся строка, а для второй
//        не остается ни одного символа, так как вторая группа использует слабое совпадение.
            myMatches("([a-z]+)([a-z]*)", "abdcxyz");
            // 2-я ничего не получит т.к * от 0 до макс

//        В четвертом случае строка не соответствует регулярному выражению,
//        т. к. для двух групп выбирается наименьшее количество символов.
            myMatches("([a-z]?)([a-z]?)", "abdcxyz");
            // не подходит шаблону т. не 1 символ и не 1 символ. а символов в строке больше
        }

        public static void myMatches(String regex, String input) { //Принимает регулярное выражение и строку
            Pattern pattern = Pattern.compile(regex); // pattern сомпилирует регулярное выраджение
            Matcher matcher = pattern.matcher(input); //matcher принимает строку
            if (matcher.matches()) { //проверка соответсвует ли строка регулярному выражению
                System.out.println("First group: " + matcher.group(1)); //если да выводим группу 1
                System.out.println("Second group: " + matcher.group(2)); // тоже если да выводим группу 2
            } else {
                System.out.println("Nothing");
            }
            System.out.println();
        }
    }

/**
 * ОТВЕТ:
 * First group: abdcxy
 * Second group: z
 *
 * First group: a
 * Second group: bdcxyz
 *
 * First group: abdcxyz
 * Second group:
 *
 * Nothing
 */