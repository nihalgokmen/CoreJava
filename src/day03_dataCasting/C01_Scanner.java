package day03_dataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //        Isminiz : John
        //        Soyisminiz : Doe
        //        Yasiniz : 44
        //        Kaydiniz basariyla tamamlanmistir.


        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Isminizi Girniz");

        String isim= scan.nextLine();

        System.out.println("Lutfen Soyisminizi Girniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz");

        double yas= scan.nextDouble();



        //System.out.println("Isminiz: " + isim );
        //System.out.println("Soyisminiz: "  + soyisim);
        //System.out.println("Yasiniz: " + yas);
        //System.out.println("Kaydiniz basariyla tamamlandi");


        /*
        Kullanici istedigimiz data turunde bilgi girisi yapmazsa
        kodumuzda hata olusur ve calisma durur
        ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz
        SIMDILIK kullanici bize ne diyorsak onu tam yapiyor kabul edelim
         */


        //System.out.print("Isminiz: " + isim );
        //System.out.print("Soyisminiz: "  + soyisim);
        //System.out.print("Yasiniz: " + yas);
        //System.out.print("Kaydiniz basariyla tamamlandi");

        /*
        System.out.println()'deki ln()
        yazdirma islemini yaptiktan sonra
        alt satira gecmesini saglar
        println yerine print yazarsak
        yazdirdigimiz seyler yan yana yazdirilir
         */

        System.out.println("Isminiz: " + isim+
                            "\nSoyisminiz: "  + soyisim+
                            "\nYasiniz: " + yas+
                            "\nKaydiniz basariyla tamamlandi");
        //Isminiz: nihalSoyisminiz: gokmenYasiniz: 24.0Kaydiniz basariyla tamamlandi

        /*
            Tek bir  System.out.println ile birden fazla satir yazdirmak isterseniz
            String bir ifadenin icinde istedigimiz yere \n yazabilirsiniz
         */

    }
}
