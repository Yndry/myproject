package zadachiUchoba.Chisla;

public class Chisla7 {
    public static void main(String[] args) {
        int a = 123;
        int b = 321;
        System.out.println("a = " + a + " b = " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = " + a + " b = " + b);
    }
}
