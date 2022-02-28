package ZaurTregulovYglub.serialization;

import java.io.*;
import java.util.Objects;

public class serializationEx {
    public static void main(String[] args) {
        StudentSerial studentSerial = new StudentSerial("Ivan", 23);
        File fil = new File("serialization.txt");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fil));
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fil)))
        {outputStream.writeObject(studentSerial);
        studentSerial=null;

        studentSerial = (StudentSerial) objectInputStream.readObject();
            System.out.println(studentSerial);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
class StudentSerial implements Serializable{
    String name;
    int age;
    private static final long serialVersionUID = 2;

    public StudentSerial(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "StudentSerial{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSerial studentSerial = (StudentSerial) o;
        return age == studentSerial.age &&
                Objects.equals(name, studentSerial.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
