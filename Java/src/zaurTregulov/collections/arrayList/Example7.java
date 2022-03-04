package zaurTregulov.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static void main(String[] args) {
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Sasha");
        arrayList1.add("Masha");
        arrayList1.add("Igor");
        arrayList1.add("Misha");


        Object[] objects = arrayList1.toArray();
        System.out.println(objects);

        String[] stringsArray = arrayList1.toArray(new String[0]);
        for(String st: stringsArray) {
            System.out.println(st);
        }

    }


}
