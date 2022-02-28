package ZaurTregulovYglub.multithreading;

import java.util.concurrent.*;

public class CallableEx1 {
    public static int factorialResailt;

    public static void main(String[] args) {
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        /**
         * Создадим обьект класса факториалл
         */
        Factiriall1 factiriall1 = new Factiriall1(-5);
        /**
         * Для collable() мы не можем использовать Execute т.к он принимает в параметр только Runnable
         * Используем для вызова call() sibmint
          */
        /**результат выполнения хранится в обьекте типа futer
         *
         */
        Future<Integer> future =executorService1.submit(factiriall1);
/**
 * Получим результат с помощью метода get()
 */
        try {
            System.out.println("Futer is done? " + future.isDone());
            factorialResailt = future.get();
            System.out.println("Futer is Done? " + future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        //executorService1.shutdown();
//        try {
//            executorService1.awaitTermination(10, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            /**
//             * с помощью метода get getCause() выбросим наш комментарий Exeption из Call()
//              */
//            e.getCause();
//        }
        /**
         * Если мы не попросим Main поток подождать с помощью awaitTermination
         * то он сразу будет вывоить factoriallResault/
         * Он не дождется выполнения метода Run() а выведет значение factotialResault его значение.
         * А эего хначение будет =0
         */
        /**
         * ExecuteServecsis правильнее закрывать в finnali блоках
         */
        finally {
            executorService1.shutdown();
        }
        System.out.println(factorialResailt);
    }
}

/**
 * Недостатки - приходится вне метода Run использовать переменную f чтобы передать
 */
class Factiriall1 implements Callable<Integer> {
    /**
     * Будем передавать factorialResailt  переменную факториалл Для того чтобы передать результат  resault
     * т.к. rturn type Run() - Void
     * Также не можем выбросить exeption Если пользователь введет неверное число т.к. Интерфейс Runnable
     * не выбрасывает Exeption
     * Это недостаток интерфейса Runnable
     */
    int f;
    public Factiriall1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Вы ввели неверное число");
        }
        int resault = 1;
        for (int i = 1; i <= f; i++) {
            resault *= i;
            Thread.sleep(1000);
        }
        return resault;
    }
}
