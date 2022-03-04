package zaurTregulov.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sasha");
        arrayList1.add("Masha");
        arrayList1.add("Igor");
        arrayList1.add("Misha");


        List<String> newList = arrayList1.subList(0,2);
        System.out.println(newList);


    }

}
