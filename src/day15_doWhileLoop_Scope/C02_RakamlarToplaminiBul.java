package day15_doWhileLoop_Scope;

public class C02_RakamlarToplaminiBul {

    //  Verilen pozitif bir tam sayinin
    //  rakamlar toplamini bize donduren method olusturun


    public static int rakamlarToplaminiBul(int verilenSayi) {

        int sayi = verilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        int basmakSayisi = (sayi + "").length();  // sayiyi hiclikle toplayip stringlestirip sonrada uzunlugunu aldik

        for (int i = 1; i <= basmakSayisi; i++) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        return rakamlarToplami;

        // main method olmadigi icin bu class'tan cagiramayiz o yuzden bir onceki class'ta kullanacagiz
    }
}
