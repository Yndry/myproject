//package javadeveloperigor.OOP.AbstractClass;

import java.util.Date;

public class Rectangle {
    private double wight;
    private double height;
    private Date creationTime;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
        setCreatTime(); //задаем дату создания используя метод setCreatTime
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSquare() {
        return wight * height;
    }
    public void setCreatTime() {
        this.creationTime = new Date();
    }
    public Date getCreationTime() {
        return creationTime;
    }

}
