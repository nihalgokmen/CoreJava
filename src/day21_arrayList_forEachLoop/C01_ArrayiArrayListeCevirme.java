package day21_arrayList_forEachLoop;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayiArrayListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8};

        // arr array'inin elementlerini iceren bir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("Sayilar listesi : "+ sayilar);

        /* Java'da bir array'i arrayList'e cevirmek icin kullanilan asList() vardir
           ancak kullanimi tavsiye edilmez, cunku 2 tane buyuk dezavantaji vardir
           1- asList() kullanilarak array'den list'e cevrilen listelerde
              ekleme / silme gibi uzunlugu degistiren method'lar kullanilamaz
           2- Arka planda array ve array'den donusturdugumuz list beraber hareket eder
              birinde yaptigimiz update'ler otekine de islenir
         */

        List<Integer> arraydenList= Arrays.asList(arr);
        System.out.println("Array'den list'e cevrilen : "+arraydenList);

        // iki list'e de 11 ekleyelim

        sayilar.add(11);
        // arraydenList.add(11); // UnsupportedOperationException

        System.out.println("sayilar listesi: "+sayilar);
        System.out.println("arrayden liste cevrilen: "+arraydenList);

        // 2. dezavantaj

        System.out.println("Array         : "+Arrays.toString(arr));
        System.out.println("Arrat'den List: "+arraydenList);

        // List'in bir elementini update edelim

        arraydenList.set(1,45);
        System.out.println("===== List'i Degistirdikten Sonra =====");
        System.out.println("Array         : "+Arrays.toString(arr));
        System.out.println("Arrat'den List: "+arraydenList);  // her ikisi de update olur


    }
}
