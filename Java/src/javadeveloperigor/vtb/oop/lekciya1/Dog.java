package javadeveloperigor.vtb.oop.lekciya1;

public class Dog extends Animal {
   public static int count;
   public Dog(String name, int maxRunDistance, int maxSwimDistance) {
       super("Пес", name, maxRunDistance, maxSwimDistance);
       count++;
   }
}

