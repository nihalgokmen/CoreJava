package day14_methodOverLoding_WhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin
        // asagidaki sartlari saglayana kadar,
        // her seferinde hatalari soyleyip yeni sifre isteyin
        // sartlari saglayan sifre oldugunda
        // "5. denemenizde basarili sifre olusturuldu" seklinde aciklama yazdirin
        // - ilk harf kucuk harf olmali
        // - son harf buyuk harf olmali
        // - bosluk icermemeli ve
        // - 8 karakter ya da daha uzun olmali

        Scanner scan = new Scanner(System.in);


        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4) {  // flag 4 olmadigi surece calisacak
            flag=0;

            System.out.println("Lutfen bir sifre giriniz");
            sifre= scan.nextLine();

            // - ilk harf kucuk harf olmali
            if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
                flag++;
            }else {
                System.out.println("Ilk karakter kucuk harf olmali");
            }

            // - son harf buyuk harf olmali
            if (sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z'){
                flag++;
            } else {
                System.out.println("Son karakter buyuk harf olmali");
            }

            // - bosluk icermemeli
            if (sifre.contains(" ")){
                System.out.println("Sifre bosluk icermemeli");
            } else {
                flag++;
            }

            // - 8 karakter ya da daha uzun olmali
            if (sifre.length()>=8){
                flag++;
            }else {
                System.out.println("Sifre en az 8 karakter icermelidir");
            }
            denemeSayisi++;
        }

        System.out.println("Tebrikler! "+ denemeSayisi+ " denemede sifreniz basari ile kaydedildi");

    }
}
