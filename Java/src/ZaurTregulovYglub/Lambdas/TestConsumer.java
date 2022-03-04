package ZaurTregulovYglub.Lambdas;

import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        test((obj) -> System.out.println(obj), 10);
    }
    public static void test(Consumer<Object> f, Object obj) {
        f.accept(obj);
    }


}
