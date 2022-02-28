package ZaurTregulovYglub.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

//import static sun.swing.SwingUtilities2.submit;

/**
 * Задача поиск суммы чисел от 1 до 1 000 000 000
 * Используя при этом 10 потоков
 */
public class CallableEx2 {
    public static long value = 1_000_000_000L;
    public static long sum = 0L;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
/**
 * Для удобства работы с результатами этих task создадим List
 */
        List<Future<Long>> list = new ArrayList<>();
        /**
         * Создадим переменную для разделения заданий
         */
        long valueDevidedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            /**
             * Создаем 10 tASK 1 - 1_000_000
             * 1_000_001 - 2_000_000
             * ...
             * 9_000_001 - 1_000_000_000
             * и каждому потоку передаем по 1му task
             * и результат помещаем в arrayList
             */
            long from = valueDevidedBy10 * i + 1;
            long to = valueDevidedBy10 * (i + 1);
            /**
             * Создаем обьект
             */
            PartialSumm partialSumm = new PartialSumm(from, to);
            Future<Long> futerPartsSumm = executorService.submit(partialSumm);
            list.add(futerPartsSumm);
        }
        /**
         * Сложим 10 конечных результатов из arrayList
         */
        for (Future<Long> s : list) {
            sum += s.get();
        }
        executorService.shutdown();
        System.out.println("Наш результат = " + sum);
    }

}

/**
 * partialSumm - частичная суммы
 * чтобы разделить задачу по потокам мы должны сказать потокам с какого
 * и по какое значение считать
 */
class PartialSumm implements Callable<Long> {
    long from;
    long to;
    long localSumm; //Значение суммы для конкретного потока

    public PartialSumm(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSumm += i;
        }
        System.out.println("Summ  From" + from + " Summ to " + to + " = " + localSumm);
        return localSumm;

    }
}