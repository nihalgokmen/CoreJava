package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("a");
        harfler.add("b");
        harfler.add("k");

        System.out.println(harfler);  // [a, b, k]

        System.out.println(harfler.remove("b")); // true
        System.out.println(harfler); // [a, k]

        System.out.println(harfler.remove(0));  // a ==> o indexteki hangi objeyi sildigini bize dondurur
        System.out.println(harfler); // [k]


        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]

        /*
            eger sadece sayilardan olusan bir list varsa
            remove methodu'na yazacagimiz sayiyi index olarak kabul eder

            eger sayiyi silmek isterseniz remove methodundan
            once o sayiyi bir objeye atayip
            remove methodunda obje ismini atayabiliriz
         */

        sayilar.remove(1);
        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi= 1;

        sayilar.remove(silinecekSayi);  // artik 1 elementini silecek
        System.out.println(sayilar); // [18, 2]
    }
}
