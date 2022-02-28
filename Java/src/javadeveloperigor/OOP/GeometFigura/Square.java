package javadeveloperigor.OOP.GeometFigura;

public class Square extends Rectangle {

    public Square(int wight, int height) {
        super(wight, height);
        if (wight != height) System.out.println("The wight does'n equalse the height");
    }

    public Square(int width) {
        super(width, width);
    }

    public void setWidth(int width) {
        setWight(width); // Пишем this чтоб просто не путатьс в двух переменных одинаковых
        setHeight(width); // могли б тоже писать this но нет необходимости т.к.
    }

    public void setHeight(int height) {
        setHeight(height);
        setWidth(height);
    }

}
