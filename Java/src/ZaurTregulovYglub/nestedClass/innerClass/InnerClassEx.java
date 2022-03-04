package ZaurTregulovYglub.nestedClass.innerClass;

import ZaurTregulovYglub.nestedClass.staticNestedClass.Car;

public class InnerClassEx {
    String color;
    int door;
    Engine engine;

    public InnerClassEx(String color, int door) {
        this.color = color;
        this.door = door;

    }

    public void setEngine(Engine engine) {
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

    public class Engine {
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
InnerClassEx innerClassEx = new InnerClassEx("red", 4);
InnerClassEx.Engine engine = innerClassEx.new Engine(150);
 innerClassEx.setEngine(engine);
        System.out.println(innerClassEx);

        InnerClassEx.Engine engine1 = new InnerClassEx("off", 3). new Engine(150);
        System.out.println(engine);

        System.out.println();
    }
}
