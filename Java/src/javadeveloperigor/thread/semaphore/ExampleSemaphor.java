package javadeveloperigor.thread.semaphore;

import java.sql.Connection;
import java.util.concurrent.Semaphore;

/**
 * Используется для ограничения доступа к ресурсам
 * деление ресурса между потоками
 */

/**
 * Пример работа с сервером
 */
public class ExampleSemaphor {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
    }
}
class connection {
//    private static Connection connection = new Connection();
//
//    private Connection() {
//
//    }
}



         /**Semaphore semaphore = new Semaphore(3); //сколько потоков могут одновременно работать
        try {
            semaphore.acquire();
            semaphore.acquire();
            semaphore.acquire();
            // взяли одно разрешение на пользование ресурсом
            // вызываем когда в потоке начинаем взаимодействовать с ресурсом
            System.out.println("All permits have been aquirit");

            semaphore.acquire();

            System.out.println("Can't reach here...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        semaphore.release();//сообщаем что один слот освободился
        // дает разрешение на использование другим потокам этот ресурс
        System.out.println(semaphore.availablePermits()); //- метод возвращает количество свободных разрешений.
          */
//
//    }
//
//}
