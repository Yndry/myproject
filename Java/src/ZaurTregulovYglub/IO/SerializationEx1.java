package ZaurTregulovYglub.IO;

import zaurTregulov.generics.game.Employ;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Допустим по каким то причиам не должны передавать информацию о зарплате работника в файл
 * для этого существуе ключевое слово transient
 */
public class SerializationEx1 {
    public static void main(String[] args) {
        Car car = new Car("mersedes", "Red");
        Employe employe1 = new Employe("Mariya", "IT", 25, 3500, car);
        Employe employe2 = new Employe("Viktor", "Sber", 20, 4500, car);
        Employe employe3 = new Employe("Olga", "VTB", 31, 5500, car);
        Employe employe4 = new Employe("Vadim", "Trud", 40, 6500, car);

        List<Employe> employeeList = new ArrayList<>();
        List<Employe> employeeIn = new ArrayList<>();
        employeeList.add(employe1);
        employeeList.add(employe2);
        employeeList.add(employe3);
        employeeList.add(employe4);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(
                new FileOutputStream("employee2.bin"));
             ObjectInputStream inputStream = new ObjectInputStream(
                     new FileInputStream("employee2.bin"));
        ) {
            outputStream.writeObject(employeeList);
            System.out.println("Done! ");
            /**
             * т.к. readObject() возвращает Object
             * то используем кастинг
             */
            employeeIn = (ArrayList) inputStream.readObject();
/**
 * Но будет выбрасываться Exeption NotSerializableExeption
 * наш класс employ должен имплементировать интерфейс Serializable - это просто интерфейс метка
 * говорящая о том что теперь класс Employee может сериализироваться
 * Сериализировать Array List и String можем без проблем так как они уже имплементируют Serializable
 * а наш класс Employee нет
 */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(employeeIn);
    }
}

class Employe implements Serializable {
    String name;
    String department;
    int age;
    transient double salary;
    Car car;

    public Employe(String name, String department, int age, double salary, Car car) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}

class Car implements Serializable {
    String model;
    String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}