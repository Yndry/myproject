/**
 * Добавляет товар в hashPap если товар вводится вновь прибавляем к существующему количеству 1
 * иначе просто ставим 1
 */


package javadeveloperigor.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExampleHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapCount = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String nameTovar = "";
        int count = 1;
        while (true) {
            count = 1;
            nameTovar = scanner.nextLine();
            if (nameTovar.equals("LIST")) { //если ввели LIST печатаем результат и идем на след цикл
                printMap(mapCount);
                continue;
            }
            if (mapCount.containsKey(nameTovar)) { // если ключ товара соответсвует нашему введеному товару
                count = mapCount.get(nameTovar) + 1; // то в count записываем колво тавара уже имеющегося и прибавляем 1
            }
            mapCount.put(nameTovar, count); //записываем наш товар - ключ и его count;
            // если товар впервые вводится то caunt так и остается 1, если товар вводится повторно то
            // то в count записывается измененное количество
        }
    }

    // распечатываем товар
    private static void printMap(Map<String, Integer> map) { //в параметре map - для того чтоб туда можно передавать и hashPap и TreeMap
        /**
         * Можно и так
         * Получаем set ключей
         * Set<String> keys = map.keySet();
         * for(String key : keys) { // пробигаемся по setу Keys
         *     System.out.println(key + " => " + map.get(key));
         * }
         */

        for (String key : map.keySet()) {// у map получаем set ключей
            System.out.println(key + " => " + map.get(key)); // распечатываем ключ и соответсвующее ему значение
            //map.get(key) -- получаем значение по ключу
        }
    }
}
