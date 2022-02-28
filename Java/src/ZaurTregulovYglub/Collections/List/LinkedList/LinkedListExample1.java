package ZaurTregulovYglub.Collections.List.LinkedList;


import java.util.LinkedList;
import java.util.List;

class Student2 {
    private String name;
    private int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

public class LinkedListExample1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikola", 2);
        Student2 st3 = new Student2("Vik", 5);
        Student2 st4 = new Student2("Bar", 6);
        Student2 st5 = new Student2("Bull", 12);
        LinkedList<Student2> stLinked = new LinkedList<>();
        stLinked.add(st1);
        stLinked.add(st2);
        stLinked.add(st3);
        stLinked.add(st4);
        stLinked.add(st5);
        System.out.println(stLinked);
//        Iterator<Student2> iter = stLinked.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//        for (Student2 st: stLinked
//        ) {
//            System.out.println("** " + st);
//        }
        System.out.println(stLinked.get(2));
  String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char s1:s.toCharArray()
             ) {
            list.add(s1);

        }
        System.out.println(list);


    }

}


