package javadeveloperigor.regs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primer2 {
    public static void main(String[] args) {
        // Проверка на соответствие строки шаблону
        Pattern p1 = Pattern.compile("a+y"); //a - 1 или бесконечность раз и y один
        Matcher m1 = p1.matcher("aaay");

        // Соответствует строка шаблону
        boolean b = m1.matches();
        System.out.println(b);

        // Поиск и выбор подстроки, заданной шаблоном
        String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)?"; // (\.\w+)? 0 или 1 вхождение для примера проверка и по двойному доменному имени
        String s = "адреса эл.почты:firstmail@mail.ru иsecondmail@gmail.com";

        Pattern p2 = Pattern.compile(regex);
        Matcher m2 = p2.matcher(s);
        while (m2.find()) {
            System.out.println("e-mail: " + m2.group());
        }

        // Разбивка строки на подстроки с применением шаблона в качестве разделителя
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("java1language 22 for3everyone");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

