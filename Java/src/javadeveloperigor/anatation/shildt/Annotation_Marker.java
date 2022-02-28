package javadeveloperigor.anatation.shildt;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

public class Annotation_Marker implements Serializable {


    @MyaAnno(num1 = 10, num2 = 20)
    public static void addTwoNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
        Annotation_Marker annotation_marker = new Annotation_Marker();
        try {
            Method method = annotation_marker.getClass().getMethod("addTwoNumbers", int.class, int.class);
            MyaAnno myaAnno = method.getAnnotation(MyaAnno.class);
            System.out.println(myaAnno.num1()+myaAnno.num2());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[] args) {
        addTwoNumbers(1,2);
    }

}


@Retention(RetentionPolicy.RUNTIME)
@interface MyaAnno{
    int num1() default 0;
    int num2() default 0;

}
