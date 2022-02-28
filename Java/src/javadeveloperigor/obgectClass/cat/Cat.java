package javadeveloperigor.obgectClass.cat;

public class Cat {
    private static final int YEAR_HAS = 2;
    private static final int MIN_WEIGHT_HAS = 10;
    private static final int MAX_EIGHT_HAS = 25;
    private static int catCount;
    private double originWeight;
    private double weight;
private double feedCount;
    private double minWeight;
    private double maxWeight;
    private double mass;
    private ColorCat colorCat;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
catCount++;
    }
    public Cat(double mass) {
        this();
        this.mass = mass;

    }


    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public double getfeedCount() {
        return feedCount;
    }
    public void feed(Double amount)
    {
        weight = weight + amount;
        feedCount += amount;
    }



    public void pipi() {
        weight = weight - 2;
    System.out.println("Kat was pipi");
}

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {

           setCatCount(getCatCount()-1);
            return "Dead";

        }
        else if(weight > maxWeight) {

            setCatCount(getCatCount()-1);
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public static int getYearHas() {
        return YEAR_HAS;
    }

    public static int getMinWeightHas() {
        return MIN_WEIGHT_HAS;
    }

    public static int getMaxEightHas() {
        return MAX_EIGHT_HAS;
    }

    public double getOriginWeight() {
        return originWeight;
    }

    public double getFeedCount() {
        return feedCount;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getMass() {
        return mass;
    }

    public ColorCat getColorCat() {
        return colorCat;
    }

    public void setOriginWeight(double originWeight) {
        this.originWeight = originWeight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFeedCount(double feedCount) {
        this.feedCount = feedCount;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setColorCat(ColorCat colorCat) {
        this.colorCat = colorCat;
    }

    public Cat copyCat(Cat cat) { // копируем текущего кота в cat
        cat.setMass(this.getMass());
cat.setColorCat(this.getColorCat());
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "originWeight=" + originWeight +
                ", weight=" + weight +
                ", feedCount=" + feedCount +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", mass=" + mass +
                ", colorCat=" + colorCat +
                '}';
    }
}
