package ZaurTregulovYglub.Lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Найдем среднее арифметическое двигателей
public class TestFunction {
    public static void main(String[] args) {


        CarFunc car = new CarFunc("Mers", "Red", 1.6, 4);
        CarFunc car2 = new CarFunc("Volvo", "Blue", 1.8, 2);
        CarFunc car3 = new CarFunc("Ferrary", "Purper", 2.0, 4);
    ArrayList<CarFunc> arrayList = new ArrayList<>();
        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(car3);
        double t;
arrayList.forEach(car1 -> System.out.println(car1));
        t = renameCars(arrayList, carFunc -> carFunc.engine);
        System.out.println("resault = " + t);


}
    public static double renameCars(ArrayList<CarFunc> ar, Function<CarFunc, Double> f) {
        double resault = 0;
        for(CarFunc s: ar) {
            resault+=f.apply(s);
        }
        resault = resault/ ar.size();
    return resault;
    }

}

class CarFunc {
    String name;
    String color;
double engine;
int dors;

    public CarFunc(String name, String color, double engine, int dors) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.dors = dors;
    }

    @Override
    public String toString() {
        return "CarFunc{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", dors=" + dors +
                '}';
    }
}

