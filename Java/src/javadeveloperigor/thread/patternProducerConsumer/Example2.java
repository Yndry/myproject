package javadeveloperigor.thread.patternProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Сделаем чтобы один поток добавлял новые задания (сущности),
 * а второй поток брал эти сущности и извлекал из очереди.
 */

public class Example2 {


    public static void main(String[] args) {
        Object object = new Object();
        ProducerConsumer pc = new ProducerConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ProducerConsumer {
    private Queue<Integer> queue = new LinkedList();
    private final int LIMIT = 10; //мксимальное количество элементов, которые мы хотим видеть в очереди
    //реализуем обычную очередь. Она не потокобезопасна
    //используем sinchronized wait notify
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        int value = 0;
//не должен добавлять элемент в очередь если она уже полна
        while (true) {
            synchronized (lock) {
                while (queue.size() == LIMIT) {
                    lock.wait();

                }
                queue.offer(value++);
                lock.notify();
            }
        }
    }

    public void consume() throws InterruptedException {
        //не должен брать элемент из пустой очереди ведь элементов там нет
        while (true) {
            synchronized (lock) {
                while (queue.size() == 0) {
                    lock.wait();

                }
                int value = queue.poll();
                System.out.println(value);
                System.out.println("Queue size is " + queue.size());
                lock.notify();
            }
            Thread.sleep(1000); //чтобы producer успел заполнить очередь
        }
    }
}

