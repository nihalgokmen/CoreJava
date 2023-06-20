package day07_genelTekrar_IfElseSatatement;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        vucut kitle endeksi
        30’dan buyukse obez,
        25-30 arasi ise kilolu,
        20-25 arasi ise normal,
        20’den kucukse zayif yazdirin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen kilonuzu giriniz: ");
        double kilo= scan.nextDouble();

        System.out.print("Lutfen boyunuzu cm olarak giriniz: ");
        double boy= scan.nextDouble();

        double kitleIndeksi = (kilo*10000 / (boy *boy));
        System.out.println("Vucut kitle indeksiniz: "+kitleIndeksi);

        if (boy<=0 || kilo<=0){
            System.out.println("Yanlis giris yaptiniz, tekrar deneyin");
        } else if (kitleIndeksi<20) {
            System.out.println("Zayif");
        } else if (kitleIndeksi<=25) {
            System.out.println("Normal");
        } else if (kitleIndeksi<=30) {
            System.out.println("Kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}
