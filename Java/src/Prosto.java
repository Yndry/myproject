public class Prosto extends Thread{
    public void run() {
        for (int i = 0; i<=10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ex1());
        Prosto thread2 = new Prosto();
        thread1.start();
        thread2.start();
        System.out.println("End");
    }


}
class Ex1 implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Ex");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
