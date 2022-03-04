package ZaurTregulovYglub.Generics;

import java.util.ArrayList;

/**
 * @
 * Parametrized Method
 */

class GenMethod {
    public <T> T getSeconfElement(ArrayList<T> arrayList) {
return arrayList.get(1);
    }
}
public class ParametrizedMethod {
    public static void main(String[] args) {

//Один и тот же метод может работать как со String так и с int
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(12); 
        ar.add(100);
        ParametrizedMethod pm = new ParametrizedMethod();
        GenMethod gm = new GenMethod();
        int a = gm.getSeconfElement(ar);
        System.out.println(a);

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("ss");
        ar2.add("aa");
        ar2.add("bb");
        String d = gm.getSeconfElement(ar2);
        System.out.println(d);
    }
}
