package javadeveloperigor.thread;

public class TestStopThread {
    public static void main(String[] args) throws InterruptedException {
        StopThread stopThread = new StopThread();
        System.out.println("Start - " + stopThread.start());
        System.out.println("Join() - " + stopThread.join(1000));
        System.out.println("stop() - " + stopThread.stop());
    }
}
