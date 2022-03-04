package ZaurTregulovYglub.Generics;

import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(12);
        list1.add(100);
        showList(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("FFFGFG");
        list2.add("JKJj");
        showList(list2);

    }
    static void showList(List<?> list) {
        System.out.println(list);
    }
}
