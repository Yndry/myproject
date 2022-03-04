package javadeveloperigor.vtb.oopLekciya2.dz2;

public class Robot implements Move{
    public static int maxJump = 100;
    public static int maxRun = 2000;

    public static int getMaxJump() {
        return maxJump;
    }

    public static void setMaxJump(int maxJump) {
        Robot.maxJump = maxJump;
    }

    public static int getMaxRun() {
        return maxRun;
    }

    public static void setMaxRun(int maxRun) {
        Robot.maxRun = maxRun;
    }

    @Override
    public void run(int move) {
        System.out.println("Robot может бегать");
    }

    @Override
    public void jump(int height) {
        System.out.println("Robot может прыгать");
    }
}
