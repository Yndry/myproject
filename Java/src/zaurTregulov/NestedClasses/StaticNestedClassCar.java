package zaurTregulov.NestedClasses;

import java.awt.*;

/**
 * Нам нужны nested классы тогда, когда мы хотим привязать класс к другому.
 * Сделать его элементом внешнего класса
 */

public class StaticNestedClassCar {

      String color;
      int doorCount;
      Engine engine;

    public StaticNestedClassCar(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    /**
     * Создадим Static Nested Class
     */
    public static class Engine {
        int horsePower;
        private static int countOfEngine;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            System.out.println(countOfEngine);
            //Так напрямую обраться уже не могу
            // System.out.println(dorcount);
        }


        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}


/**
 * //Test Class
 */


class Test {
    public static void main(String[] args) {

        /**
         * создадим Обьект класаа Engine с кол-вом лошадиных сил 250
         * Мы должны показать внутри какого класса находится static nested class Engine
         */
        /**
         * Static Nested Class можем использовать как статичный внешний класс.
         * Создадим вложенный класс Engine без создания внешнего класса Car
         * Для этого перед нашим вложенным классом должны указать в каком внешнем классе находится наш nested class
         */
        /**
         * Static nested Class может вести себя как обычный внешний класс
         */
        StaticNestedClassCar.Engine engine = new StaticNestedClassCar.Engine(250);
        System.out.println("Класс Engine " + engine);

        /**
         * создадим class Car
         */
        StaticNestedClassCar car = new StaticNestedClassCar("RED", 4, engine);
        System.out.println("Класс Car " + car);
        /**
         * Static Nested Class можем использовать как статичный внешний класс
         * Единственное что его отдичает это то что он находится внутри другого класса.
         */

        //Такое написание будет неверным
        //StaticNestedClassCar.Engine engine2 = new car.Engine(150);

        /** если сделаем prived, то не сможем создать обьект этого класса в другом внешнем классе.
         *
         *  prived static class Engine {
         *         int horsePower;
         */

        /**
         * static Nested class можем написаь и
         * 1) finel и теперь мы не можем иметь наследников от этого класса.
         * 2) abstract - мы не можем содать обьект этого класса
         *  public abstract static class Engine
         *  3) может extend другой класс
         *   public abstract static class Engine extends Z {}
         */
        /**
         * Static nested class может содержать static и non static элементы (переменные)
         */
        /**
         * Static nested class может обращаться к private элементам внешнего класса, но толлько к static
         */
        /**
         * Внешний класс может обращаться даже к к private элементам static nested class
         */


    }
}
class Z{};

