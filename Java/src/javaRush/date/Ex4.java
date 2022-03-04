package javaRush.date;


import java.util.Arrays;

public class Ex4 {
//    static LocalDate birthDate = LocalDate.of(2020, 3, 12);
//    public static ArrayList<Integer> arrayList = new ArrayList<>();
//    public static void main(String[] args) {
////        LocalDate newDate = LocalDate.now();
////        System.out.println(newDate);
////        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
////        LocalDate local = LocalDate.now(zoneId);
////        System.out.println(local);
////        LocalDate date2 = LocalDate.of(1982, Month.APRIL, 10);
////        System.out.println(date2);
////        int year = newDate.getYear();
////        int month = newDate.getMonthValue();
////        System.out.println(month);
////        LocalDate d = LocalDate.of(2020,9,12);
////
////        System.out.println(d.getDayOfYear());
//
//        LocalTime localTime = LocalTime.MIDNIGHT;
//        System.out.println("Polnoch" + localTime);
//
//            System.out.println(getDayOfWeek(birthDate));
//
//        for (String s: ZoneId.getAvailableZoneIds())
//            System.out.println(s);
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(2);
//        arrayList.add(10);
//        Integer max = Collections.max(arrayList);
//        System.out.println(min(2,4,5));
//
//        }
//        public static int min(int m1, int m2, int m3) {
////        arrayList.add(m1);
////        arrayList.add(m2);
////        arrayList.add(m3);
//            arrayList = {m1,m2,m3};
//        int res = Collections.max(arrayList);
//        return res;
//        }
//
//        static String getDayOfWeek(LocalDate date) {
//            String s = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru"));
//
//
//            return s;
//        }
//    }
public static void main(String[] args) {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair result = getMinimumMaximumPair(data);

    System.out.println("The minimum is " + result.x);
    System.out.println("The maximum is " + result.y);
}

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }

        int x = Arrays.stream(inputArray).min().getAsInt();
        int y = Arrays.stream(inputArray).max().getAsInt();

        return new Pair(0, 0);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}




