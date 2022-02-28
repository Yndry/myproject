package javadeveloperigor.vtb.oopLekciya2.dz2;

public class Cat implements Move{
    public static int maxJump = 2;
    public static int maxRun = 1000;

    private int runDistance;
    private int heigthtJump;



    public static int getMaxJump() {
        return maxJump;
    }

    public static void setMaxJump(int maxJump) {
        Cat.maxJump = maxJump;
    }

    public static int getMaxRun() {
        return maxRun;
    }

    public static void setMaxRun(int maxRun) {
        Cat.maxRun = maxRun;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getHeigthtJump() {
        return heigthtJump;
    }

    public Cat(int runDistance, int heigthtJump) {
        this.runDistance = runDistance;
        this.heigthtJump = heigthtJump;
    }

    @Override
    public void run(int move) {
        System.out.println("Кот может бегать");
    }

    @Override
    public void jump(int height) {
        System.out.println("Кот может прыгать");
    }
}
