package javadeveloperigor.Cloning.shallowclonning;


/**
 * Переопределние метода clone() класса Obgect и и применение интерфейса Clonable
 */

/**
 * Создается поверхностное клонирование при изменении в колне параметра Group изменится это значение и в исходном Student
 * т.к. Group будет общим обьектом как для Student так и для CloneStudent
 */
public class CloninEx1 {
}
// Cloneable - интерфейс маркер кот говорит что класс может быть клонирован и будьте аккуратны работая с этим классом
class Group {
    int id;

    public Group(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}
class Student implements Cloneable{
    private String name;
    private int age;
    private Group group;
    public Student() {
    }


    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
* Переопределим в классе Student метод clone()
 *
 */

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
class MainClone {
    public static void main(String[] args) {
        Group group = new Group(1);
Student student = new Student("Vasiya", 25, group);
        try {
            Student clonStudent = (Student) student.clone();
            System.out.println("Student - " + student);
            System.out.println("Clone student - " + clonStudent);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
