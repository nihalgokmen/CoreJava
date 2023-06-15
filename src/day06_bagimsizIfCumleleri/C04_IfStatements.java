package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse “Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        /*

         If Satatements'da sart parantezinden sonra suslu parante kullanmazsak,
         Java ilk noktali virgule kadar olan kismi If Body olarak kabul eder
         If body zaten 1 satir ise bu bir sorun olmaz
         ama if body 1 satirdan fazla ise,
         ilk satirdan sonrasi her kosulda calisir

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("sinifi Gectiniz!");
        }

        if (not<50 && not>= 0){
            System.out.println("Maalesef Kaldiniz");
        }
    }
}
