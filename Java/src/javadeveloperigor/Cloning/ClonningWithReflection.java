package javadeveloperigor.Cloning;

import java.lang.reflect.Field;

public class ClonningWithReflection {
}



class Cow {
    private String name;
    private int age;
    private int head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public Cow() {
    }

    public Cow(String name, int age, int head) {
        this.name = name;
        this.age = age;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", head=" + head +
                '}';
    }
}
class MainClonningWithReflection{
    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 5, 1);
        System.out.println("Original cow " + originalCow);
        Cow copyedCow = reflectionCloning(originalCow);
        System.out.println("Copy " + copyedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) {
        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");
            //изменим модификаторы доступа на public
           name.setAccessible(true);
           head.setAccessible(true);

           //обратимся к set() и засетим новое значение
            name.set(originalCow, "Burekka"); //пишем Обьект и его значение
            head.set(originalCow, 2);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
//Изменили обьект originalCow и возвращаем новое значение
        return originalCow;
    }
}
