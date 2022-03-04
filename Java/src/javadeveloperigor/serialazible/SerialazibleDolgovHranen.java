/**
 * Долговременное хранение
 */

package javadeveloperigor.serialazible;

import javadeveloperigor.vtb.oop.lekciya1.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialazibleDolgovHranen {

}
class House implements Serializable {}
class AnimalHouse implements Serializable{
    private String name;
    private House prferredHouse;

    public AnimalHouse(String name, House prferredHouse) {
        this.name = name;
        this.prferredHouse = prferredHouse;
    }

    @Override
    public String toString() {
        return "Enimal{" +
                "name='" + name + '\'' +
                ", prferredHouse=" + prferredHouse +
                '}';
    }
}
class MyWorld {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        House house = new House();
        List<AnimalHouse> animalHouses = new ArrayList<>();
        animalHouses.add(new AnimalHouse("Bosco the dog", house));
        animalHouses.add(new AnimalHouse("Ralth the hamster", house));
        animalHouses.add(new AnimalHouse("Molly the cat", house));
        System.out.println("animals: " + animalHouses);
        ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
        ObjectOutputStream o1 = new ObjectOutputStream(buf1);
        o1.writeObject(animalHouses);
        o1.writeObject(animalHouses);
        ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
        ObjectOutputStream o2 = new ObjectOutputStream(buf2);
        o2.writeObject(animalHouses);
        ObjectInputStream in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
        ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
        List animalHouses1 = (List) in1.readObject();
        List animalHouses2 = (List) in1.readObject();
        List animalHouses3 = (List) in2.readObject();
        System.out.println("animals1: " + animalHouses1);
        System.out.println("animals2: " + animalHouses2);
        System.out.println("animals3" + animalHouses3);
    }
}
