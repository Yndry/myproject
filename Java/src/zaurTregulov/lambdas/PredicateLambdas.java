package zaurTregulov.lambdas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;


/**
 * Predicate используется методом removeIf - удаляет элемент из коллекции по критерию
 */
public class PredicateLambdas {

    }


    class InfoPredicate {
        void testStudentPredicate(ArrayList<Students> st, Predicate<Students> pr) {
            for (Students s : st) {
                if (pr.test(s)) System.out.println(s);
            }

        }
    }
class TestPredicate{
    public static void main(String[] args) {
        Students st11 = new Students("Vlad", 23, 'M', 3.6);
        Students st21 = new Students("Olga", 20, 'F', 3.9);
        ArrayList<Students> st= new ArrayList<>()
        {{
            add(st11);
            add(st21);
        }};
InfoPredicate infoPredicate = new InfoPredicate();
infoPredicate.testStudentPredicate(st, (Students pr) -> pr.age>19 );

/**
 * RemoveIf
 *
 */

ArrayList<String> arrayList = new ArrayList<>();
arrayList.add("privet");
arrayList.add("poka");
arrayList.add("kak dela");
arrayList.removeIf(element -> element.length()>7);

//Можно и так

        Predicate<String> p = element-> element.length()>5;
        Predicate<String> p1 = element-> element.length()>6;

        /**
         * Можно обьеденять два Predicate
         * //and - обьединение двух проверок
         * //or - одна из проверок  p1.or(p1)
         * //nigate- отрицание условия    p1.negate()
         */


        arrayList.removeIf(p1.and(p1));
        arrayList.removeIf(p1.negate());
        arrayList.removeIf(p1.or(p1));
        System.out.println(arrayList);

        }
    }





