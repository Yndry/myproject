package ZaurTregulovYglub.Collections.HashSet;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
          set.add("sss");

    }
}
