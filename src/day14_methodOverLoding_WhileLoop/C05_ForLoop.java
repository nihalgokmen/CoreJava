package day14_methodOverLoding_WhileLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
            Baslangic ve bitis degeri belli olan
            veya kac defa tekrar edilecegi bilinen
            Loop'larda For Loop ideal olarak kullanilabilir.

            Ancak tekrar sayisi belli olmayan
            baslangic veya bitisi baska bir varable'a bagli olan durumlarda
            For Loop yerine While Loop tercih edilir.
         */

        // 50 ve 100 arasindaki -sinirlar dahil- sayilari toplayin

        int toplam = 0;

        for (int i = 50; i <= 100; i++) {

            toplam += i;
        }
        System.out.println("Toplam : " + toplam);  // Toplam : 3825

        // ayni soruyu While Loop ile yapalim
        // For Loop'ta 3 seyi takip ederiz;
        // 1- baslangic degeri
        // 2- bitis sarti
        // 3- artis ya da azalis sekli

        toplam = 0;
        int sayi = 50;

        while (sayi <= 100) {

            toplam += sayi;
            sayi++;
        }

        System.out.println("While ile toplam: " + toplam);  // While ile toplam: 3825


    }
}
