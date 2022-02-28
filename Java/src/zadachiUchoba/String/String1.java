package zadachiUchoba.String;

/**
 * Напишите метод проверки, является ли строка палиндромом.
 */

/** Решение 1
 * */

public class String1 {
    public static void main(String[] args) {
        String s = "adda";
        System.out.println(palinfrom(s));
    }

    public static boolean palinfrom(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    /**
     * Решение 2
     */
    private static boolean isPalindrome(String str) {
        if (str == null)
            return false;
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        return strBuilder.toString().equals(str);
    }
}