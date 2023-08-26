package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C01_Update {

    public static void main(String[] args) {

        // Verilen Map'te sube ismi M olanlarin
        // subesini N yapin

        Map<Integer, String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        // {101=Ali-Cem-10-H-MF,
        // 102=Veli-Can-10-M-TM,
        // 103=Ali-Can-11-M-Soz,
        // 104=Ayse-Cem-11-H-TM,
        // 105=Ayse-Han-10-H-MF,
        // 106=Veli-Han-10-H-MF}

        System.out.println(okulMap.get(101)); // 101 no'nun value'sunu yazdirir ==> Ali-Cem-10-H-MF

        okulMap.put(101, "Ali-Cem-10-M-MF"); // Var olan bir deger bu sekilde update edilmis olur yani yeni deger atar.
        System.out.println(okulMap);


        // 6- return edilen yeni halini eski okulMap'e assign edelim.
        okulMap = MapMethodDepo.topluSubeDegistirme(okulMap, "M", "N");
        System.out.println(okulMap);
    }
}
