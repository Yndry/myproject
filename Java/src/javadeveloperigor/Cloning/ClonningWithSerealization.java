package javadeveloperigor.Cloning;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Клонирование с помощью Serialization самый эффективный метод
 */
public class ClonningWithSerealization {
}
class CowSerial {
    private String name;
    private int age;
    private int head;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public CowSerial() {
    }

    public CowSerial(String name, int age, int head) {
        this.name = name;
        this.age = age;
        this.head = head;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", head=" + head +
                '}';
    }
}
class MainCloningSerealization{
    public static void main(String[] args) {
        CowSerial cowSerial = new CowSerial("Byrenka", 3, 1);
        ByteArrayOutputStream output = new ByteArrayOutputStream();


    }
}