package ZaurTregulovYglub.Collections.List;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Igor");
        vector.add("Petr");
        vector.add("Semen");
        vector.add("Vlad");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.remove(2);
        System.out.println(vector  );

    }
}
