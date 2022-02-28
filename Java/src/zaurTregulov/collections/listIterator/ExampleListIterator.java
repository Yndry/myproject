package zaurTregulov.collections.listIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class ExampleListIterator {
    public static void main(String[] args) {
        String s = "madam1";
        LinkedList<Character> linkedList = new LinkedList<>();
        for(Character ch: s.toCharArray()) {
            linkedList.add(ch);
        }
        System.out.println(linkedList);
        Boolean isIterator = true;
        ListIterator<Character> listIterator = linkedList.listIterator();
        ListIterator<Character> listIterator1 = linkedList.listIterator(linkedList.size());
        while (listIterator.hasNext() && listIterator1.hasPrevious()) {
            if(listIterator.next() != listIterator1.previous()) {
                isIterator = false;
                break;
            }

        }
        if (isIterator) System.out.println("Palendrom");
        else System.out.println("Not Palendrom");
    }
}
