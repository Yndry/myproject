package ZaurTregulovYglub.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Поиск факториала используя интерфейс Runnable
 */
public class CallabaleAndFutureex1 {
    public static int factorialResailt;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        /**
         * Создадим обьект класса факториалл
         */
        Factiriall factiriall = new Factiriall(5);
        executorService.execute(factiriall);
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        /**
         * Если мы не попросим Main поток подождать с помощью awaitTermination
         * то он сразу будет вывоить factoriallResault/
         * Он не дождется выполнения метода Run() а выведет значение factotialResault его значение.
         * А эего хначение будет =0
         */
        System.out.println(factorialResailt);
    }
}

/**
 * Недостатки - приходится вне метода Run использовать переменную f чтобы передать
 */
class Factiriall implements Runnable {
    /**
     * Будем передавать factorialResailt  переменную факториалл Для того чтобы передать результат  resault
     * т.к. rturn type Run() - Void
     * Также не можем выбросить exeption Если пользователь введет неверное число т.к. Интерфейс Runnable
     * не выбрасывает Exeption
     * Это недостаток интерфейса Runnable
     */
    int f;

    public Factiriall(int f) {
        this.f = f;
    }

    @Override
    public void run() {
        if (f <= 0) {
            System.out.println("Вы ввели неверное число");
            return;
        }
        int resault = 1;
        for (int i = 1; i <= f; i++) {
            resault *= i;
        }
        /**
         * rsault поместим в переменную RunnableFactirial
         */

CallabaleAndFutureex1.factorialResailt=resault;

    }
}
