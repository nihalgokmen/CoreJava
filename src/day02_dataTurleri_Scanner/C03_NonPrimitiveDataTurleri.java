package day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String isim = "Ali Can";

        String ilkHarf = "K";

        char ilkHarf2 = 'm';

        // Tek bir karakter atayacaksak her ikisi de kullanilabilir

        System.out.println(ilkHarf.toLowerCase());  //k
        System.out.println(ilkHarf2);  //m

        // Primitive data turundeki variable'lar sadece deger tasiyabilir
        // ama Non-Primitive data turundeki variable'larin hem deger hem de methodlari olur

        String metin= "sjfdhksdjgfksdh"+"kjhdfkjsdhfshf"+
                        "shdgfkjshd,sdojfl";

        String not="not";
        String Not="Variable isimlarinin buyuk harfle baslamasi tavsiye edilmez amajava kabul eder";
        String nOt="Bir defa deklare edilen variable tekrar deklare edilemez";
        String noT="Ama java CASE SENSITIVE old icin bu yazimlari birbirinden farkli kabul eder";

        // camelCase: kucuk harfle baslar, sonraki kelimeler bitisik yazilir ve ilk harf buyuk harfle baslar
        // ilkHarf, ogrenciNo,
        // Buna Naming Conventoin denir

    }
}
