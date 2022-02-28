package zaurTregulov.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example8 {
    public static void main(String[] args) {
        List<Integer> list = List.of(11, 22, 334, 544);
        System.out.println(list);


        List<String> list2 = new ArrayList<>();
        list2.add("Masha");
        list2.add("Sasha");
        list2.add("Dasha");
        list2.add("Stepasha");
        List<String> listCopy = List.copyOf(list2);
        System.out.println(listCopy);

    }


}
