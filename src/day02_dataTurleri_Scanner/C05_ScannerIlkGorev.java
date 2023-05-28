package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_ScannerIlkGorev {

    public static void main(String[] args) {

        // Kullanicidan bir sayi alin
        // ve sayinin karesini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Girin");  //3,5

        double girilenSayi= scan.nextDouble();

        System.out.println("Girilen Sayinin Karesi: "+girilenSayi*girilenSayi);  //12,25

    }
}
