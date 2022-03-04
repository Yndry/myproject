package javadeveloperigor.vtb.oop.lekciya1;

public abstract class  Animal {
    public static int count = 0;

       protected String type;
       String name;

       int maxRunDistance;
       int maxSwimDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance) {
        count++;
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с кроссом " + distance + " м");
        } else {
            System.out.println(type + " " + name + " не смог справится с кроссом");
        }
    }

    public void swimm(int distance) {
         if (maxSwimDistance ==0) {
             System.out.println(type + " " + " не умеет плавать");
             return;
         }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно справился с плаванием " + distance + " м");
        } else {
            System.out.println(type + " " + name + " не смог справится с плаванием");
        }
        }
}
