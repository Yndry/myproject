package javadeveloperigor.vtb.oopLekciya2.dz2;

public class TestDz2 {
    public static void main(String[] args) {
        Move catInterface = new Cat(2000,1000);
        Move peopleInterface = new People();
        Move robotInterface = new Robot();
        Move[] array = new Move[3];
        array[0] = catInterface;
array[1] = peopleInterface;
array[2] = robotInterface;
        for (Move arr: array) {
            arr.run(2);
            arr.jump(2);
        }
        Dorogka dorogka = new Dorogka();
    //dorogka.runDorogka(catInterface.);
    }
}
