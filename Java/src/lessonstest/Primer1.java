package lessonstest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Primer1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDate ld = LocalDate.of(2005, Month.AUGUST,25);
        System.out.println(ld);
    }



}
