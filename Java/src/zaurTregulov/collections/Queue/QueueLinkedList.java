package zaurTregulov.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    /**
     * Queue - переводится как очередь
     * Простая очередь, где соблюдается правило FIFO - ferst in first out - кто первый в очереь защел, тот первый и выйдет
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        /**
         * add - добавляет элемент в конец очереди
         * если очередь ограничена, то метод "add" не работает (будет выбрашен exepshion),
         * в этом случае для добавления используется "other"
         */

        /**
         * если удалять методом "remove" то при использовании метода remuve больше раз чем
         * есть в очереди то появится исключение.
         * ТО Для удалления используется метод poll тогда при вызове метода poll болшего колва раз чем
         * колво элементов в очереди, то выдастся просто null
         */

        /**
         * element - показывает верхний элемент в очереди, если элементов нет в очереди то выбрасывает exeption
         */

        /**
         * peek - показывает верхний элемент в очереди, если элементов нет в очереди то не выбрасывает exeption
         * если в очереди ничего не осталось, то метод просто вернет null
         */

        queue.add("Zaur");
        queue.add("Petr");
        queue.add("Sergey");
        queue.add("Aleksandr");
        /**queue.offer("Mariya");
           */
        System.out.println(queue);
       //queue.remove();
        queue.remove();
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());

    }


}
