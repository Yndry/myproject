package pofeesionalRenewed.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HashTable {
    /**
     * Capasity создается 11 loadFactor 0.75
     * чем отличается hash table от CancaredHashTable
     *
     *
     *
     */

        public List<String> students;

        public HashTable() {
            students = new ArrayList<>();
            students.add("Сергей Фрединский");
            students.add("Виталий Правдивый");
            students.add("Максим Козыменко");
            students.add("Наталия Андрющенко");
            students.add("Ира Величенко");
            students.add("Николай Соболев");
            students.add("Снежана Слободенюк");
            String s = "ljk;444lj;ldjf";
            char ch;
            int rez = 0;
            for (int i = 0; i<s.length(); i++) {

              //  System.out.print(Character);
                     }
            System.out.println(rez);

        }

        public void exclude(String excludedStudent) {
            for (String s : students) {
               // if (excludedStudent.equals(s)) students.remove(excludedStudent);


               }

        }

        public static void main(String[] args) {
            HashTable universityGroup = new HashTable();
            universityGroup.exclude("Виталий Правдивый");
            universityGroup.students.forEach(System.out::println);
        }

    }

