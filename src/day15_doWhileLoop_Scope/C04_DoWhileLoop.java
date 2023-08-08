package day15_doWhileLoop_Scope;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar alin
        // kullaniciya bitrmek icin 0'a basmasini soyleyin
        // kullanici 0'a bastiginda
        // 0 haric kac sayi girildigini ve toplamlarini yazzdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;   // 0 verirsek kodu yazdirmaz 0'dan farkli herhangi bir deger vermeliyiz
        int toplam = 0;
        int sayiAdedi = 0;

        /*

        while (girilenSayi != 0) {
            System.out.println("Toplanmak uzere tam sayi giriniz " +
                    "\nBitirmek icin 0'a basiniz");

            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }

         */



        do {
            System.out.println("Toplanmak uzere sayi giriniz"+
                                "\nBitirmek icin 0'a basiniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }while (girilenSayi!=0);

        System.out.println("Girilen "+sayiAdedi+ " adet sayinin toplami : "+ toplam);
    }
}
