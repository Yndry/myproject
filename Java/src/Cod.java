import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Замена 2-х элементов между собой без испльзования 3=й переменной
 */



public class Cod {
    public static void main(String[] args) {
Student st1 = new Student(10, "Igor");
Student st2 = new Student(12,"Page");
Student st3 = new Student(11, "Marvel");
Student st4 = new Student(16, "Boris");
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f,true);
        lhm.put(12.3, st1);
        lhm.put(10.3, st2);
        lhm.put(23.3, st3);
        System.out.println(lhm);
        System.out.println(lhm.get(12.3));
        System.out.println(lhm);




    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

