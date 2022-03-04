package zaurTregulov.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLambdas {
}

class StudentInfoLambda{
    /**
     * Пеередаем Array List и обьект интерфейса sch интерфейса Studentcheck
     * а у интерфейса есть метод studentChek который возвращает bollean
     * если true мы выводим на экран студента
     *
     * А что это за метод Chek - знает только класс который implements этот интерфейс
     *
     * */
    public void studentChekLambdas(List<Students> students, StudentsChekLambdas sch) {
        for(Students s: students) {
            if(sch.Chek(s)) System.out.println(s);
        }
    }
}

class TestLambdas {
    public static void main(String[] args) {
        Students st1 = new Students("Victor", 25, 'M', 9.8);
        Students st2 = new Students("Vika", 21, 'F', 9.1);
        Students st3 = new Students("Petr", 28, 'M', 7.8);
        Students st4 = new Students("Nastiya", 27, 'M', 7.5);
        Students st5 = new Students("Margo", 22, 'M', 8.8);
        Students st6 = new Students("Artem", 29, 'M', 8.4);
        Students st7 = new Students("Georgiy", 35, 'M', 9.2);

        List<Students> studentsList = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5, st6, st7));
        for (Students student: studentsList) {
            System.out.println(student);
        }
        System.out.println("-----------------");
        StudentInfoLambda info = new StudentInfoLambda();

        info.studentChekLambdas(studentsList, s -> s.age > 30);
        /**
         * Лямбда выражение мы можем вынести из параметра метода
         * Берем переменную StudentsChekLambdas sch из метода studentChekLambdas(List<Students> students, StudentsChekLambdas sch)
         */
        StudentsChekLambdas sch = s -> s.age > 30;

        info.studentChekLambdas(studentsList, sch);
    }
}

/**
 * Делаем override метода check и этот метод проверяет больше ли оценка нашего студента
 *
 * этот класс мождно не писать а заменить его анонимным классом
 */
class CheckGradeLambdas implements StudentsChekLambdas {

    @Override
    public boolean Chek(Students s) {
        return s.ocenka>8;
    }
}
@FunctionalInterface
interface StudentsChekLambdas {
    boolean Chek(Students s);
}

