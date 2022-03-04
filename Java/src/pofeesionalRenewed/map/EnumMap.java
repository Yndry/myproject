package pofeesionalRenewed.map;

import java.util.Map;
import java.util.Set;

public class EnumMap {
    public static void main(String[] args) {
        /**
         * В качестве ключей будем держать enum  и они будут отрабатывать значительно быстрее чем
         * hashMap
         * enumMap используются enum в качестве перечисления. И это свойство позволяет делать enumMap
         *  на базе массива.
         *  В качестве ключей не можем передать null но в качестве значений можем передать null
         *  В каком порядке добавили enumMap в таком порядке и будет выводится.
         *  Позволяет реализовать enumMqp в качестве массивов поэтому все основные методы будут выполняться за постоянное время
         */
        /**
         * EnumMap не является синхронизированным классом.
         * Если мы хотим сделать синхронизированным то
         * Collections.synchronizedMap(enumMap)  и передаем в скобках обьект enummap
         */

        Map<Animal, String> enumMap = new java.util.EnumMap<Animal, String>(Animal.class); // Создали обьект EnumMap
        enumMap.put(Animal.CAT, "C");
        enumMap.put(Animal.DOG, "D");
        enumMap.put(Animal.BIRD, "B");

        /**
         * При выводе на экран enumMap мы не можем воспользоваться итератором так как в enumMap нет интерфейса MapEntry
         *
         *  Мы создадим Set в Set передадим EntrySet и дальше итератором пробежимся по sET
         */

        /**
         * Набер set.iter и нажмем TAB на клавиатуре fdnjvfnjv cjplfcnmz foreach
         */

        Set set = enumMap.entrySet();
        for (Object o : set) {
            //Что бы не было ошибки скастим до Map Entry
            Map.Entry m = (Map.Entry) o;
            //Выведем на экран наш ключ и значение
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, BIRD
}
