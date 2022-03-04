package javadeveloperigor.thread.summElemMassiveThread;

import java.util.Random;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {
// Проинициализируем массивы обьявленные в классе GlobalDat
        //Заполним массив случайными значениями

        GlobalData.array = new int[GlobalData.ARRAY_LENGTH];
        //Создали массив где будут хранится данные для вычисления.
        GlobalData.result = new long[GlobalData.THREAD_COUNT];
        //Создали массив куда будем помещать результаты вычисления.

        Random random = new Random(47);
        for (int i= 0; i<GlobalData.ARRAY_LENGTH;i++) {
            GlobalData.array[i] = random.nextInt(10);

        }
        //Для проверки работы в одном случае подсчитаем сумму в один поток
        // а в другом случае в есколько потоков
        long summ1=0;
        long t1= System.currentTimeMillis();
        for(int i=0; i<GlobalData.ARRAY_LENGTH;i++) {
            summ1 += GlobalData.array[i];
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Сумма 1 поток = " + summ1 + " Скорость cуммы =  " + (t2-t1));

        //Обьявим массив THread

        Thread[] threads = new Thread[GlobalData.THREAD_COUNT];

        //обьявим счетчик i заранее
        int i;
        for(i=0; i<GlobalData.THREAD_COUNT;i++) {
            threads[i] = new SummThread(i);
                    }
        long th1= System.currentTimeMillis();
        for(i=0; i< GlobalData.THREAD_COUNT;i++) {
            threads[i].start();
        }

        for(i=0; i< GlobalData.THREAD_COUNT;i++) {

                threads[i].join();

        }
        long sum2 = 0;
       for(i =0; i<GlobalData.THREAD_COUNT; i++) {
           sum2+=GlobalData.result[i];
       }
        long th2= System.currentTimeMillis();
        System.out.println("Сумма n потоков = " + sum2 + " Скорость cуммы =  " + (th2-th1));
    }
}
