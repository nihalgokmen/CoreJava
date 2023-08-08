package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {

    public static void main(String[] args) {

        // Bir string'i istedigimiz parcalara ayirmak icin kullanilir

        String str = "Java Candir Can";

        // str kac kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, Candir, Can]

        System.out.println("kelime sayisi : " + kelimeler.length); // kelime sayisi : 3


        // en uzun kelime kac harflidir?

        int enUzunKelimeLenght = kelimeler[0].length();

        for (int i = 0; i < kelimeler.length; i++) {

            if (kelimeler[i].length()>enUzunKelimeLenght){
                enUzunKelimeLenght= kelimeler[i].length();
            }
        }
        System.out.println("en uzun kelimenin karakter sayisi : "+enUzunKelimeLenght); // 6


        // bir string'i karakterlerine ayirmak istersek?

        String[] karakterler=str.split("");
        System.out.println(Arrays.toString(karakterler));

        System.out.println("Cumledeki karakter sayisi : "+karakterler.length); // 15

    }
}
