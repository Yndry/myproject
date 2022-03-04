package javaRush.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Example2 {
    static Calendar birthDate = new GregorianCalendar(1982, Calendar.AUGUST, 1);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String resault = "";
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1: return "Воскресенье";
            case 2: return "Понедельник";
            case 3: return "Вторник";
            case 4: return "Среда";
            case 5: return "Четверг";
            case 6: return "Пятница";
            case 7: return "суббота";

        }

        return resault;
    }
}
