package javadeveloperigor.Sintaxis;

public class Loader {
    public static void main(String[] args) {
        int milkAmount = 100; // ml
        int powderAmount = 5; // g
        int eggsCount = 5; // items
        int sugarAmount = 5; // g
        int oilAmount = 30; // ml
        int appleCount = 8;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml

        if(powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1 && oilAmount >= 30)
        System.out.println("Pancakes");

        //milk - 300 ml, powder - 5 g, eggs - 5
        if(milkAmount >= 200 && powderAmount >= 5 && eggsCount >= 5)
        System.out.println("Omelette");

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 5 && eggsCount >=4)
        System.out.println("Apple pie");

      //  System.out.println(milkAmount>20 ? "Yess" : "Now");
    }

    public void reshaemZad2() {
        int vasya = 25;
        int katiya = 22;
        int misha = 25;

        int min = -1;
        int midle = -1;
        int max = -1;

        if( vasya > katiya && vasya > misha) max = vasya;

    }
}
