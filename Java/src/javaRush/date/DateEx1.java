package javaRush.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateEx1 {
    public static void main(String[] args) {
//        Date date = new Date();
//        System.out.println(date);
//        Date myBersday = new Date(82,07,8, 9, 24,25);
//        System.out.println(myBersday);
//        System.out.println(myBersday.getYear());
//        System.out.println(myBersday.getMonth());
//        System.out.println(myBersday.getHours());
//        System.out.println(myBersday.getTimezoneOffset());
//        System.out.println(myBersday.getDay());
//
//        Calendar dateCalendar = new GregorianCalendar(1982, 07, 10);
//    Date date10 = dateCalendar.getTime();
//    Calendar calendar = new GregorianCalendar(2019, Calendar.FEBRUARY,27);
//    calendar.add(Calendar.DAY_OF_MONTH,2);
//
//        System.out.println(date10);

        Calendar calendar = Calendar.getInstance();

        Date dateCalendar = calendar.getTime();
        System.out.println(dateCalendar);
        calendar.add(Calendar.MONTH,-2); //уменьшает месяц на 2
        Date dateCalendar2 = calendar.getTime();
        System.out.println(dateCalendar2);


//        myBersday.setDate(87);
//        System.out.println(myBersday);
//        Date date1 = new Date();
//        date1.setTime(Date.parse("jul 06 12:15:00"));
//        System.out.println(date1);


    }
}
