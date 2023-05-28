package day03_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //         girilen bilgiler : J Doe, 44

        Scanner scan= new Scanner(System.in);

        // Isterseniz tek bir aciklama ile uc bilgiyi de alabilirsiniz

        System.out.println("Lutfen Isminizi, Soyisminizi ve Yasinizi Girniz"+
                            "\nHer bilgi girisinden sonra ENTER'a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);


        /*
        Scanner method'larinda next.Char() yoktur
        bunun icin once kullanicinin girisine gore
        next() ya da nextline() yazip sonra .charAt(0) yazariz
        parantez icindeki 0 almak istedigimiz Char'in index'idir
        Ve Java'da index 0'dan baslar
        */

        String soyIsim = scan.nextLine();
        double yas = scan.nextDouble();

        //         girilen bilgiler : J Doe, 44
        System.out.println("Girilen Bilgiler : "+ isimIlkHarf+ " "+soyIsim+ ", "+ yas);


    }
}
