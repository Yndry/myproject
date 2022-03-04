package javadeveloperigor.thread;

public class StopThread implements Runnable{
    private Thread self;
    private static int counterStart;
    private int threadId;
    private int counter;
    private volatile boolean canWork;
StopThread() {
    threadId = counterStart++;
    self = new Thread(this, "ThreadStop" + threadId);
}
    public int start() {
canWork = true;
       self.start();
        return counter;
    }
    public int interrupt() {

        self.interrupt();
        return counter;
    }

    public int join(int ms) throws InterruptedException {
    self.join(ms);
    return counter;
    }

    public int stop() {
    canWork = false;
    return counter;
    }
    @Override
    public void run() {
    while (canWork) {

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.println("Enterupt phiish"); break;
        }
        counter++;
    }
    }
}
