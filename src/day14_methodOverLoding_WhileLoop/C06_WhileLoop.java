package day14_methodOverLoding_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {


        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olunca ya da 500'u asinca kac sayi girdigini ve
        // sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 0;
        int toplam = 0;
        int girilenSayiAdedi = 0;

        while (toplam < 500) {  // toplam 500'den kucuk oldugu surece bu islemi yapar

            System.out.println("Lutfen toplanmak uzere bir sayi giriniz");

            girilenSayi = scan.nextInt();

            toplam += girilenSayi;
            girilenSayiAdedi++;
        }
        System.out.println("Toplam " + girilenSayiAdedi + " adet sayi girildi ve toplami: " + toplam);
    }
}
