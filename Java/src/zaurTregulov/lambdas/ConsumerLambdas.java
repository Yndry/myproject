package zaurTregulov.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Consumer - противоположен Supplier. Он потребляет (что то делает с обьектом
 * метод void accept
 */

/**
 * Создадим метод, который будет менять параметры машины.
 * а как он будет менять мы и определим
 */
public class ConsumerLambdas {

}

class TestCars {
    public static ArrayList<Cars> creatThreeCars(Supplier<Cars> carSupplier) {
        ArrayList<Cars> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            /**
             * Будем добавлять элемент в ArrayList тот который нам будет возвращать Supleier
             */
            cars.add(carSupplier.get());
        }
        return cars;
    }

    /**
     * Создадим метод
     */
    public static void changeCars(Cars cars, Consumer<Cars> cr) {
        cr.accept(cars);


    }


    public static void main(String[] args) {
        /**
         * Создастся 3 одинаковых обьекта Car
         */
        ArrayList<Cars> ourCars = creatThreeCars(() -> new Cars("NissanCars", "Silver", 1.6));
        System.out.println("Our cars: " + ourCars);

        changeCars(ourCars.get(0), cr -> {
            cr.color = "Black";
            cr.engine = 2.4;
            System.out.println("Upgrade Cars " + cr);
        });
    }
}

    class Cars {
        String model;
        String color;
        double engine;

        public Cars(String model, String color, double engine) {
            this.model = model;
            this.color = color;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Cars{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", engine=" + engine +
                    '}';
        }
    }






