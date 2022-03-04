package javadeveloperigor.Cloning;

public class ConstructorCopy {
}

class StudentEx2 {
    private String name;
    private int age;

    public StudentEx2(String name, int age) {
        this.name = name;
        this.age = age;
    }

   //Создаем конструктор клонирования
    public StudentEx2 (StudentEx2 studentCloning) {
       this(studentCloning.name, studentCloning.age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class ExMain {
    public static void main(String[] args) {
        StudentEx2 student = new StudentEx2("Vlad", 23);
        //Создаем клона передав ссылкой основного студента
StudentEx2 studentCopy = new StudentEx2(student);
        System.out.println(student);
        System.out.println("----");
        System.out.println(studentCopy);

    }
}
