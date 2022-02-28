package javadeveloperigor.vtb.oopLekciya2.dz2;

public class People implements Move{
    public static int maxJump = 5;
    public static int maxRun = 1500;

    public static int getMaxJump() {
        return maxJump;
    }

    public static void setMaxJump(int maxJump) {
        People.maxJump = maxJump;
    }

    public static int getMaxRun() {
        return maxRun;
    }

    public static void setMaxRun(int maxRun) {
        People.maxRun = maxRun;
    }

    @Override
    public void run(int move) {
        System.out.println("Человек может бегать");
    }

    @Override
    public void jump(int height) {
        System.out.println("Человек может прыгать");
    }
}
