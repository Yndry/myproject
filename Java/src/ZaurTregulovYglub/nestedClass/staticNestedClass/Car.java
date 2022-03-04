package ZaurTregulovYglub.nestedClass.staticNestedClass;

public class Car {
    String color;
    int door;
    Engine engine;

    public Car(String color, int door, Engine engine) {
        this.color = color;
        this.door = door;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "May Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
    public static class Engine {
     int horsPower;

        public Engine(int horsPower) {
            this.horsPower = horsPower;
        }

        @Override
        public String toString() {
            return " My engine{" +
                    "horsPower=" + horsPower +
                    '}';
        }
    }
}
class Test {
    public static void main(String[] args) {
Car.Engine engine= new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("red", 3, engine);
        System.out.println(car);

    }
}
