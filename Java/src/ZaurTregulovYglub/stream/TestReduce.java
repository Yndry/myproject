package ZaurTregulovYglub.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(5);
        Stream<Integer> stream5 = list.stream();
        System.out.println(stream5.count());

    }
}
