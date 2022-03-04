package zaurTregulov.generics.game;

public abstract class Partisipant {
    private String name;
    private int age;

    public Partisipant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
