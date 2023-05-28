package day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf='8';  // Tek tirnak icinde tek karakter(harf,sayi,ozel karakter...)

        byte ogrYasi=15;  // En dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir
        short ogrYasi2=16;
        int ogrYasi3=14;
        long ogrYasi4=15;

        double sayi1=3.1234567891012345678;

        System.out.println(sayi1);  //3.1234567891012345

        //Double virgulden sonra 16 hane yazdirir
        //ama cok kucuk sayilara indigi icin
        //ondalikli kismin sonlarinda hatalar olabilir
        // 15/3= 4.999999999999999999  5.0  5.0000000000001 olmasi gibi

        float sayi2= 45.38628375975037939f;

        // float sayi tanimladigimizda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz


        System.out.println(sayi2);  //45.386283  6 hane yazdirir


        //Biz dersler boyunca hafiza onemli olmadigi icin
        //tam sayilar icin int, indalikli sayilar icin de double kullaniriz
    }
}
