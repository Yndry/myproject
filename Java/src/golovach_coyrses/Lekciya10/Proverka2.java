package golovach_coyrses.Lekciya10;


public class Proverka2 {

}

class Soup1 {
    private Soup1() {}
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    private static Soup2 sp = new Soup2();
    public static Soup2 aaccese() {
        return sp;
    }
}

