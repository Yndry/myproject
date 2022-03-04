package ZaurTregulovYglub.multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread 10: Попытка захваить монитор обьекта Lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread 10: Монитор обьекта Lock1 захвачен");
// Произведем синхронизация монитора обьекта Lock2
            System.out.println("Thread 10: Попытка захваить монитор обьекта Lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread 10: Монитор обьектов  Lock 1 and Lock2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread 20: Попытка захваить монитор обьекта Lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread 20: Монитор обьекта Lock2 захвачен");
// Произведем синхронизация монитора обьекта Lock1
            System.out.println("Thread 20: Попытка захваить монитор обьекта Lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread 20: Монитор обьектов  Lock 1 and Lock2 захвачены");
            }

        }
    }
}