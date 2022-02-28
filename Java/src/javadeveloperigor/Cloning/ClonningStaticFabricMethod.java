package javadeveloperigor.Cloning;

public class ClonningStaticFabricMethod {
}


class Car {
    private int weight;
    private String model;

    public Car() {
    }

    public Car(int weight, String model) {
        this.weight = weight;
        this.model = model;
    }
//Создадим метод, котрый будет принимать не отдельно параметры а обьект
// И на основании этого обьекта будем возвращать копию обьекта
    public static Car deepCopyCar(Car copyedCar) {
        //Создадим новый обьект Car
        Car copyCar = new Car();
        //Присваиваем значение по ссылке
        copyCar.model = copyedCar.model;
        copyCar.weight = copyedCar.weight;
        return copyCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", model='" + model + '\'' +
                '}';
    }
}

class MainClass {
    public static void main(String[] args) {
Car car = new Car(1200, "Bmw");
Car copyCar = Car.deepCopyCar(car);
        System.out.println(car);

        System.out.println("-----");
        System.out.println(copyCar);

    }
}