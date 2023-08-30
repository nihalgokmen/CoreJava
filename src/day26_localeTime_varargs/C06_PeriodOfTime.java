package day26_localeTime_varargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class C06_PeriodOfTime {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1998, 8, 5);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumTarihi, bugun)); // P24Y7M8D ==> 24 yil, 7 ay, 8 gun
        System.out.println("Yas : " + Period.between(dogumTarihi, bugun).getYears()); // Yas : 24
        System.out.println("Yas : " + Period.between(dogumTarihi, bugun).getDays());  // Yas : 8


    }
}
