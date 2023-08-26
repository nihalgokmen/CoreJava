package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {

        // Kullanicinin istedigi kadar tam sayi alip toplayin
        // kullanici q'ya bastiginda islemi sonlandirip
        // kac sayi girildigini ve toplamini yazdirin
        // q veya Q disinda tam sayi olmayan bir deger girilirse
        // hata mesaji verip yeni deger isteyerek isleme devam edin

        int sayac = 0;
        int toplam = 0;
        int girilenSayi = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Toplanmak uzere tam sayi giriniz \nBitirmek icin q'ya basin");

            try {

                girilenSayi = scan.nextInt();  // q yada Q ve gecersiz input, exception olusturur
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) {

                char input = scan.next().charAt(0);

                if (input == 'q' || input == 'Q'){
                    System.out.println("Girilen "+ sayac+ " adet tam sayinin toplami "+ toplam);
                    break;

                }else {
                    System.out.println("Tam sayi degeri girmelisiniz");
                }
            }

        }while (true);

        System.out.println("Bu is bu kadar");




    }
}
