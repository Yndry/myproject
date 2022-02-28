package javadeveloperigor.thread.pollThreds;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new WorkA(i));
        }
        executorService.shutdown();
        System.out.println("All Tasks Submitted");
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("All Tasks Submitted");
    }
    }

class WorkA implements Runnable{
private int id;

    public WorkA(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work " + id + " was complited");
    }
}
