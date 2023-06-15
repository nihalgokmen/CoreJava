package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*

            Eger bir olay icin iki olasilik varsa ve bu olasiliklardan
            birisi mutlaka calisacaksa, o zaman if-else statements kullaniriz
            tekrar bir sart belirtmez yerine sadece else yazip bitiririz

            If-Else statement'da if body'si veya else body'si mutlaka calisir
            ikisinin birden calisma ihtimali yoktur,
            ikisinin de calismama ihtimali de yoktur.
            Yani en az biri calisir

         */

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse “Sinifi Gectin”,
        //         50’den kucukse “Maalesef Kaldiniz” yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("Sinifi Gectiniz!");
        }
        else {
            System.out.println("Maalesef Kaldiniz");
        }


        // Kullanicidan pozitif bir tam sayi alin,
        // sayinin tek veya cift sayi oldugunu yazdirin.

        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cifttir");
        }
        else {
            System.out.println("Girilen sayi tektir");
        }


        // Kullanicidan pozitif bir tam sayi alin,
        // 5 ile bolunup bolunmedigini yazdirin

        if (sayi%5==0){
            System.out.println("Sayi 5'e tam bolunur");
        }
        else {
            System.out.println("Sayi 5'e tam bolunmez");
        }



    }
}
