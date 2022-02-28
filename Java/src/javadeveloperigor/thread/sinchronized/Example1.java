package javadeveloperigor.thread.sinchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example1 {
    public static void main(String[] args) {
        new Worker().main();
    }
}
class Worker{
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    Random random= new Random();
    public void main() {
      Thread thread1 =new Thread(new Runnable() {
          @Override
          public void run() {
         work();
          }
      });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
           work();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list1.size());
        System.out.println(list2.size());
    }
    public void addList1() {
        synchronized (list1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addList2() {
        synchronized (list2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void work() {
        for(int i=0; i<2000; i++) {
        addList1();
        addList2();
        }
    }

}
