package javadeveloperigor.OOP.Interfaces;

public abstract class Figure3D implements FigureInterface {
   public abstract double getVolume(); //метод получения обьема у фигур разный. Поэтому сделаем метод абстрактным
   public abstract  double getSurfaceSquare(); // метод получения площади поверхности
}
