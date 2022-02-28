package zaurTregulov.collections.Queue;

import java.util.Deque;

public class ArrayDeque {

    /**
     * Deque = Double Ended Queue - двунаправленная очередь
     *
     * Здесь мы можем добавлять последующий элемент как в конец очереди, так и в начало очереди
     * И брать элементы можем как с начала очереди так и с конца очереди
     *
     * Можем использовать правило как FiFO так и LIFO Last In First Out (Последний зашел, первый вышел)
     */
    public static void main(String[] args) {
        Deque<Integer> deque = new java.util.ArrayDeque<>();
        /**
         * addFirst  - addLast - добавление в начало или в конец очереди
         * otherFirst - otherLast тоже добавлнеие
         * removeFirst- removeLast
         * pollFirst pollLast
         * getFirst - getLast
         * peekFirst - peekLast тоже но без исключения
         */
        deque.addFirst(2);
        deque.addLast(10);
        deque.offerLast(6);
        deque.addFirst(8);
        deque.addLast(11);
        deque.offerLast(3);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.peekLast());


    }
}
