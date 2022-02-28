package ZaurTregulovYglub.nestedClass;

public class test {

}

class Car{
    String name;
    int door;
    Engine engine;

    public Car(String name, int door, Engine engine) {
        this.name = name;
        this.door = door;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
    public static class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

}
class Test{

}
