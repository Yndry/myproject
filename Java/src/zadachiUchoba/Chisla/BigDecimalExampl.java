package zadachiUchoba.Chisla;


public class BigDecimalExampl {
    public static void main(String[] args) {
        System.out.println(Byte.BYTES);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.MIN_RADIX);
        System.out.println(Character.BYTES);
        System.out.println(0.3-0.1-0.1-0.1);

        java.math.BigDecimal x = new java.math.BigDecimal("0.3");
        java.math.BigDecimal y= new java.math.BigDecimal("0.1");
        x = x.subtract(y); //Вычитание из X Y


    }
}
