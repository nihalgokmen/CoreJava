package day19_arrayLists;

import day17_arrays.C06_ArrayeElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {

    public static void main(String[] args) {

        /*
            Array List uzunlugu esnek bir listedir
            Array alt yapisini kullanir
            ancak ekleme ve silme gibi islmelerde daha kullanislidir

            ArrayList'in tek dezavantaji var o da
            elementleri tek tek eklememiz gerekmesi
         */

        int[] arr = {3, 4};

        arr = C06_ArrayeElemanEklemeMethodu.arrayeElementEkle(arr, 5);

        List<String> harfler= new ArrayList<>(); // bos bir list olusturur

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("m");

        System.out.println(harfler); // [s, l, m]
    }
}
