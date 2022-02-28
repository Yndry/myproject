package javadeveloperigor.thread.reentrantLock;

import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock
 * как и synchronized
 */
public class Example1 {

    public static void main(String[] args) {
       Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
               task.firstThread();

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
               task.seconThread();
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
        task.showCounter();

    }

}

class Task {
    private int counter;
    private Lock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 100000; i++) {
            counter++;
        }
    }

    public void firstThread() {
        lock.lock();
        increment();
        System.out.println("Thread1");
        lock.unlock();
    }

    public void seconThread() {
        lock.lock();
        increment();
        System.out.println("Thread2");
        lock.unlock();
    }

    public void showCounter() {
        System.out.println("Counter = " + counter);
    }
}
