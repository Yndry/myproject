package zaurTregulov.collections.linkedList;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;
import java.util.LinkedList;

public class ExampleLinkedList {
    public static void main(String[] args) {
        Student st1 = new Student("Igor", 10);
        Student st2 = new Student("Zaur", 15);
        Student st3 = new Student("Kolya" , 23);
        Student st4 = new Student("Masha", 23);

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);

        Student st5 = new Student("Petr", 21);
        linkedList.add(2, st5);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
