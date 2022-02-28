package javadeveloperigor.obgectClass.cat;

public class Loader {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.pipi();


        System.out.println(cat.getStatus());

        Cat cat1 = new Cat();
        cat1.setMass(23.33);
        cat1.setColorCat(ColorCat.BLOO);
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        System.out.println(Cat.getCatCount());
cat2.feed(10000.0);
cat1.feed(10000.0);
        System.out.println("Cat poela eda - " + cat2.getfeedCount());

        System.out.println(cat2.getStatus());
        System.out.println(cat1.getStatus());
        System.out.println(Cat.getCatCount());
        Loader loader = new Loader();
        new Loader().creatNewCat(34.2);
        System.out.println(cat1);
        cat1.copyCat(cat3);
        System.out.println("Cat 3 = " + cat3);
    }

    public void creatNewCat(double mass) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
    }



}