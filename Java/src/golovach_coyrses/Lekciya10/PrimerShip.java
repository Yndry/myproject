package golovach_coyrses.Lekciya10;

class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() {}
    }
    class Wheel1 {
    public void inflate(int psi) {}
    }
    class Windows {
    public void rollup() {}
    public void rolldown() {}
    }
    class Dorr {
    public Windows windows = new Windows();
    public void open() {}
    public void clouse() {}
    }


public class PrimerShip{
    public Engine engine = new Engine();
    public Wheel1[] whill = new Wheel1[4];
    public Dorr
            left = new Dorr(),
            right = new Dorr();
    public PrimerShip() {
        for(int i=0; i<4;i++)
            whill[i] = new Wheel1();
    }

    public static void main(String[] args) {
PrimerShip primerShip = new PrimerShip();
Dorr s = new Dorr();


    }
}