package zaurTregulov.collections.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        People people1 = new People("Ivan", "Ivanov", 10);
        People people2 = new People("Petre", "Petrov", 22);
        People people3 = new People("Sidr", "Sidorov", 222);
        People people4 = new People("Mariya", "Marinova", 35);

        List<People> people = new ArrayList<>();
        people.add(people1);
        people.add(people2);
        people.add(people3);
        people.add(people4);
        System.out.println(people);
        People people5 = new People("Mariya", "Marinova", 35);
       // people.add(people5);
        people.remove(people5);
        System.out.println(people);

        people.clear();
        System.out.println(people.toString());

    }
}
class People {
    private String name;
    private String sername;
    private int age;

    public People(String name, String sername, int age) {
        this.name = name;
        this.sername = sername;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "People{" +
//                "name='" + name + '\'' +
//                ", sername='" + sername + '\'' +
//                ", age=" + age +
//                '}';
////    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                Objects.equals(name, people.name) &&
                Objects.equals(sername, people.sername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sername, age);
    }
}
