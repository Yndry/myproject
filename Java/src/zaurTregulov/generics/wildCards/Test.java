package zaurTregulov.generics.wildCards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(2.23);
        list.add(3.23);
        list.add(6.34);
        System.out.println(proverka(list));
        List<? super Number> list2 = new ArrayList<Object>();

    }

    public static Double proverka(List<? extends Double> list) {
        Double sum = 0d;
        for (Number s : list) {
            sum += s.doubleValue();
        }

        return sum;
    }
}



