package ZaurTregulovYglub.multithreading;

public class ThreadEx3 {
    public static void main(String[] args) {
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println("Helloy");
    }
}).start();
    }
}
