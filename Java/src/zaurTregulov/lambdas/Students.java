package zaurTregulov.lambdas;

public class Students {
    String name;
    int age;
    char sex;
    double ocenka;

    public Students(String name, int age, char sex, double ocenka) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ocenka = ocenka;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", ocenka=" + ocenka +
                '}';
    }
}
