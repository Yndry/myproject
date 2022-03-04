package javadeveloperigor.vtb.oop.lekciya1;

public class Test {
    public static void main(String[] args) {
Animal[] animals = {
        new HouseCate("Barsik",200),
new Dog("Bobik", 1000, 50),
        new Tiger("Тигра", 2000, 100)

};

        for (Animal animal : animals) {
            animal.run(800);
            animal.swimm(40);
        }
        System.out.println("Animals count " + Animal.count);
        System.out.println("Dog count " + Dog.count);
        System.out.println("Cat count " + Cat.count);
    }
}