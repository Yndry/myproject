package javadeveloperigor.vtb.oop.lekciya1;

public class Cat extends Animal{
    public static int count=0;

    public Cat(String type, String name, int maxRunDistance, int maxSwimDistance) {
       super(type, name, maxRunDistance, maxSwimDistance);
        count++;
    }
}

