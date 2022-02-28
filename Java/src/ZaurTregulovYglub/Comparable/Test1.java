package ZaurTregulovYglub.Comparable;

import java.util.*;


class Employ {
    int id;
    String name;

    public Employ (int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}



public class Test1 {
    public static void main(String[] args) {
        Employ emp1 = new Employ(2, "Erm");
        Employ emp2 = new Employ(3, "Ert");
        List <Employ> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        Collections.sort(list, new Comparator<Employ>() {
            @Override
            public int compare(Employ o1, Employ o2) {
                return 0;
            }
        });
        System.out.println(list);
    }
}





