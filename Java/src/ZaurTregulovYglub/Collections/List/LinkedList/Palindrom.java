package ZaurTregulovYglub.Collections.List.LinkedList;

import java.util.*;

public class Palindrom {
    public static void main(String[] args) {
        String s = "madsam";
        char[] chars = s.toCharArray();
        List<Character> list = new LinkedList<>();
        for(char a: chars) {
            list.add(a);
        }
        System.out.println(list);
        boolean isPalindrom = true;
        Iterator<Character> iterator = list.iterator();
        ListIterator<Character> reverse = list.listIterator(list.size());

        while (iterator.hasNext() && reverse.hasPrevious()) {
            if(iterator.next() != reverse.previous()) {
                isPalindrom = false; break;
            }
        }
        System.out.println(isPalindrom);

    }
}
