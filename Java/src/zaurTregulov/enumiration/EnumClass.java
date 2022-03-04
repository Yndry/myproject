package zaurTregulov.enumiration;

import java.util.Arrays;

public class EnumClass {
    public static void main(String[] args) {
Today day = new Today(WeekDay.FRIDAY);
day.dayInfo();
        System.out.println(day.weekDay);

        WeekDay w1= WeekDay.FRIDAY;
        WeekDay w2= WeekDay.FRIDAY;
        WeekDay w3= WeekDay.MONDAY;
        WeekDay w4= WeekDay.FRIDAY;
        /**
         * Enum можем сравнивать с помощью ==
         */

        System.out.println(w1==w2);
        System.out.println(w1==w3);

        WeekDay2 wek2 = WeekDay2.FRIDAY;
        /**
         * Но разные обьекты enum сравнивать можем не всегад
         */
      // Так работать не будет ошибка  System.out.println(w2==wek2);
        /**
         * Так будет fals так как это разные обьекты
         */
        System.out.println(WeekDay2.FRIDAY.equals(WeekDay.FRIDAY));

        /**
         * Методы ValueOf - позволяет получать enum из String значения
         */
WeekDay w15 = WeekDay.valueOf("MONDAY"); // Если запишем значение кот нет в enum WekkDay то появится Exeption о том что такого значения нет в enum
        System.out.println(w15);
        /**
         * Методы Value - возвращает массив констант, которые принадлежат enum
         */
        WeekDay[] array = WeekDay.values(); // Передали значение констант Enum WeekDay в массив array
        System.out.println(Arrays.toString(array));
    }
}


class Today{
WeekDay weekDay;

    public Today(WeekDay weekDay) {
        this.weekDay = weekDay;
    }
    void dayInfo() {
        switch (weekDay) {
            case MONDAY -> System.out.println("Ponedelnik");
            case FRIDAY -> System.out.println("Pyatnica");
            case SUNDAY -> System.out.println("Voskresenie");
            case TUESDAY -> System.out.println("Vtornik");
            case SATURDAY -> System.out.println("Subbota");

        }
        //WeekDay w = WeekDay.FRIDAY;

    }
}

/**
 * В энум могут содержаться переменные, методы, конструкторы
 */

enum WeekDay2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    }

enum WeekDay {
    MONDAY("bad"),
    TUESDAY(" bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");
private  String nastroenie;

    /**
     * Конструктор вызывается для каждого эелемнта Enum
     * И в каждом элементе мы вскобках должны передать это значение
     *Конструктор в enum может быть только Private
     * Констируктор для каждого значение Enum вызывается автоматически. Его нельзя вызвать вручную.
     * Мы не создаем его с помощью ключегого слова "NEW"
     *
     * Конструкторов может быть много
     * Enum нельзя екстендить
     */
    WeekDay(String nastroenie) {
        this.nastroenie = nastroenie;
    }

    public String getNastroenie() {
        return nastroenie;
    }
}
