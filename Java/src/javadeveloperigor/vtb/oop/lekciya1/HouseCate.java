package javadeveloperigor.vtb.oop.lekciya1;

public class HouseCate extends Cat{
    public static int count=0;

    public HouseCate(String name, int RunDistance) {
        super("Домашний кот", name, RunDistance, 0);
        count++;
    }

}
