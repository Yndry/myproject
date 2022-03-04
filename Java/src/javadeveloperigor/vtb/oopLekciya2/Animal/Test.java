package javadeveloperigor.vtb.oopLekciya2.Animal;

public class Test {
    public static void main(String[] args) {
        Flyable[] flyables = {
                new Duk(), new Plain()};
        for (Flyable fl: flyables) {
            fl.fly();

        }

    }
}
