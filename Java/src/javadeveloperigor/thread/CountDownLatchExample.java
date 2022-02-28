package javadeveloperigor.thread;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6); //Защелка обратного отсчета
        //Количество итераций которое мы должны отсчитать назад прежде чем защелка отопрется
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 6; i++) {
            executorService.submit(new Processor(countDownLatch));
        }
        executorService.shutdown();
countDownLatch.await();
        System.out.println("Latch open, mane Thread is proceeding");

    }
}
    class Processor implements Runnable {
        private CountDownLatch countDownLatch;
        public Processor(CountDownLatch countDownLatch) {
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("<->");
            System.out.println("Thread name - " + Thread.currentThread().getName());
            countDownLatch.countDown();
            //Отсчитаем countDownLatch назад
            //метод countDown декрементирует countDownLatch на 1
        }

    }

