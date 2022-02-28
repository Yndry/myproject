package javadeveloperigor.vtb.oopLekciya2.calendar;

public class Calendar {
    Month month = Month.MARCH;

    public void currentDateInfo() {
       // Month.
       // System.out.println(month.getNumberOfday() + " " + month.getTitle());
    }
    public static void main(String[] args) {


    }
}

enum Month{
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUN(6), JUL(7), SEPTEMBER(8), OCTOBER(9), NOVEMBER(10);
   private int numberOfday;

    Month(int numberOfDay) {
        this.numberOfday = numberOfDay;
    }

    public int getNumberOfday() {
        return numberOfday;
    }
}