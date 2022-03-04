package ZaurTregulovYglub.multithreading;
// Используем синхронизацию части кода
public class MagazinHleb {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        //создаем обьекты продюсер и покупатель
        Producer producer = new Producer(market);
        Customer customer = new Customer(market);
        Thread threadProducer = new Thread(producer);
        Thread threadCustomer = new Thread(customer);
        threadProducer.start();
        threadCustomer.start();
    }
}

class Market {
    private int bredcount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (bredcount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bredcount--;
            System.out.println("Потребитель купил один хлеб");
            System.out.println("В магазине осталось " + bredcount + " батонов хлеба");
            // вызываем notyfi и сообщаем что хлеб можно добавить
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (bredcount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            bredcount++;
            System.out.println("Произвели один хлеб");
            System.out.println("В магазине осталось " + bredcount + " батонов хлеба");
            lock.notify();
        }
    }
}

class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            //добавляем хлеб до 10
            market.putBread();
        }
    }
}

class Customer implements Runnable {
    Market market;

    public Customer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 11; i++) {
            //добавляем хлеб до 10
            market.getBread();
        }
    }
}