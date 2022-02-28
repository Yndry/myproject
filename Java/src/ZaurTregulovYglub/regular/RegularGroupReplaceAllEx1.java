/**
 * 03/24 1233 3221 2232 2343 (093) день действия номер карты  и код
 * Сделаем цифры в таком формате
 * Дата  карты стоит после 16 цифр номера карты надо их перевести вперед
 */
package ZaurTregulovYglub.regular;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Замена
 * ReplaysAll пренимает RegularExpression
 */

public class RegularGroupReplaceAllEx1 {
    public static void main(String[] args) {
        String s = "HGIJHKjlk     k;kk; k;k     l;'lo l     123     ";

        System.out.println(s);
        s = s.replace("123", "java");
        s = s.replaceAll("\\s{2,}", " "); // Заменили двойной и больше  пробел
        // на одинарный
        System.out.println(s);
        s = s.replaceAll("k\\w+", " ");
        s.replaceFirst("k\\w+", ""); //Меняет первое совпадение на пробел

        String bankCarts = "20304058671274856489392;" + "73949506719358123749245;" + "23845810549386430947284";
        Pattern patternBakkKartsFormat =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");// Разбили по
        //Группам карту
        Matcher matcher1 = patternBakkKartsFormat.matcher(bankCarts);
        /**
         * Отформатируем используя разбиение в паттерне на группы группа = это выражение взятое в ()
         * отсчет начинается от 1
         * номер группы "$5"
         * С помощью групп преобразовываем число в нужный формат
         */
        String namperCartsAfterFormat = matcher1.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(namperCartsAfterFormat);
        while (matcher1.find()) {
            System.out.println(matcher1.group(7)); // если укажем конкретную группу то только она и выведется
        }
    }
}
