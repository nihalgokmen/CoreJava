package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {

    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede
        //         istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

        List<String> liste= C04_KullaniciyaListaOlusturma.kullaniciyaListOlustur();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf girin");
        String istenmeyenHarf=scan.next().substring(0,1);

        List<String> ayiklanmisList= istenmeyenHarfIcereniSil(liste, istenmeyenHarf);

        System.out.println(ayiklanmisList);

    }

    public static List<String> istenmeyenHarfIcereniSil(List<String> liste, String istenmeyenHarf){

        // mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        // for loop ile elementleri ele alirken remove yaparsak
        // list'in uzunlugu degisecegi icin sorun yasariz
        // farkli bir list olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> kalanlarList= new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarList.add(liste.get(i));
            }
        }
        return kalanlarList;
    }


}
