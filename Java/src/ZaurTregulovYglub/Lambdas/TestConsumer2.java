package ZaurTregulovYglub.Lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Меняем цвет машины
public class TestConsumer2 {
    public static void main(String[] args) {


//    public static ArrayList<Car> createCar(ArrayList<Car> cars, Supplier car) {
//
//    }
        Car car = new Car("Mers", "Red");
        Car car2 = new Car("Volvo", "Blue");
        Car car3 = new Car("Ferrary", "Purper");
        ArrayList<Car> arrayList = new ArrayList<>();
        arrayList.add(car);
        arrayList.add(car2);
        arrayList.add(car3);
arrayList.forEach(car1 -> System.out.println(car1));
        for (Car s : arrayList) {
renameCars(s, car1 -> car1.color="blooooooo");
        }
        System.out.println(arrayList);
    }
     public static void renameCars(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
     }
}

    class Car {
        String name;
        String color;

        public Car(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
