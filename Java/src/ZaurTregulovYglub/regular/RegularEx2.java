/**
 * Будем проверять подлинность IP
 * 0-255.0-255.0-255.0-255
 */
package ZaurTregulovYglub.regular;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {
void checkIP (String ip) {
    String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
            "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
                  //25[0-5]      |   2[0-4]\d    |   [01]?\d?\d       (\.)
                  //250-255      |   200- 249    |   0 - 199
                   //25 от 0 до 4 | 2 от 0 до 4 любая цифра | 0 или 1,
    // может и не быть любая цифра, может и не быть любая цифра
    System.out.println(ip + " is OK? " + Pattern.matches(regex,ip));

}
    public static void main(String[] args) {
        String s = "251.190.100.1";
        String s2 = "333.213.234.122";
       RegularEx2 r = new RegularEx2();
       r.checkIP(s);
//        Pattern pattern = Pattern.compile("[0-255]\\.[0-255]\\.[0-255]\\.[0-255]");
//        Matcher myMatcher= pattern.matcher(s);
//        while (myMatcher.find()) {
//            System.out.println("Otvet" + myMatcher.group());
//
//        }
//        String [] ip = s.split("[0-255]\\.[0-255]\\.[0-255]\\.[0-255]");
//        System.out.println(Arrays.toString(ip));
    }
}
