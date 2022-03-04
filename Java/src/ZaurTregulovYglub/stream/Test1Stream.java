package ZaurTregulovYglub.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test1Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("Poka");
        list.add("Kak dela");
//        for(int i = 0; i<list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
        System.out.println(list.stream().map(element -> element.length()).collect(Collectors.toList()));
        int[] array = {4, 5, 2, 56};
        System.out.println(Arrays.toString(Arrays.stream(array).map(element -> {if(element%2==0) element=element/2;return element;}).toArray()));
        array = Arrays.stream(array).map(element -> {if (element>10) element = 2; return element;}).toArray();
        System.out.println(Arrays.toString(array));
    }
}
