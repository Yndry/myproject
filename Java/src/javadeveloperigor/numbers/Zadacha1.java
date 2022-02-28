package javadeveloperigor.numbers;


/**
 * Используя Integer.toString();
 * "".charAt();
 * "".length()
 */
public class Zadacha1 {
    public static void main(String[] args) {
        Integer d = 126;
        int summ = 0;
        String s = Integer.toString(d);
        for (int i = 0; i < s.length(); i++) {
            Integer num = Integer.parseInt(String.valueOf(s.charAt(i)));
            summ += num;
        }
        System.out.println(summ);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
}
