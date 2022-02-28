package ZaurTregulovYglub.multithreading;

public class Daemon_Threads {
    public static void main(String[] args) {
        System.out.println("Main Thread starts");
        UserThread thread1 = new UserThread();
        thread1.setName("UserThread");
        DeamonThread thread2 = new DeamonThread();
        thread2.setName("DaemonThread");
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread end");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is DeamonThread " + isDaemon());
        for (char ch = 'A'; ch <= 'J'; ch++) {
            try {
                sleep(1000);
                System.out.println(ch);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DeamonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is DeamonThread");
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(200);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}