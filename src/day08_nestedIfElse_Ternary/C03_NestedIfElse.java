package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C03_NestedIfElse {
    public static void main(String[] args) {

         /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin.
         */

        // bu defa ana degisken yas olsun

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz " +
                            "\nKadin icin: K, Erkek icin: E");
        char cinsiyet= scan.next().charAt(0);

        if (yas<18 || yas>80) {
            System.out.println("Gercersiz yas girisi, tekrar deneyin");
        } else if (yas<60) {

            if (cinsiyet=='K' || cinsiyet=='k'){
                System.out.println("Emekli olmak icin "+(60-yas)+" yil daha calismalisin");
            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calismalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }

        } else if (yas<65) {
            if (cinsiyet=='K' || cinsiyet=='k') {
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("Emekli olmak icin "+(65-yas)+" yil daha calismalisin");
            } else {
                System.out.println("Gecersiz cinsiyet girisi");
            }

        } else {
            if (cinsiyet=='K'|| cinsiyet=='k' || cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("Emekli olabilirsin");
            }
            else {
                System.out.println("Gecersiz cinsiyet girisi");
            }
        }
    }
}
