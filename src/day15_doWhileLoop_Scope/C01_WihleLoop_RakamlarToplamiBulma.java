package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class C01_WihleLoop_RakamlarToplamiBulma {
    public static void main(String[] args) {

        //While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamlari toplanacak pozitif tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        while (sayi > 0) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }
        System.out.println("Girilen " + girilenSayi + "'nin rakamlar toplami : " + rakamlarToplami);

        System.out.println(C02_RakamlarToplaminiBul.rakamlarToplaminiBul(girilenSayi ));
    }
}
