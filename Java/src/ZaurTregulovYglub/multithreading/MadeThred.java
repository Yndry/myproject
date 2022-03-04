package ZaurTregulovYglub.multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MadeThred {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
list.add(5);
list.add(10);
list.add(20);
list.add(30);
list.add(40);
Iterator<Integer> iter = list.iterator();
while (iter.hasNext()) {
    System.out.println(iter.next());

}
Animal an1 = new Animal("Cat", 2222);
Animal an2 = new Animal("Dog", 22111);
List<Animal> list1 = new ArrayList<>();
list1.add(an1);
list1.add(an2);
list1.add(new Animal("bbb", 20000));
        for (Animal a: list1
             ) {
            System.out.println(a.breath);

        }
        Iterator<Animal> iter2 = list1.iterator();
        while (iter2.hasNext()) {
            iter2.next().price+=1000;
        }
        Iterator<Animal> iter4 = list1.iterator();
        while (iter4.hasNext()) {
            System.out.println(iter4.next());
        }

    }
}
class Animal {
    String breath;
    int price;

    public Animal(String breath, int price) {
        this.breath = breath;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breath='" + breath + '\'' +
                ", price=" + price +
                '}';
    }
}
