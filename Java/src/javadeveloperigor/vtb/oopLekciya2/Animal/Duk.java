package javadeveloperigor.vtb.oopLekciya2.Animal;

public class Duk implements Swimable, Flyable{
    @Override
    public void swim() {
        System.out.println("Утка плавает");

    }

      @Override
    public void fly() {
          System.out.println("Утка летит");

    }
}
