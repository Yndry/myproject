package ZaurTregulovYglub.Lambdas;

import zaurTregulov.generics.game.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Examp3 {
void outInfo(ArrayList<Students> al, Predicate<Students> ps) {
    for(Students st: al) {


    }
}


}
class StudentInfo {
    public static void main(String[] args) {
//        LambdaStudent st1 = new LambdaStudent("Ivan", 'm', 22, 3, 8.3);
//        LambdaStudent st2 = new LambdaStudent("Nikolay", 'm', 28, 2, 6.4);
//        LambdaStudent st3 = new LambdaStudent("Elena", 'f', 19, 1, 8.9);
//        LambdaStudent st4 = new LambdaStudent("Petr", 'm', 35, 4, 7);
//        LambdaStudent st5 = new LambdaStudent("Mariya", 'f', 24, 3, 9.1);
//        ArrayList<LambdaStudent> al = new ArrayList<>();
//        al.add(st1);
//        al.add(st2);
//        al.add(st3);
//        al.add(st4);
//        al.add(st5);
    }
}

class Students{
    String name;
    char sex;
    int age;
    int course;
    double everageGrade;

    public Students(String namee, char sex, int age, int course, double everageGrade) {
        this.name = namee;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.everageGrade = everageGrade;
    }

    @Override
    public String toString() {
        return "lAMBDAsTUDENTS{" +
                "namee='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", everageGrade=" + everageGrade +
                '}';
    }
}
interface StudentsCheck {
    boolean check(Students s);
}