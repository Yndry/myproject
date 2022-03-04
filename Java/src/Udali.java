import com.sun.source.doctree.ThrowsTree;

import javax.lang.model.element.Element;
import java.lang.annotation.*;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.*;

/**
 * Разбиение строки на подстроки по . или ,
 */
public class Udali{}

class StudentUdali{
    String name;
    int age;

    public StudentUdali(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public StudentUdali(StudentUdali studentUdali) {
        this(studentUdali.name, studentUdali.age);
    }

    @Override
    public String toString() {
        return "StudentUdali{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class MainUdali{
    public static void main(String[] args) {
        StudentUdali studentUdali = new StudentUdali("Petr", 3);
        StudentUdali studentUdaliCopy = new StudentUdali(studentUdali);
    }
}