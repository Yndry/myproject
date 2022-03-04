package golovach_coyrses.Lekciya10;

public class Proverka {
    public static void main(String[] args) {
Burrito plan1 = new Burrito(Enum1.HOT);
Burrito plan2 = new Burrito(Enum1.MIDLE);
Burrito plan3 = new Burrito(Enum1.PUBLIC);
plan1.proverka();
plan2.proverka();
plan3.proverka();
    }
}
class Burrito {
    private Enum1 degres;
    public Burrito(Enum1 degres) {
        this.degres = degres;
    }
    public void proverka() {
switch (degres) {
    case PUBLIC:
        System.out.println("1"); break;
    case HOT:
        System.out.println("2"); break;
    case MIDLE:
        System.out.println("3"); break;
    default:
        System.out.println(4);
}
        }
    }


