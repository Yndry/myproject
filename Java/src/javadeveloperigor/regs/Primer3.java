/**
 * Поиск телефона по шаблону
 */
package javadeveloperigor.regs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Primer3 {
    public static void main(String[] args) {
        String telef = "+380(67)22-33-444";
        Pattern pattern = Pattern.compile("\\+[0-9]\\d{2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}");
        Matcher matcher = pattern.matcher(telef);
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
