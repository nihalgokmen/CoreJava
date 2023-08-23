package day20_arrayLists;

public class C08_BaskaClasstanKullanma {

    public static void main(String[] args) {

        // verilen sayinin pozitif tam boleneleri sayisi
        // 10'dan cok ise "guzel", yoksa "kotu" yazdirin

        int sayi = 100;

        int pozitifTamBolenSayisi= C07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();
        // pozitif tam bolenler listesinin size()'i pozitif tam bolen sayisini verir

        if (pozitifTamBolenSayisi>10){
            System.out.println("Guzel");
        }else {
            System.out.println("Kotu");
        }
    }
}
