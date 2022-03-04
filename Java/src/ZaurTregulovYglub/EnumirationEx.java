package ZaurTregulovYglub;


import java.util.Arrays;

public class EnumirationEx {
    public static void main(String[] args) {
        Today day = new Today(DayOfWeek.THESDAY);
        day.daysInfo();
        DayOfWeek dayOfWeek = DayOfWeek.WENSDEY;
        DayOfWeek dayOfWeek1 = DayOfWeek.THESDAY;
        /**
         * Enum можем сравнивать операторами ==
         */
        System.out.println(dayOfWeek == dayOfWeek1);
        //System.out.println(WeekDays2.MONDAW==DayOfWeek.MONDAW); //тк нельзя сравнивать так как у них разные типы
        //тип WeekDays2 и тип DayOfWeek
        System.out.println(WeekDays2.MONDAW.equals(DayOfWeek.MONDAW)); //equalse может работать вернет
        //false так как они разны типов
        WeekDays2 weekDays2 = WeekDays2.valueOf("MONDAW");
        System.out.println(weekDays2);
        WeekDays2 [] array = WeekDays2.values(); // записывает значения Enum в массив
        System.out.println(Arrays.toString(array));
    }
}

/**
 * В Enum могут содержаться переменные методы конструкторы
 */
enum DayOfWeek {
    /**
     * И теперь мы создали конструктор и в каждый enum мы укажем настроение mood
     */
    MONDAW("bad"),
    WENSDEY("goo"),
    THESDAY("nathin"),
    SATARDAY("not bad");
    /**
     * Для каждого enum сделаем свое настроение
     */
    private String mood;

    /**
     * В Enum конструктор может быть только praifat
     * Его нельзя вручную вызвать
     */
    DayOfWeek(String mood) {
        this.mood = mood;
    }

    public String getModd() {
        return mood;
    }
}

enum WeekDays2 {
    MONDAW,
    WENSDEY,
    THESDAY,
    SATARDAY
}

class Today {
    DayOfWeek dayOfWeek;

    public Today(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    void daysInfo() {
        switch (dayOfWeek) {
            case MONDAW:
            case THESDAY:
            case WENSDEY:
                System.out.println("Dni nedeli");
                break;
            case SATARDAY:
                System.out.println("Otdix");
                break;
        }
        System.out.println("Nastroenie v etod den " + dayOfWeek.getModd());
    }
}



