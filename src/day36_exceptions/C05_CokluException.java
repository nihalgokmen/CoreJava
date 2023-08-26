package day36_exceptions;

import javafx.scene.transform.Scale;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {

    public static void main(String[] args) {

        String str = "Java her gecen gun guzellesiyor";
        int[] arr = {2,3,4,5,6,7,7,8,8,9};


        // Kullanicidan sifir veya pozitif bir tam sayi isteyin
        // girilen degeri index olarak kullanip
        // str ve arr'nin o index'indeki elemanlari yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Index olarak kullanmak icin sifir veya pozitif tam sayi girin");

        /*
            Birbirinden bagimsiz 3 farkli turde exception riski var
            bunlari farkli sekillerde handle edebilirz :

            1- her birini ayri ayri try-catch yapmak

            2- tek bir try birden fazla catch yapmak

            3- tek bir try-catch yapip tum exceptionlari
               yakalayacak bir exception tutu yazilabilir
         */


        try {
            int index = scan.nextInt(); // sayi girilmezse ==> InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // 10 girersek ==> ArrayIndexOutOfBoundsException

        } catch (RuntimeException e) {

           // System.out.println("Giris hatali olabilir, index String veya Array'in disinda olabilir");

            e.printStackTrace();

            // Biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // Veya Java'nin hata kodlarini yazdirabiliriz
        }


        try {

            int index = scan.nextInt(); // sayi girilmezse ==> InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException

            System.out.println(arr[index]); // 10 girersek ==> ArrayIndexOutOfBoundsException

        } catch (InputMismatchException e) {
            System.out.println("Tam sayi girmelisin");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen index String sinirlari disinda");

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen index Array sinirlari disinda");
        }
    }
}
