package day22_constructor;

import day21_arrayList_forEachLoop.C04_KarelerToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {

    public static void main(String[] args) {

        /*
            Bir obje ancak bir class'tan olusturulabilir.
            Bir objeyi olusturdugumuz class ayni zamanda o abjenin data turudur.

            Her obje olusturuldugu class'in ozelliklerini tasir.

            Eger bir programda, ortak ozelliklere sahip objeler uretmek icin
            tasarladiginiz bir class varsa main method olmasi SART DEGILDIR.
            Bu class'lar kaliphane gibidir,
            Yani o class'tan ayni ozelliklere sahip objeler uretmemizi saglar.
         */


        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        C04_KarelerToplami obje = new C04_KarelerToplami();

        var rnd = new Random();

        String str = new String("Ali");

        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));


        String str2;
        Random rnd2;
        List<String> harfler;






    }
}
