/**
 * Сложный код
 */

package javadeveloperigor.Sintaxis.RoadController;

import java.util.Scanner;

public class RoadController {

    private static double passengerCarMaxWeight = 3500.0; // kg
    private static int passengerCarMaxHeight = 2000; // mm
    private static int controllerMaxHeight = 4000; // mm

    private static int passengerCarPrice = 100; // RUB
    private static int cargoCarPrice = 250; // RUB грузовой
    private static int vehicleAdditionalPrice = 200; // RUB плата за прицеп

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");

        Scanner scanner = new Scanner(System.in);
        int carsCount = scanner.nextInt();

        for (int i = 0; i < carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println(car);

            //Пропускаем автомобили спецтранспорта бесплатно
            if (car.isSpecial) {
                openWay();
                continue;
            }

            //Проверяем высоту и массу автомобиля, вычисляем стоимость проезда
            int price = calculatePrice(car);
            if (price == -1) {
                continue;
            }

            System.out.println("Общая сумма к оплате: " + price + " руб.");
        }
    }

    /**
     * Расчёт стоимости проезда исходя из массы и высоты
     */
    private static int calculatePrice(Car car) {
        int carHeight = car.height;
        int price = 0;
        if (carHeight > controllerMaxHeight) { // Проверяем высоту автомобиля
            blockWay("высота вашего ТС превышает высоту пропускного пункта!"); // передаем в метод, причину по которой транспорт не пропускаем
            return -1;
        } else if (carHeight > passengerCarMaxHeight) { // Проверяем высоту пассажирского автомобиля
            double weight = car.weight;
            //Грузовой автомобиль если высота  автомобиля превышает допустимую высоту
            if (weight > passengerCarMaxWeight) {
                price = cargoCarPrice;
                System.out.println(car.number + " - Грузовой авто weight > 3500 Height > 2000" );
                if (car.hasVehicle) {
                    price = price + vehicleAdditionalPrice;
                    System.out.println(car.number + " - Грузовой авто c прицепом weight > 3500 Height > 2000" );
                }
            }
            //Легковой автомобиль
            else {
                System.out.println(car.number + " - Пассажирский авто weight < 3500 Height < 2000" );
                price = passengerCarPrice;
            }
        } else {
            System.out.println(car.number + " - Пассажирский авто weight < 3500 Height < 2000" );
            price = passengerCarPrice;
        }
        return price; // возвращаем итогувую цену
    }

    /**
     * Открытие шлагбаума
     */
    private static void openWay() {
        System.out.println("Шлагбаум открывается... Счастливого пути!");
    }

    /**
     * Сообщение о невозможности проезда
     */
    private static void blockWay(String reason) {
        System.out.println("Проезд невозможен: " + reason);
    }
}
