package ceshi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ceshichuanzhi {

    public static void main(String[] args) {
        test_1("wang","jian","huan");

    }

    private static void test_1(String... strs){

//        System.out.println("LocalDateTime.now().plusDays(1).isAfter(null) = " + LocalDateTime.now().plusDays(1).isAfter(LocalDateTime-00-00 00:00:00"));

        int length = strs.length;
        System.out.println("length = " + length);


        System.out.println("===============>");

        LocalDate now = LocalDate.now();

        System.out.println("DateTimeFormatter.ofPattern(\"yyyyMM\") = " + DateTimeFormatter.ofPattern("yyyyMM"));
        System.out.println(DateTimeFormatter.ofPattern("yyyyMM"));
        System.out.println(now);
        System.out.println(now.format(DateTimeFormatter.ofPattern("yyyyMM")));

        System.out.println(now.getMonthValue());
        System.out.println(now.getDayOfMonth());

        System.out.println("Month.JANUARY = " + Month.JANUARY.getValue());
        System.out.println(Month.JULY.firstDayOfYear(false));

    }
}
