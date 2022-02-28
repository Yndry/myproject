package javadeveloperigor.thread.TikTak;

//public class Test {
//    static int num;
//
//    public static void main(String[] args) {
//    Object monitor = new Object();
//   Runnable runnable = new Runnable() {
//       @Override
//       public void run() {
//           ThreadOne th1 = new ThreadOne(monitor);
//       }
//   };
//
//
//    }
//
//
//
//
//    class ThreadOne extends Thread {
//
//    private Object monitor;
//
//    public ThreadOne(Object monitor) {
//        this.monitor = monitor;
//    }
//
//    public void run () {
//        try {
//
//            for (int i = 0; i < Test.MainThread; i++) {
//                System.out.print(1+" - ");
//                synchronized (monitor) {
//                    monitor.notify();
//                    if (i < Test.num-1)
//                        monitor.wait();
//                }
//            }
//        }
//        catch (InterruptedException e) { e.printStackTrace(); }
//    }
//}
//
//class ThreadTwo implements Runnable
//{
//    private Object monitor;
//
//private Thread thread;
//
//    public Thread getThread() {
//        return thread;
//    }
//
//    public ThreadTwo(Object monitor) {
//        this.monitor = monitor;
//        thread = new Thread(this);
//
//    }
//    public void run() {
//        try {
//            Thread.sleep(1);
//            for (int i = 0; i < Test.num; i++) {
//                System.out.println(2);
//                synchronized (monitor) {
//                    monitor.notify();
//                    if (i < Test.num-1)
//                        monitor.wait();
//                }
//            }
//        }
//        catch (InterruptedException e) { e.printStackTrace(); }
//    }
//}
