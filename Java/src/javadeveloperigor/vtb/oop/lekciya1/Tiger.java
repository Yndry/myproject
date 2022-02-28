package javadeveloperigor.vtb.oop.lekciya1;

public class Tiger extends Cat{
    public static int count=0;
    public Tiger(String name, int runDistance, int swimmDistance) {
        super("Тигр", name, runDistance, swimmDistance);
        count++;
    }
}
