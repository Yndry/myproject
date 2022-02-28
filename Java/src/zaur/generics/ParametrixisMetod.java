package zaur.generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrixisMetod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        String s = Param.Parametr(list);
        System.out.println(s);
        List<Integer> list1 = new ArrayList<>();
        list1.add(1000);
        list1.add(2000);
        list1.add(3000);
        int s1= Param.Parametr(list1);
        System.out.println(s1);
    }
}

class Param {
    public static <M> M Parametr(List<M> list) {
        return list.get(2);
    }
}


