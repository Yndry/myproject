package zaur.generics;

public class ParameterizisClass {
    public static void main(String[] args) {
        Info<String> inf = new Info<>("Privet", "Privet1");
        System.out.println(inf);

        }
    }


class Info<T> {
    private T value;
private T value1;
    public Info(T value, T value1) {
        this.value = value;
        this.value1 = value1;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}" + "{[" + value1 + "]}";
    }
}
