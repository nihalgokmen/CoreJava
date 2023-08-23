package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListaOlusturma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListOlustur());

    }

    public static List<String> kullaniciyaListOlustur(){
        List<String> isimler= new ArrayList<>();
        String girilenIsim="";
        Scanner scan= new Scanner(System.in);

        do {
            System.out.println("Listeye eklemek icin bir isim giriniz" +
                    "\nBitirmek icin Q'ya basin");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        } while (!girilenIsim.equalsIgnoreCase("Q"));


        return isimler;
    }
}
