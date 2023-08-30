package day26_localeTime_varargs;

import java.time.LocalTime;

public class C01_LocaleTime {

    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1); // 20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat);  // 22:56:33.346779

        // LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // Kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getNano());
        // get method'lari LocalTime objesinin saat, dakika, saniye ve nano degerlerini getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));  // 2 saat 10 dk ekledik

        System.out.println(saat.minusMinutes(10).minusSeconds(10)); // 10 dk 10 saniye cikardik

        System.out.println(saat.withSecond(10).withNano(10)); // saniye ve nano degerini revize ettik

        System.out.println(saat.compareTo(saat1)); // -1 ==> ayni saat olmadigi icin

        System.out.println(saat.compareTo(saat)); // 0 ==> kendisiyle ayni oldu icin

        System.out.println(saat.isAfter(saat1)); // true

        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay()); // 83929 gunun kacinci saniyesi

    }
}
