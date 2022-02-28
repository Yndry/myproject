package pofeesionalRenewed.map;


import java.util.Map;
import java.util.Set;

/**
 * IdentityHashMap включает в себя AbstractMap
 * и реализует интерфейсы Map<K,V> , Serializable, Clonable
 *
 * при дефолтном конструкторе создается емкость на 21 элемент
 *
 * Отличие от hashMap испорльзуется сравнение ссылок а не значений
 * При сравнении не используется метод equalse
 * Опреации по добавлению и получению элемента O(1)
 *
 * Формирует hash при помощи System.identityHashCode(Object) а в hashMap используется для этого hashCode
 * Также IdentityHashMap изменяет контракт на hashMap а hashMap нет( используется обычный контракт equalse b hashCode)
 *
   * */

/**
 * Применяется тогда, когда у интерфейса и обьекта нет реализации equalse и hashCode
 * и поэтому эти обьекты сравниваются по ссылке>
 */
//public class IdentityHashMap<I extends Number, S> {
//    public static void main(String[] args) {
//        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();
//        Set set = identityHashMap.entrySet;
//        for (Object o : set) {
//            System.out.println(Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
//            System.out.println(map.getKey() + " " + map.getValue());
//        }
//    }
//}

