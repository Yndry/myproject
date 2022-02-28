package javadeveloperigor.Sintaxis.RoadController;

public class Camera {
    public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3500. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();

        Car car = new Car();
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = randomWeight;
        car.hasVehicle = Math.random() > 0.5; // Передает true если рандомное число больше 0.5 Чтоб как то менять занчения или true или false.
        // Вероятность появления true или false 50%
        car.isSpecial = Math.random() < 0.15; // Передает true если рандомное число меньше 0.15

        return car;
    }
}

