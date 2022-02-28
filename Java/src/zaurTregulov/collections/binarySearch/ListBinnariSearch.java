package zaurTregulov.collections.binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListBinnariSearch {
    public static void main(String[] args) {
        Employ emp1 = new Employ(10, "Ivan", "Ivanov", 23.22);
        Employ emp2 = new Employ(1,"Petr", "Petrov", 23.434);
        Employ emp3 = new Employ(1, "Sidr", "Sidorov", 222.3);
        Employ emp4 = new Employ(5, "Mariya", "Ivanova", 222.34);
        List<Employ> employList = new ArrayList<>();
        employList.add(emp1);
        employList.add(emp2);
        employList.add(emp3);
        employList.add(emp4);
        System.out.println(employList);
        Collections.sort(employList);
        System.out.println(employList);
        int number = Collections.binarySearch(employList, new Employ(1, "Sidr", "Sidorov", 222.3));
        System.out.println(number);
        Collections.shuffle(employList);
        System.out.println("Shafle" + employList);
        Collections.sort(employList);
        Collections.reverse(employList);
        System.out.println("Reverse" + employList);
    }

}
class Employ implements Comparable<Employ>{
    private int id;
    private String name;
    private String sorname;
    private double salary;

    public Employ(int id, String name, String sorname, double salary) {
        this.id = id;
        this.name = name;
        this.sorname = sorname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employ{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sorname='" + sorname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employ enotheEmp) {
        int res = this.id- enotheEmp.id;
        if(res == 0) {
            res = this.name.compareTo(enotheEmp.name);
        }
        return res;
    }
}
