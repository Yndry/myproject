package ZaurTregulovYglub.multithreading;

//Interapshion Thread
// прерываание Потока
public class PrerivanieThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread100 = new InterruptedThread();
        thread100.setName("InterruptedThread");
        thread100.start();

        //прервем поток из потока Main

        Thread.sleep(2000);
        thread100.interrupt();

        thread100.join();
        //Но метод interrapt() не прерывает поток
        // он не может быть прерван из другого потока. Но пток может сам проверить
        // хотят ли его прервать.
        // поток Main хочет прервать поток thread1
        //Main посылает сигнал что он хочет прервать поток. а поток thread1 может проверить, хотят ли его прервать
        //увидев что его хотят прервать рограммист может написать код прерывающий поток или продолжить
        //его работу
        System.out.println("Main is ends");
    }
}

//создадим один поток
//Будем считать сумму всех чисел от 1 до 1 000 000
class InterruptedThread extends Thread {
    double sqrtSum = 0;

    // @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is started");
        //сделаем чтобы он работал несколько секунд
        for (int i = 1; i <= 1000000000; i++) {
            //Проверим, хотят ли прервать поток
            //он вернет true когда какой то поток захочет его прервать
           // System.out.println(isInterrupted());
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать.");
                System.out.println("Убедились что состояние всех данных нормальное " +
                        "и завершаем поток");
                return;
            }
            //Если поток не прерывают, то мы продолжаем работу
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}