package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {

    public static void main(String[] args) {

        // Verilen okul map'inde
        // ogrencilerin siniflerini bir artirin
        // eger 12. sinif varsa sinif bilgisi olsarak "mezun" yazin.

        // Eger update varsa key ve value birlikte dusunulmelidir.
        // Ayni key ile yeni value'yu map'e ekledigimizde
        // key unique olacagi icin eski value'yu update edip yeni value degerini kaydeder

        Map<Integer,String > okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);

        // deneme icin bir defa daha calistiralim
        okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);

    }
}
