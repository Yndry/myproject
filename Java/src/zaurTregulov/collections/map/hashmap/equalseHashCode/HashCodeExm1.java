package zaurTregulov.collections.map.hashmap.equalseHashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExm1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Ivan", "Ianov", 1);
        Student st2 = new Student("Petr", "Petrov", 2);
        Student st3 = new Student("Sidr", "Sidorov", 4);
        map.put(st1, 23.2);
        map.put(st2, 21.5);
        map.put(st3, 32.55);
        System.out.println(map);

        Student st4 = new Student("Sidr", "Sidorov", 4);

        boolean result = map.containsKey(st4);
        System.out.println(result);
    }
}
class Student {
    private String name;
    private String surname;
    private int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
    // хеширование преобразование любого обьекта в hashCode в int

    //Сравнение идет в начале по HashCode а затем по equalse
}

