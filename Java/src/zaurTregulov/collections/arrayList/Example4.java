package zaurTregulov.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example4 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sasha");
        arrayList1.add("Masha");
        arrayList1.add("Igor");
        arrayList1.add("Misha");


        List<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Zaur");
        arrayList2.add("Igor");
        arrayList2.add("Masha");

        System.out.println(arrayList1);
        arrayList1.retainAll(arrayList2);
        System.out.println(arrayList1);

    }

}
