package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C02_LinkedListSoru {

    public static void main(String[] args) {

        /*
            Soru: Kullanicidan deger alarak iki String liste olsturun
                  kullanici deger girmeyi birakmak icin 0'a basmalidir.

                  Iki liste olustuktan sonra asgidaki sekilde output hazirlayin
                  Liste 1: .....
                  Liste 2: .....
                  Ortak Elementler: ....
         */

        System.out.println("Once List1'i olusturalim");
        List<String> list1 = kullanicidanAlarakListOlustur();

        System.out.println("Simdi List2'yi olusturalim");
        List<String> list2 = kullanicidanAlarakListOlustur();

        System.out.println("Liste 1 : "+list1);
        System.out.println("Liste 2 : "+list2);

        list1.retainAll(list2);
        System.out.println("Ortak Elemanlar : "+list1);

    }

    public static List<String> kullanicidanAlarakListOlustur(){

       // Kullanicidan deger alarak iki String liste olsturup main method'a dondurecek
       // kullanici deger girmeyi birakmak icin 0'a basmalidir.

        List<String> isimListesi = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        String isim = "";

        while (!isim.equalsIgnoreCase("0")){
            System.out.println("Listeye eklemek icin isim giriniz \nBitirmek icin 0'a basiniz");
            isim = scan.nextLine();

            if (!isim.equalsIgnoreCase("0")){
                isimListesi.add(isim);
            }
        }
        return isimListesi;
    }
}
