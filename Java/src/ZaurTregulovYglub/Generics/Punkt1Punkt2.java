package ZaurTregulovYglub.Generics;

/**
 * @
 * Parametrized Class
 * @
 */

import com.sun.jdi.PathSearchingVirtualMachine;
class Pair <T1, T2> {
    T1 value1;
    T2 value2;

    public Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }
}
class OtherPair <T> {
    T value1;
    T value2;

    public OtherPair(T value1, T value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public T getValue2() {
        return value2;
    }
}

class Info <T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
    public T getValue () { //Тоже указываем тип Т
        return this.value;
    }
}

public class  Punkt1Punkt2 {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Name");
        System.out.println(info);
        Info<Integer> info2 = new Info<>(2);
        System.out.println(info2);
        String s = info.getValue();
        System.out.println(s);
        Integer in = info2.getValue();
        System.out.println(in);
        Pair<String, Integer> pair = new Pair<>("Primer", 10);
        System.out.println(pair.value1);
        System.out.println(pair.value2);
        Pair<Double, Integer> pair2 = new Pair<>(12.56, 45);
        System.out.println("Значение пары " + pair2.value1 + " " + pair2.value2);

        OtherPair<String> otherPair = new OtherPair<>("Privet", "Poka");
        System.out.println(otherPair.value1 + " " + otherPair.value2);
            }
}
