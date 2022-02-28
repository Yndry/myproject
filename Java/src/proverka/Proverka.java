package proverka;

import java.util.*;

public class Proverka {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("sss");
//        list.add("sssdd");
//        list.add("ddd");
//        System.out.println(list);
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        var linkedList = new LinkedList<>();
        linkedList.add("sss");
        linkedList.add("fff");
        linkedList.add("ddd");
        System.out.println(linkedList);
        ListIterator<Object> iterator = linkedList.listIterator();
        iterator.next();
        iterator.add("KKK");
        System.out.println(linkedList);
        iterator.next();
        iterator.set("sssfff");
        System.out.println(linkedList);

        var lin1 = new LinkedList<String>();
        lin1.add("1111");
        lin1.add("2222");
        lin1.add("3333");

        var lin2 = new LinkedList<String>();

        lin2.add("001100");
        lin2.add("002200");
        lin2.add("003300");

        ListIterator<String> listIterator1 = lin1.listIterator();
        Iterator<String> iterator2 = lin2.iterator();

        while (iterator2.hasNext()) {
            if(listIterator1.hasNext()) listIterator1.next();
            listIterator1.add(iterator2.next());
        }
        System.out.println(lin1);
lin1.addAll(lin2);
        System.out.println(lin1);
        ListIterator<String> listIterator22 = lin1.listIterator();
        while (listIterator22.hasNext()) {
            listIterator22.next();
            if(listIterator22.hasNext()) {
                listIterator22.next();
                listIterator22.remove();
            }
        }
        System.out.println(lin1);
    }
}
