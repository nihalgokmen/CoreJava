package day08_nestedIfElse_Ternary;

public class C06_Ternary {
    public static void main(String[] args) {

        // Ternary operatoru ya direkt sout icerisinde kullanilir
        // ya da bir degiskene atama yapilacak sekilde yazilir

        int sayi =19;

        // sayi%2==0 ? "sayi cift" : "sayi tek"; bu sekilde yazilirsa java hata verir


        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

        String sonuc = sayi%2==0 ? "sayi cift" : "sayi tek";


        // eger true oldugundaki sonuc ila false oldugundaki sonuc
        // farkli data turlerinde olursa yazdirilabilir ama atama yapilmaz

        // sayi cift ise "sayi cift" yazdirin
        // degilse sayinin iki katini yazdirin

        System.out.println(sayi%2==0 ? "Sayi cift" : (sayi*2));

        // int sonuc2 = sayi%2==0 ? "sayi cift" : sayi*2 ;
    }
}
