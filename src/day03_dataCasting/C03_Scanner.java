package day03_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini girin");

        // kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        // kullanicidan bilgiyi almak icin can objesini ve ilgili next method'unu kullanin (next..)

        double yariCap= scan.nextDouble();

        System.out.println("Cemberin Cevresi: "+ 2 * 3.14 * yariCap);
        System.out.println("Dairenin Alani: "+ 3.14 * yariCap * yariCap);
    }
}
