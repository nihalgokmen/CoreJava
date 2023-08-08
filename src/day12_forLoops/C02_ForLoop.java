package day12_forLoops;

public class C02_ForLoop {

    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
                sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
                Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        int bas = 20;
        int bit = 400;

        int sayilarToplami = 0;

        if (bit < bas) {
            System.out.println("Bitis degeri baslangictan buyuk olmalidir");
        } else {
            for (int i = bas; i <= bit; i++) {
                // sayilarToplami = sayilarToplami + i
                sayilarToplami += i;
            }
        }
        System.out.println("Sayilarin toplami : " + sayilarToplami);
    }
}
