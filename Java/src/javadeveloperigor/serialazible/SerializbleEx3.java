package javadeveloperigor.serialazible;

import java.io.*;

public class SerializbleEx3 {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("F:\\Сделать\\Android_Developer\\JAVA\\IdeaProjects\\Java\\src\\javadeveloperigor\\serialazible\\file3.txt");
        CarEx3 c = new CarEx3(5000, "Bmw", new Engine(1500));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c);

            // Десериализуем объект Bmw с байт-кода
            CarEx3 newCar = (CarEx3) ois.readObject();
            System.out.println(newCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class CarEx3 implements Serializable {
    private int price;
    private String model;
    private Engine engine;

    CarEx3(int price, String model, Engine engine) {
        this.price = price;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

class Engine implements Serializable {
    private int power;

    Engine() {
    }

    Engine(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                '}';
    }

    public int getPower() {
        return power;
    }
}
