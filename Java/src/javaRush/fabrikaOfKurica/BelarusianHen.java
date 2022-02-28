package javaRush.fabrikaOfKurica;

public class BelarusianHen extends Hen{

    public String getDescription() {
        return super.getDescription() + " Моя страна - " + Country.BELARUS +  " Я несу " +
                this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 10;
    }
}
