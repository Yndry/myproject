package javadeveloperigor.thread;

import ZaurTregulovYglub.multithreading.ThreadEx2;

public class AnonimClass {
    public static void main(String[] args) {
        Object obj = new Object();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                   synchronized (obj) {System.out.println("1");}

                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=0; i<10; i++) {
                  synchronized (obj) {System.out.println("2");}

                }
            }
        });
th1.start();
th2.start();
    }
}
