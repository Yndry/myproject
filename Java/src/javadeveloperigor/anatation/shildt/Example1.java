package javadeveloperigor.anatation.shildt;

import javaRush.exeptions.Example;
import proverka.Proverka;

import java.lang.annotation.*;
import java.lang.reflect.Method;

public class Example1 {
    @MyNano(name = "Char", value = 20)
    public static void ex(String name, int i) {
        Example1 example1 = new Example1();

        try {

            Annotation[] annotations = example1.getClass().getMethod("ex", String.class, int.class).getAnnotations();
            for (Annotation a : annotations) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ex("Bob", 11);
    }

}

@Retention(RetentionPolicy.RUNTIME)
@interface MyNano {
    String name();

    int value();
}
