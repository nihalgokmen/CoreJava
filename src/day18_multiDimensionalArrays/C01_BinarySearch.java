package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_BinarySearch {

    public static void main(String[] args) {

        // verilen Array'de istenen bir elemanin olup olmadigini bulur

        int[] arr = {4, 5, 6, 7, 8, 2, 9, 4, 1};

        System.out.println(Arrays.binarySearch(arr, 5)); // 1
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        System.out.println(Arrays.binarySearch(arr, 7)); // 3
        System.out.println(Arrays.binarySearch(arr, 9)); // 6

        // Array'de binarySearch() methodu'nun
        // duzgun calismasi icin oncelikle SORT() calistirilmlidir.

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [1, 2, 4, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 7)); // 6
        System.out.println(Arrays.binarySearch(arr, 2)); // 1

        // binarySearch aranan elemanin index'ini doner.





        // olmayan bir eleman aratilirsa once arrray'de olsaydi nerede olurdu
        // bunu bulur, sonra olmasi gereken siranin negatif degerini verir
        // bu mantikla en kucuk elemandan daha kucuk butun sayilar icin -1
        // en buyuk elemandan buyuk olan butun sayilar icin de -length-1 degeri dondurur.
    }
}