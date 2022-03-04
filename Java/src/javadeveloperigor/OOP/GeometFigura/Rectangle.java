package javadeveloperigor.OOP.GeometFigura;

import java.util.Date;

public class Rectangle {
    private int wight;
    private int height;
    private Date creationTime;

    public Rectangle(int wight, int height) {
        this.wight = wight;
        this.height = height;
        setCreatTime(); //задаем дату создания используя метод setCreatTime
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSquare() {
        return wight * height;
    }
    public void setCreatTime() {
        this.creationTime = new Date();
    }
    public Date getCreationTime() {
        return creationTime;
    }

}
