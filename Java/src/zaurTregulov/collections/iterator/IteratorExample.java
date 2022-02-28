package zaurTregulov.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list2 = new ArrayList<>();
        list2.add("Masha");
        list2.add("Sasha");
        list2.add("Dasha");
        list2.add("Stepasha");

        Iterator<String> iter = list2.iterator();
 while (iter.hasNext()) {
     System.out.println(iter.next());
 }
 Iterator<String> iter1 = list2.iterator();
 while (iter1.hasNext()) {
     iter1.next();
     iter1.remove();
        }
        System.out.println(list2);
    }
}
