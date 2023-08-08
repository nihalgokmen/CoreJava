package day13_methodOlusturma;

import java.util.Scanner;

public class C04_MethodKullanma {
    public static void main(String[] args) {

        // kullanicidan 10'dan kucuk iki pozitif tam sayi alip
        // faktoryel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk iki adet pozitif tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc= C03_FaktoryelMethodu.faktoryelHesapla(sayi1) +
                   C03_FaktoryelMethodu.faktoryelHesapla(sayi2);

        System.out.println("Sonuc : "+ sonuc); // 30

    }
}
