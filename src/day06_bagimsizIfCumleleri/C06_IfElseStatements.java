package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (yas>=65){
            System.out.println("Emekli Olabilirsin");
        }
        else {
            System.out.println("Emekli olabilmek icin " + (65-yas) + " yil calismalisiniz");
        }
    }
}
