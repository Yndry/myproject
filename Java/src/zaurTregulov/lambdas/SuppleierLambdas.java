package zaurTregulov.lambdas;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SuppleierLambdas {
    /**
     * Поставщик
     * Не принимает ни какой параметр, а возвращает обьект T
     * Этот интерфейс поставляет обьекты когда его метод вызывается.
     */
}

class TestSuppleier {
    public static ArrayList<Car> creatThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            /**
             * Будем добавлять элемент в ArrayList тот который нам будет возвращать Supleier
             */
cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
        /**
         * Создастся 3 одинаковых обьекта Car
         */
        ArrayList<Car> ourCars = creatThreeCars(() -> new Car("Nissan", "Silver", 1.6));
        System.out.println("Our cars: " + ourCars);
    }
}

class TestSup {
    public static void main(String[] args) {

    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}




