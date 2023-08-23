package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {

    public static void main(String[] args) {

        // C05'teki istenmeyenleri sil methodunu burada kullanalim

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Cokoprens");
        urunler.add("Cokomel");

        String istenmeyenHarf= "o";

        C05_IstenmeyeniSil.istenmeyenHarfIcereniSil(urunler, istenmeyenHarf);
        System.out.println(C05_IstenmeyeniSil.istenmeyenHarfIcereniSil(urunler, "o"));
    }
}
