package ZaurTregulovYglub.multithreading;

public class ThreadEx2 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 10000; i++) {
            System.out.println("Potok1 " + i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadEx2());
        thread1.start();
        for (int i = 10000; i > 0; i--) {
            System.out.println("Potok 2 " + i);
        }
    }
}
