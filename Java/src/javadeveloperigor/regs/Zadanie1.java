package javadeveloperigor.regs;

import java.util.regex.Pattern;

public class Zadanie1 {
    void chekIp(String ip) {
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
String ip1 = "255.255.35.123";
String ip2 = "231.223.288.12";
String ip3 = "14.43.2.33";
Zadanie1 zadanie1 = new Zadanie1();
zadanie1.chekIp(ip1);
zadanie1.chekIp(ip2);
zadanie1.chekIp(ip3);
    }
}
