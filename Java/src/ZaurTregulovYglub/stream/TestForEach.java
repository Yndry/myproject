package ZaurTregulovYglub.stream;

import java.util.Arrays;

public class TestForEach {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 10};
        Arrays.stream(array).forEach(e -> {
            e *= 2;
            System.out.println(e);
        });

        Arrays.stream(array).forEach(System.out::println);
    }
}
