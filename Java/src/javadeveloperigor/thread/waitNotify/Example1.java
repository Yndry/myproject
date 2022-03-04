package javadeveloperigor.thread.waitNotify;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Object object = new Object();
        WaitAndNotify wn = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
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

class WaitAndNotify {
    private Object lock = new Object();
    public void produce() throws InterruptedException {
synchronized (lock) {
    System.out.println("Produser thread started...");
    lock.wait();
    System.out.println("Produser thread resumed");
}
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in); // чтобы по нажатию Enter программа родолжилась
        synchronized (this) {
            System.out.println("Waitin for return Kew pressed");
            scanner.nextLine();
            lock.notify();
        }

    }
}
