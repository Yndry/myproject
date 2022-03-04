package zaurTregulov.collections.Queue;

public class PriorityQueue {
    /**
     * В LinkedlistQue первый добавленный элемент находится в верху списка.
     * В PriorityQueue дела обстоят не так. При вызове элемента в PriorityQueue
     * будет вызываться тот элемент, что самый высокий по приоритету.
     * Идет сортировка String  или Integer/ Если класс к примеру Student то надо применять Comparable  или Comparator
     * Наивысший приоритет имеет наименьший элемент
     */

    /**
     * К%огда просто с помощью метода  System.out.println(priorityQueue); выыводим содержимое очереди
     * на экран то у вывода очереди нет сортировки
     * @param args
     */
    public static void main(String[] args) {

        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(8);
        priorityQueue.add(2);
        priorityQueue.add(9);
        priorityQueue.add(6);
        priorityQueue.add(1);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());

    }
}
