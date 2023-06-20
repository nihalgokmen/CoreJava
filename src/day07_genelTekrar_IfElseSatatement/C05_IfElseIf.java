package day07_genelTekrar_IfElseSatatement;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz..."+
                            "\nKadin icin: K, Erkek icin: E giriniz");

        char cinsiyet= scan.next().charAt(0);

        if ((yas>=60 && cinsiyet=='K') || (yas>=65 && cinsiyet=='E')){
            System.out.println("Emekli Olabilirsiniz");
        } else if (cinsiyet=='K') {
            System.out.println("Emekli olabilmek icin "+ (60-yas )+ "yil daha calismaniz gerekir");
        } else if (cinsiyet=='E') {
            System.out.println("Emekli olabilmek icin "+ (65-yas )+ " yil daha calismaniz gerekir");
        }
    }
}
