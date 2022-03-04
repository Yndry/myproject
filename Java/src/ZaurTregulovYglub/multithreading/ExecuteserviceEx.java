package ZaurTregulovYglub.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecuteserviceEx {
    public static void main(String[] args) throws InterruptedException {
        /**
         * первый вариант
         ExecutorService executorService = Executors.newFixedThreadPool(5);
         for (int i=0; i <10; i++) {
         //вызываем метод execute  и передаем ему обьект, котрорый имплементирует Runnable
         executorService.execute(new RunnabelImplements());

         }

         //Завершаем работу сервиса
         executorService.shutdown();
         // awaitTermination() принимает 2 параметра
         //вызываем внутри main значит поток main будет ждать пока executorService не закончит
         //свою работу либо не пройдет указаннгое время в параметре
         executorService.awaitTermination(5, TimeUnit.SECONDS);
         */
        /**
         * Второй вариант
         *
         *  ExecutorService executorService = Executors.newSingleThreadExecutor();
         *        //Все эти 10 заданий будут выполняться одним потоком , кот содержится в нашем
         *         //ThreadPoll
         *         //И все задания будут выполняться поочередно
         *         for (int i=0; i <10; i++) {
         *             //вызываем метод execute  и передаем ему обьект, котрорый имплементирует Runnable
         *             executorService.execute(new RunnabelImplements());
         *
         *         }
         *         executorService.shutdown();
         */

        System.out.println("Main ends");
    }
}

class RunnabelImplements implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

