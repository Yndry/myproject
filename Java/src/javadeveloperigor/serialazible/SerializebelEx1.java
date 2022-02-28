package javadeveloperigor.serialazible;

import java.io.*;

public class SerializebelEx1 {
    public static void main(String[] args) {
        // Создаем объект класса файл и указываем файл
        File f = new File("D:\\Java Professional Course_video\\009_Serialization_and_Clonning\\009_Samples\\src\\javaProfessional\\ex_001_serialization\\serialization\\file2.txt");
        Car c = new Car(50000, "Bmw");
        //используем try with resursec
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f)); // для записи ф файл
             // создаем ObjectOutputStream в качестве параметра передаем FileOutputStream и указыаем наш файл
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) { // для чтения из файла
            // Сериализуем объект Bmw в байт-код
            oos.writeObject(c); //записывем в файл

            // Десериализуем объект Car с байт-кода
            Car car = (Car) ois.readObject(); //читаем из файла
            //Делаем кастин (Car) т.к. у readObject возвращаемый тип Object
            System.out.println(car);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
// Отметили класс Car что он может быть сериализован
class Car implements Serializable {
    private int price;
    private String model;

    Car(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
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
}