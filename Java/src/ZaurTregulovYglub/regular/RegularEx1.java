package ZaurTregulovYglub.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    static int count = 0;

    public static void main(String[] args) {
        String s = "Java Util Adress: Novosad strit, 22, home 156, ntk: +79276521325, email: kdfjdo@mail.ru. " +
                "Oracal Util Adress: Sklarenko strit, 56, home 256, ntk: +79370682443, email: fdsss@gmail.com." +
                "delfi Util Adress: Molodogvardeyskaya strit, 20, home156, ntk: +79272571423, email: dsweaq@yandex.com.";
//        Pattern myPattern =Pattern.compile("java");
//        Matcher myMatcher = myPattern.matcher(s);
//        System.out.println(myMatcher);

        String s1 = "ABCD ABCE ABCF AB123CjGABCH38";
        Pattern myPattern1 = Pattern.compile("ABC|FAB");
        Pattern myPattern2 = Pattern.compile("ABC.");
        Pattern myPattern3 = Pattern.compile("^AB");
        Pattern myPattern4 = Pattern.compile("^[A-C][A-D]");
        Pattern myPattern5 = Pattern.compile("[0-9]");
        Pattern myPattern6 = Pattern.compile("\\D");
        Pattern myPattern7 = Pattern.compile("\\b\\w+@\\w+\\.(com|ru)"); // поиск почтового адреса
        Pattern myPattern8 = Pattern.compile("[A-Za-z]+");
        Pattern myPattern9 = Pattern.compile("\\b\\d{2}\\b"); //поиск цифр из 2х элементов
        Pattern myPattern10 = Pattern.compile("\\s\\+\\d{11}\\b"); //поиск номера телефона
        Pattern myPattern11 = Pattern.compile("\\w\\s+\\w");  //буквы между пробелами
        Pattern myPattern12 = Pattern.compile("(AB) {2,3}");  //поиск совпадений сочетания буква АB т.к. они в скобках
        Pattern myPattern13 = Pattern.compile("D(AB){2,}");  //DABAB DABABAB DABABABAB т.к. только (АВ)
        Pattern myPattern14 = Pattern.compile("\\AABC");  //ABC  совпадение в начале String
        Pattern myPattern15 = Pattern.compile("CH38\\Z");  //CH38  совпадение в конце String

        // в скобках и только к ним повторы применяются

        Matcher myMatcher = myPattern15.matcher(s1);
        while (myMatcher.find()) {
            System.out.println(" Estb Sovpadenie");
            System.out.print("Position: " + myMatcher.start() + " ");
            System.out.println(myMatcher.group());
            count += 1;
        }
        System.out.println("Counter = " + count);
    }
}
