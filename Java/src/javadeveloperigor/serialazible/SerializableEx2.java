package javadeveloperigor.serialazible;

import java.io.*;

public class SerializableEx2 {

    public static void main(String[] args) {

        File file = new File("F:\\Сделать\\Android_Developer\\JAVA\\IdeaProjects\\Java\\src\\javadeveloperigor\\serialazible\\test3.txt");
        StudentsSerial studentsSerial = new StudentsSerial("Vadim", 7);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(studentsSerial);
            studentsSerial = null; // обнулим ссылку student больше она не будет ссылаться на обьект
            studentsSerial = (StudentsSerial) ois.readObject();
            System.out.println(studentsSerial);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}

class StudentsSerial implements Serializable {
   private static final long serialVersionUID = 25L;
    private String name;
    private int age;

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

    public StudentsSerial(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
