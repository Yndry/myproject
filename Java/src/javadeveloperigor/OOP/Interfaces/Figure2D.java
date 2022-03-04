package javadeveloperigor.OOP.Interfaces;

import java.awt.*;

public abstract class Figure2D implements FigureInterface {
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

