package pofeesionalRenewed.map;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {

    /**
     * использует в себе слаые ссылки
     *
     */

    /**
     * конструктор по дефолту создается со значением Capasity (16) и load factor (0.75)
     *
     * методы такие же как в интерфейсе MAP
     */
    public static void main(String[] args) {
        Map<String, String> weakHashmap = new java.util.WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();
        //создадим 2 строковых значения
        String kewWeakHashMaP = new String("kewWeakHashMaP");
        String kewHashMap = new String("kewHashMap");

        weakHashmap.put(kewWeakHashMaP, "weakHash");
        hashMap.put(kewHashMap, "Hash");

        System.out.println("Befor garbage collector " + weakHashmap.get("kewWeakHashMaP") + " " + hashMap.get("kewHashMap"));

        //обнулим 2 сильные ссылки

        kewHashMap = null;
        kewWeakHashMaP = null;

        //вызываем GarbageCollector

        System.gc();
        System.out.println("After garbage collector " + weakHashmap.get("kewWeakHashMaP") + " " + hashMap.get("kewHashMap"));









    }

}
