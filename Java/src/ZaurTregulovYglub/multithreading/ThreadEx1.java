package ZaurTregulovYglub.multithreading;

public class ThreadEx1 extends Thread {
    public void run() {
        System.out.println("dd");
    }

    public static void main(String[] args)  {
    ThreadEx1 myThread = new ThreadEx1();
    myThread.start();

        for (int i = 1; i < 1000; i++) {
            System.out.println();

        }
    }
}