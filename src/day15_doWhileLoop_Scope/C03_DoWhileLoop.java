package day15_doWhileLoop_Scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // While Loop'ta bitis sarti kontrolu her zaman body'den bir fazla calisir
        // While Loop'ta kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
        // bu da bazen hatalara sebep olur

        int sayi = 13;
        int toplam = 0;

        while (sayi > 0) {

            toplam += sayi * sayi;
            sayi--;
        }
        System.out.println("While toplam : " + toplam);


        sayi = 13;
        toplam = 0;

        do {
            toplam += sayi * sayi;
            sayi--;
        } while (sayi > 0);
        System.out.println("Do While toplam : " + toplam);
    }
}
