package javadeveloperigor.anatation;

import java.lang.annotation.*;

public class AnnotationEx2 {
}

//@MyAnno2(str = "Hellow")
//@MyAnno2(str = "World") //repeateble аннотации
//записали свои значения чтоб не было дефолтного если б мы не указали
class A {
    public void print() {
        System.out.println("A");
    }
 }

class B extends A {

}

//аннотаия должна быть задокументрована
@Documented
@Inherited
//Чтоб аннотация MyAnno применялась ко всем в одной иерархии
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})  // применяем только к методу и к классу
@Retention(RetentionPolicy.RUNTIME)
        //политика удержания аннотации
@interface MyAnno {

MyAnno2[] str();
    int i() default 10 + 10;

    enum MyEnum {  //можем записывать в качестве параметров и перечесления
        BLACK, WHITE, GREEN, ORANGE
    }

    //не можем записать Integer i2(); т.к. не можем записывать обьект
}
//@Repeatable(MyAnno)
@interface MyAnno2{
String str();
}

/**
 * Создадим функциональный интерфейс
 */
@FunctionalInterface
        // отметим его как FunctionalInterface
interface MyOwnInterf {
    int i(); //интерфейс принимает 1 абстрактный метод
}