package zaurTregulov.lambdas;


/**
 * Интерфейс Function<T,R> принимает 2 параметра
 *
 *
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Задача, найти среднее арифмитическое для всех студентов п разным показатедям
 * например курсов этих студентов
 * метод R apply(T t)
 *
 * T - входной пораметр
 * R - return параметр, возвращает булиан
 */
public class FunctionLambdas {

    public static void main(String[] args) {
        Students st1 = new Students("Ivan", 30, 'M', 9.8);
        Students st2 = new Students("Petr", 33, 'M', 8.8);
        Students st3 = new Students("Mariya", 36, 'F', 9.6);
        Students st4 = new Students("Liza", 35, 'F', 9.3);
        List<Students> studentsList = new ArrayList<>(){{
            add(st1);
            add(st2);
            add(st3);
            add(st4);
        }};
        /**
         * Function принимает student и возвращает тип Double students.age
          */
        double result =functionTest(studentsList, students -> Double.valueOf(students.age));
        System.out.println(result);
//Function<Students, Double> f = students -> 3.14;
//Function<Students, Double> f = students -> (double) students.age;

    }
    static double functionTest (List<Students> students, Function<Students, Double> f) {
        double result =0;
        for(Students st: students) {
            result+=f.apply(st);

        }
        result = result/students.size();
        return result;
    }
}
