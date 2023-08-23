package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_SubList {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(13);
        sayilar.add(53);
        sayilar.add(22);

        System.out.println(sayilar); // [3, 5, 2, 13, 53, 22]

        System.out.println(sayilar.subList(2, 5)); // [2, 13, 53] ==> 2'den 5'e 2 dahil 5 degil

        // subList listeyi degistirmez listenin istedigimiz kesitini yazdirir

        List<Integer> yeniList = sayilar.subList(3, 5);

        System.out.println(yeniList); // [13, 53]

    }
}
