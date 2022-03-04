package javadeveloperigor.thread.filisivJava;

public class LiftOff {
    public static void main(String[] args) {
        Work work = new Work();
        work.run();
    }
}

class Work implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public Work() {
    }

    public Work(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftoFF!") + "), ";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
Thread.yield();
        }
    }
}
