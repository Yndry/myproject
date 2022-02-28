package zaurTregulov.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
//ключи могут быть любых типов

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sash", "Dobriy");
        map2.put("Misha", "Umniy");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1223, "Ivan Ivanov");
        map1.put(222, "Petr Petrov");
        System.out.println(map1);

        //putIfAbsent - доваь элемент если такого элемента нет
        map1.putIfAbsent(222223, "Petr Sidorov");

        //get - по указанному ключу вывести обьект
        System.out.println(map1.get(222));

        //remove - удаление обьекта по ключу
        map1.remove(222);
        System.out.println(map1);

        //containsValue - возвращает true - если в нашем hashMap содержится определенное значение
        System.out.println(map1.containsValue("Ivan Ivanov"));

        //containsKey - проверяет есть ли hashMao - ключи, которые мы ищем
        System.out.println(map1.containsKey(1223));

        //keySet - возвращает множество всех ключей, которые есть в нашем HashMap.
        System.out.println(map1.keySet());

        //values - возвращает множество значений в нашем HashMap
        System.out.println(map1.values());

        //entrySet
    }
}
