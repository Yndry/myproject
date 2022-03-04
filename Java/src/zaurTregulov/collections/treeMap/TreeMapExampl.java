package zaurTregulov.collections.treeMap;

import zaurTregulov.generics.game.Student;

import java.util.TreeMap;

/**
 * Основная функция treeMap - нахождение ренжей (отрезков)
 */

public class TreeMapExampl {
    public static void main(String[] args) {
        TreeMap<Double, StudentTreemap> treeMap = new TreeMap<>();
StudentTreemap st1 = new StudentTreemap("Petr", "Petrov", 27);
        StudentTreemap st2 = new StudentTreemap("Petr", "Petrov", 27);
        StudentTreemap st3 = new StudentTreemap("Sidr", "Sidorov", 21);
        StudentTreemap st4 = new StudentTreemap("Ivan", "Ivanov", 25);
        StudentTreemap st5 = new StudentTreemap("Vlad", "Vladov", 23);
        StudentTreemap st6 = new StudentTreemap("Zaur", "Zaurov", 19);
        StudentTreemap st7 = new StudentTreemap("Igor", "Igorev", 27);
        StudentTreemap st8 = new StudentTreemap("Igor", "Igorev", 27);
        treeMap.put(5.5, st1);
        treeMap.put(5.1, st5);
        treeMap.put(4.9, st3);
        treeMap.put(5.8, st7);
        treeMap.put(5.2, st4);
        treeMap.put(4.6, st2);
        treeMap.put(5.9, st6);
        treeMap.put(3.9, st8);
        System.out.println(treeMap);
        System.out.println(treeMap.get(5.2));
        treeMap.remove(5.9);
        System.out.println(treeMap);
/**
 * descendingMap() - развернем treeMap - теперь элементы будут выводиться не по возврастанию про значению ключа
 * а по убыванию значения ключа.
 */
         System.out.println(treeMap.descendingMap());

        /**
         * tailMap(3.9) - вывод значений по ключу всех у кого выше указанного значения.
         */
        System.out.println(treeMap.tailMap(5.9));
/**
 * headMap(5.1) - вывести значения по ключу ниже определенного значения
 */
        System.out.println(treeMap.headMap(5.1));

        /**
         * lastEntry() - вывод элемента, находящегося в самом конце
         */
        System.out.println(treeMap.lastEntry());

        /**
         * firstEntry() - вывод первого элемента
         */
        System.out.println(treeMap.firstEntry());
    }

}
