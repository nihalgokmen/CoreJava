package day39_maps;

import javafx.print.Collation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMethodDepo {

    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> okulMap = new HashMap<>();
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
        okulMap.put(104, "Ayse-Cem-11-H-TM");
        okulMap.put(105, "Ayse-Han-10-H-MF");
        okulMap.put(106, "Veli-Han-10-H-MF");

        return okulMap;
    }

    public static void subeOgreciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {

        // 1- Value'lari ayri bir collection olarak kaydedelim
        Collection<String> valueCollection = okulMap.values();

        // 2- Her bir value'yu split ile bir array'e donusturelim
        System.out.println("=== Sinif Listesi ===");
        System.out.println("Sira Sinif Isim Soyisim");
        int siraNo = 1;

        for (String eachValue : valueCollection
        ) {
            // ORN: Ali-Cem-10-H-MF

            String[] valueArr = eachValue.split("-"); // ORN: Ali, Cem, 10, H, MF

            // 3- Array'den subeyi kontrol edip, eger istenen sube ise
            //    ogrencinin sinif-isim-soyisimini yazdiralim.
            if (valueArr[3].equalsIgnoreCase(istenenSube)) {
                System.out.println(siraNo + "- " + valueArr[2] + ", " + valueArr[0] + ", " + valueArr[1]);
                siraNo++;
            }
        }

    }

    public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

        // 1- Value'lari bir collection olarak kaydedelim.
        Set<Integer> okulKeySeti = okulMap.keySet(); // [101, 102, 103, 104, 105, 106]

        for (Integer eachKey : okulKeySeti
        ) {
            // 2- Her bir key'e ait value'yu split ile array'e donusturelim
            String[] valueArr = okulMap.get(eachKey).split("-"); // ORN: Ali, Cem, 10, H, MF

            // 3- Sube bilgisi eski sube olanlari yeni sube yapalim
            if (valueArr[3].equalsIgnoreCase(eskiSube)) {
                valueArr[3] = yeniSube;
            }
            // 4- array'deki bilgeleri birlestirerek, yeniden map'e ekleyelim
            String yeniValue = "";
            for (int i = 0; i < valueArr.length - 1; i++) {

                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length - 1];
            okulMap.put(eachKey, yeniValue);
        }

        // 5- okulMap'inin son halini return edelim.
        return okulMap;
    }

    public static Map<Integer, String> yilSonuSiniflariDegistir(Map<Integer, String> okulMap) {

        // 1- key'leri bir set olarak kaydet
        Set<Integer> keySeti = okulMap.keySet(); // [101, 102, 103, 104, 105, 106]

        // 2- set'deki her bir key'e ait value'yu for-each loop ile ele alalim
        for (Integer eachKey : keySeti
        ) {

            // 3- her key'e ait value'yu split() ile ayirip, array olarak kaydedelim
            String[] valueArr = okulMap.get(eachKey).split("-"); // ORN: [Ali, Cem, 10, H, MF]

            // 4- array olarak kaydettigimiz bilgilerde istenen update'i yapalim
            if (valueArr[2].equalsIgnoreCase("12")) {
                valueArr[2] = "Mezun";
            } else { // "9" "10" "11"

                int sinif = Integer.parseInt(valueArr[2]);
                sinif++;

                valueArr[2] = sinif + "";

            } // ORN: [Ali, Cem, 11, H, MF]
            
            // 5- array'in yeni halini String olarak birlestirip yeniValue elde edelim
            String yeniValue = "";
            for (int i = 0; i < valueArr.length-1; i++) {

                yeniValue += valueArr[i] + "-";
            }
            yeniValue += valueArr[valueArr.length-1];

            // 6- her bir key ve value'yu map'e ekleyerek map'i update edelim
            okulMap.put(eachKey, yeniValue);
        }

        // 7- map'in yeni halini return edelim
        return okulMap;
    }

    public static Map<Integer, String> numaraIleSoyisimDegistir(Map<Integer, String> okulMap, int okulNo, String yeniSoyisim) {

        // 1- Istenen Value'yu alalim
        String istenenOgrValue = okulMap.get(okulNo); // 102, "Veli-Can-10-M-TM"

        // 2- Value uzerinde islem yapabilmek icin split() ile array'e kaydedelim
        String[] valueArr = istenenOgrValue.split("-"); // [Veli, Can, 10, M, TM]

        // 3- Value arrau'i uzerinde istenen islemi yap
        valueArr[1] = yeniSoyisim; // [Veli, Han, 10, M, TM]

        // 4- Array'de degisiklik yapilidiysa map'i update etmemiz gerekir
        //    bunun icin de array'i yeniden value yapisina uygun sekilde
        //    String'e donusturmeliyiz
        String yeniValue = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-"
                         + valueArr[3] + "-" + valueArr[4];

        // 5- Update edilmis yeni value'yu key kullanarak Map'e ekleyelim
        okulMap.put(okulNo,yeniValue);

        return okulMap;
    }

    public static void sinifaGoreListeYazdir(Map<Integer, String> okulMap, int istenenSinif) {

        // 1- okulmap'deki entry'leri kaydedelim
        Set<Map.Entry<Integer,String>> okulEntrySeti= okulMap.entrySet();

        // 2- Her bir entry'i ele alip, istenen islemi yaptiralim
        for (Map.Entry<Integer,String> eachEntry : okulEntrySeti
        ) {

            // eachEntry ==> 101=Ali-Cem-10-H-MF


            // isim, soyisim, bolumlerini
            String value= eachEntry.getValue(); // Ali-Cem-10-H-MF
            String[] valueArr= value.split("-"); // [Veli, Can, 10, M, TM]

            if (valueArr[2].equals(istenenSinif+"")){
                // no,
                System.out.print(eachEntry.getKey() + " ");
                // isim, soyisim, bolumlerini
                System.out.print(valueArr[0] +" "+valueArr[1]+" " + valueArr[4]);
                System.out.println("");
            }

        }


    }

    public static Map<Integer, String> soyisimleriBuyukYap(Map<Integer, String> okulMap) {

        // Entry'ler ile cozelim
        Set<Map.Entry<Integer,String>> okulEntrySeti = okulMap.entrySet();

        // herbir Entry'i elden gecirip, sadece soyisimleri buyuk harf yapalim

        for (Map.Entry<Integer,String> eachEntry: okulEntrySeti
        ) {

            // her bir entry'deki value'yu alalim
            String value = eachEntry.getValue(); // Ali-Cem-10-H-MF

            // value'yu array'e cevirelim
            String[] valueArr= value.split("-"); // [Veli, Can, 10, M, TM]

            // array icinde soyismi buyuk harf yapalim

            valueArr[1] = valueArr[1].toUpperCase(); // [Veli, CAN, 10, M, TM]

            eachEntry.setValue(valueArr[0]+"-"+valueArr[1]+"-"+valueArr[2]+"-"+
                    valueArr[3]+"-"+valueArr[4]+"-");


        }
        return okulMap;
    }
}
