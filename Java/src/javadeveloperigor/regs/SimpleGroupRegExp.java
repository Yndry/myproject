package javadeveloperigor.regs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleGroupRegExp {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(.(.(.(.))))");
        Matcher m = p.matcher("JAVA");
        System.out.println(m.groupCount()); // выведет сколько груп есть в регулярном выражении.
/**
 * Пробежимся по всей длинне групп и выведем содержимое.
 */
while (m.find()) {
    for (int i = 0; i <= m.groupCount(); i++) {
        System.out.println(i + " = " + m.group(i));
    }
}
    }
}

/**
 Ответ :
 4
 0 = JAVA
 1 = JAVA
 2 = AVA
 3 = VA
 4 = A
 */