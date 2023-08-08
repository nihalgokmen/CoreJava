package day12_forLoops;

import java.util.Scanner;

public class C03_ForLoop {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini tam sayi olarak griniz");
        int bas = scan.nextInt();

        System.out.println("Bitis degerini tam sayi olarak griniz");
        int bit = scan.nextInt();

        int sayilarToplami = 0;

        if (bas <= bit) {
            for (int i = bas; i <= bit; i++) {
                sayilarToplami += i;
            }

        } else { // baslagic degeri bitis degerinden buyuk demektir
            for (int i = bas; i >= bit; i--) {  // -- olmali
                sayilarToplami += i;
            }

        }
        System.out.println("Sayilarin toplami: " + sayilarToplami);
    }
}
