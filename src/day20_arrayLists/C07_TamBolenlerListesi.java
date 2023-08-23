package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_TamBolenlerListesi {

    public static void main(String[] args) {

        // Soru 6- Kullanicidan main method'ta pozitif bir tamsayi alip,
        //         o tamsayiyi tam bolebilen tum pozitif tamsayilari
        //         bir liste olarak bize donduren bir method olusturun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bolenleri bulunacak pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println(pozitifBolenleriListele(girilenSayi));


    }

    public static List<Integer> pozitifBolenleriListele(int girilenSayi) {

        List<Integer> pozitifBolenler = new ArrayList<>();

        for (int i = 1; i <= girilenSayi; i++) {

            if (girilenSayi % i == 0) {
                pozitifBolenler.add(i);
            }
        }
        return pozitifBolenler;
    }
}
