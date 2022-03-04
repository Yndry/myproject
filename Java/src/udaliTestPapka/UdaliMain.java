package udaliTestPapka;

import DrugouVideoKurs.Udali;
import javadeveloperigor.thread.summElemMassiveThread.GlobalData;

import java.util.*;
import java.util.concurrent.*;

public class UdaliMain {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();

    public static void main(String[] args) {
        new Worker().main();
    }

    static class Worker {
        Random random = new Random();

        public void work1() {
            synchronized (list) {
                for (int i = 0; i < 1000; i++) {
                    list.add(random.nextInt());
                }
            }
        }

        public void work2() {
            synchronized (list2) {
                for (int i = 0; i < 1000; i++) {
                    list2.add(random.nextInt());
                }
            }
        }

        public void main() {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    work1();
                    work2();
                }
            });
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    work1();
                    work2();
                }
            });
            thread.start();
            thread1.start();
            try {
                thread.join();
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("List 1 = " + list.size());
            System.out.println("List 2 = " + list2.size());


        }
    }
}