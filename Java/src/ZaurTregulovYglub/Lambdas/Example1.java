package ZaurTregulovYglub.Lambdas;

import javaRush.exeptions.Example;
import zaurTregulov.generics.game.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {

    }
    }

////    void avaregeGrade(ArrayList<LambdaStudent> al, double grade) {
////        for(LambdaStudent s:al) {
////            if(s.everageGrade<grade) System.out.println(s + "\n-----------");
////        }
////    }
////    void printStudentAge(ArrayList<LambdaStudent> al, int age) {
////        for(LambdaStudent s: al) {
////            if(s.age>age) System.out.println(s + "\n----------");
////        }
////    }
//}
//
//Collections(student, (student1, student2) -> student1.course - student2.course)
//class testLambdas {
//    public static void main(String[] args) {
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
//        Example1 ex = new Example1();
//        ex.testStudents(al, new ChakOverGrade());
//     //   ex.printStudentAge(al, 25);
//        System.out.println("--------------");
//ex.testStudents(al, new StudentChecks() {
//    @Override
//    public boolean check(LambdaStudent s) {
//        return s.age>25;
//    }
//});
//        System.out.println("------------");
//        ex.testStudents(al, (LambdaStudent s) -> {
//            return s.age>25;});
//}
//}
//interface StudentChecks{
//    boolean check(LambdaStudent s);
//}
//class ChakOverGrade implements StudentChecks{
//
//    @Override
//    public boolean check(LambdaStudent s) {
//        return s.everageGrade>8;
//    }
//}