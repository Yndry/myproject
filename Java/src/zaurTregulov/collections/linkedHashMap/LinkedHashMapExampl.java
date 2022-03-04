package zaurTregulov.collections.linkedHashMap;

import zaurTregulov.collections.treeMap.StudentTreemap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapExampl {
    public static void main(String[] args) {
        LinkedHashMap<Double, StudentTreemap> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);

        /**
         * LinkedHashMap<>(16, 0.75f, false); (количество элементов), (порядок заполнения после чего увеличивается в 2 раза)
         * (порядок добавлеия элементов false - порядок добавления - как были добавлены последовательно.
         *                              true - порядок будет меняться в зависимости от того какие елементы были использованны в каком порядке
         *                              put и get можно считать за использование
         *                              последним в LinkedHashMap будет идти тот который мы использовали последним
         *                              Предпоследним идет элемент, который мы использовали предпоследним)
         */
        StudentTreemap st1 = new StudentTreemap("Petr", "Petrov", 27);
        StudentTreemap st2 = new StudentTreemap("Petr", "Petrov", 27);
        StudentTreemap st3 = new StudentTreemap("Sidr", "Sidorov", 21);
        StudentTreemap st4 = new StudentTreemap("Ivan", "Ivanov", 25);
        StudentTreemap st5 = new StudentTreemap("Vlad", "Vladov", 23);
        StudentTreemap st6 = new StudentTreemap("Zaur", "Zaurov", 19);
        StudentTreemap st7 = new StudentTreemap("Igor", "Igorev", 27);
        StudentTreemap st8 = new StudentTreemap("Igor", "Igorev", 27);
        linkedHashMap.put(4.6, st1);
        linkedHashMap.put(6.6, st5);
        linkedHashMap.put(7.6, st3);
        linkedHashMap.put(6.1, st2);
        linkedHashMap.put(9.6, st7);
        linkedHashMap.put(9.1, st8);
        linkedHashMap.put(8.8, st6);
        linkedHashMap.put(4.7, st4);
        System.out.println(linkedHashMap);
    }
}
