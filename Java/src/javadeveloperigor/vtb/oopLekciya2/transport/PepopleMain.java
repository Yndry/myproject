package javadeveloperigor.vtb.oopLekciya2.transport;

public class PepopleMain {
    private Transport carentTransport;

public void godrive(Transport transport) {
    transport.drive();
    this.carentTransport=transport;

        }
        public void stop() {
    if (carentTransport!=null) {
        carentTransport.stop();
        carentTransport = null;
    }
    else System.out.println("Я никуда и не еду");
        }

    public static void main(String[] args) {
        PepopleMain pepopleMain = new PepopleMain();
        Car car = new Car();
        pepopleMain.stop();
        pepopleMain.godrive(car);

        Bike bike = new Bike();
        pepopleMain.stop();
        pepopleMain.godrive(bike);
    }
    }


class Car implements Transport {

    @Override
    public void drive() {

        System.out.println("Человек поехал на машине");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил машину");
    }

}
class Bike implements Transport{

    @Override
    public void drive() {
        System.out.println("Человек поехал на мотоцикле");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил мотоцикл");
    }
}
class skateBoard implements Transport{

    @Override
    public void drive() {
        System.out.println("Человек поехал на скейтБоарде");
    }

    @Override
    public void stop() {
        System.out.println("Человек остановил скейтборад");
    }
}
