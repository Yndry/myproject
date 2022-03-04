/**
 * Создадим строку с регулярным выражением и откомпилируем методом compile
 */

package javadeveloperigor.regs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primer1 {
    public static void main(String[] args) {
        Pattern patter = Pattern.compile("[a-z&&[^d]]+"); //символы может идти пробел а может и не идти и вновь символы
        Matcher match = patter.matcher("hellow");
        boolean b = match.matches(); // проверяет соответствует ли шаблону
        System.out.println(b);
    }
}
