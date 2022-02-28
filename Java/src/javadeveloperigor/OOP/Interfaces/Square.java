package javadeveloperigor.OOP.Interfaces;

import javadeveloperigor.OOP.AbstractClass.Rectangle;

public class Square extends Rectangle { //т.к. Square наследуется от Rectangle а Rectangle наследуется
    // от Figure то и класс Color будет унаследован

    public Square(double wight, double height) {
        super(wight, height);
        if (wight != height) System.out.println("The wight does'n equalse the height");
    }

    public Square(double width) {
        super(width, width);
    }

    public void setWidth(double width) {
        setWight(width); // Пишем this чтоб просто не путатьс в двух переменных одинаковых
        setHeight(width); // могли б тоже писать this но нет необходимости т.к.
    }

    public void setHeight(double height) {
        setHeight(height);
        setWidth(height);
    }


}
