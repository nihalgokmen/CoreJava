package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        String[] isimler= {"Nurefsan", "Berke", "Mustafa"};
        int [] sayilar= {3,4,5,6,7,8};
        char[] karakterler= {'e','4',','};

        // Array non-primitive data turlerindendir.
        // Eger array'i liste seklinde olusturmayip
        // new keyword olarak kullaniyorsak UZUNLUGUNU yazmak ZORUNDAYIZ.


        String [] arr=new String[5];

        // Bir array tanimlanan uzunluktan daha fazla veya az eleman ALAMAZ.

        // Bir array'i yazdirmak istersek
        // Array'ler direkt yazdirilamaz

        System.out.println(isimler);  // referansi ==> [Ljava.lang.String;@d041cf

        System.out.println(Arrays.toString(isimler)); // [Nurefsan, Berke, Mustafa]
        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null] default

        int[]a=new int[7];
        System.out.println(Arrays.toString(a));  // [0, 0, 0, 0, 0, 0, 0]

        // Array'deki elementlere Index ile ulasiriz

        a[0]=4; // [4, 0, 0, 0, 0, 0, 0]
        a[3]=7; // [4, 0, 0, 7, 0, 0, 0]
        // a[8]=9; // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));

        // sayilar array'inin 4. index'indeki elementi yazdirin

        System.out.println(sayilar[4]); // 7

        // isimler Array'inin 1. index'indeki ismi yazdirin

        System.out.println(isimler[1]); // Berke
    }
}
