package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // 1. adim: Scanner objesi olusturun
        Scanner scan = new Scanner(System.in);

        //2. adim: kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen Adinizi Giriniz");

        //3. adim: girilen bilgiyi icine koyabilecegimiz bir variable olusturun
        // olusturdugumuz Scanner objesi ile uygun methodu kullanarak bilgiyi alin

        String kullaniciIsmi = scan.next();

        System.out.println("Girilen Isim: " + kullaniciIsmi);


    }
}
