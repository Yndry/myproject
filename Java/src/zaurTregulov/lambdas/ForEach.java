package zaurTregulov.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "kak dela", "poka");
        for (String s :list) {
            System.out.println(s);
        }
        /**
         * получим такой же результат
         */
        list.forEach(str -> System.out.println(str));

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(10);
        list2.forEach(elment -> {
            System.out.println(elment);
            elment*=2;
            System.out.println(elment);
        });
    }
}
