package ZaurTregulovYglub.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceEx2 {
    //Создаем Executor Service
    public static void main(String[] args) {
        //один поток будет выполнять всю работу
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//       for(int i =0; i<10; i++) {
//           scheduledExecutorService.execute(new RunnableImp200());
//       }
        //метод schedule выполнит наши операции через определенный момент времени
        //Пройдет 3 секунды и задание начнет выполняться
//        scheduledExecutorService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS);
//        //завершим работу scheduledExecutorService

        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
        //Отсрочим момент завершения работы   scheduledExecutorService поработает
        //10 сек выполняя задания с периодичностью в 1 сек
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService.shutdown();

        ScheduledExecutorService scheduledExecutorService1 = Executors.newScheduledThreadPool(1);
        scheduledExecutorService1.scheduleWithFixedDelay(new RunnableImp200(), 3, 1, TimeUnit.SECONDS);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledExecutorService1.shutdown();
        //создаем кешированный ThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Будет создавать новые потоки по надобности
    }
}

    class RunnableImp200 implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Begin works");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " End works");
        }
    }

