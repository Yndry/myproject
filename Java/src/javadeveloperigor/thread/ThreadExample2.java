/**
 * Стартуем 2-й поток полсе того как первый завершится на 50 %
 */

package javadeveloperigor.thread;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        Monitor mon = new Monitor(); //  создадим обьект класса монитор
        // при помощи mon будем выполнять синхронизацию

        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 100; i++) {

                    System.out.println("1 - " + i);
                    if (i >= 50) {
//notifiy - из первого потока пробудим второй
                        //работает notify только из блока синхронизации
                        // в блок синхронизации попадаем тогда, когда в блоке синхронизации никто не работает
                        //когда будет weit то код не запускается нагрузки на Процессор нет и код не запустится
                        //если в блок синхронизации попали когда вы в wait то другой поток сможет в блок синхронизации попасть
                        synchronized (mon) {
                            mon.x = i;
                            mon.notify();
                        }
                    }
                }
            }
        });

        // Втрой поток должен простнуться когда mon станет 50
        //чтобы не получилось что поток проснулся раньше надо использовать while

        //wait() можно повесить только на монитор ключевое слово синхронизации
        //ожидание запуска можно привязать толко к монитору
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //чтобы while работал поместим его тоже в блок синхронизации
                // нужно ставить try перед synchronized

                try {
                    synchronized (mon) {
                        while (mon.x < 50)
                            mon.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 100; i++) {
                    System.out.println("2 - " + i);
                }
            }
        });

        // Стартуем оба потока
        th1.start();
        th2.start();
        // Дожидаемся окнчания обоих потоков
        th1.join();
        th2.join();
    }
}

class Monitor {
    int x;
}
