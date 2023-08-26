package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C03_Update {

    public static void main(String[] args) {

        // Verilen map'te, verilen numarali ogrencinin
        // soyisimini istenen deger olarak degistirin.

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap); // 102=Veli-Can-10-M-TM
        okulMap = MapMethodDepo.numaraIleSoyisimDegistir(okulMap, 102, "Han");
        System.out.println(okulMap); // 102=Veli-Han-10-M-TM
    }
}
