package javadeveloperigor.OOP.AbstractClass;

import java.awt.*;

 public abstract class Figure {
    private Color color; // Используем класс Color самой java

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double getSquare(); // обяжем все классы наследники реализовать
     //абстрактный метод getSquare
}
