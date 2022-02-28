package javadeveloperigor.serialazible.Externalizable;

import java.io.*;

public class ExternalizableExample {
}

class Student implements Externalizable {
    private int id;
    private transient String userName;

    public Student() {
        /** Создадим дефолтный конструктор чтоб он вызывался при десириализации
         * Поля static и transient в Externalizable можем серелизовать т.к. мы явно переопределяем методы
         * writeExternal и readExternal
         *
         * Externalizable не работает с ключевым полем SerialVersionUID
         * В Externalizable нельзя десериализовать поля с "final" т.к. они прописываются в конструкторе и изменить его в
         * методе readExternal уже нельзя
         */
    }

    public Student(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
out.writeInt(id);
out.writeObject(userName);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
id = in.readInt();
userName = (String)in.readObject(); // скастим к String
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(10, "Evgeniy");
        File file = new File("F:\\Сделать\\Android_Developer\\JAVA\\IdeaProjects\\Java\\src\\javadeveloperigor\\serialazible\\Externalizable\\Example.txt");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            oos.writeObject(student);
            student = null;
            student = (Student) ois.readObject();
            System.out.println(student);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

