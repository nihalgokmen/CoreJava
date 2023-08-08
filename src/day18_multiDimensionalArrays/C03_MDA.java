package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {

    public static void main(String[] args) {

        int [][] arr= {{3,4,5},{2,3},{1}};

        // int [][] iki katli Array belirtir
        // ilk parantez OUTER ARRAY'i ifade eder
        // ikinci parantez INNER ARRAY'leri kontrol eder

        System.out.println(arr[1][1]);  // index'i 1 olan inner array'in 1. index'ini yazdirir ==> 3

        System.out.println(arr[0][2]);  // 5

        System.out.println(arr[2].length); // 1 ==> outer array'in 2. elementinin length'i

        System.out.println(arr[1]); // [I@d041cf ==> array direkt yazdirilamaz referansini yazar
        System.out.println(Arrays.toString(arr[1]));  // [2, 3] ==> arrays ancak boyle yazdirilabilir

        System.out.println(Arrays.toString(arr));  // [[I@129a8472, [I@d041cf, [I@1b0375b3]
        System.out.println(Arrays.deepToString(arr)); // [[3, 4, 5], [2, 3], [1]] ==> tum elementler boyle yazdirilir

        System.out.println(arr.length); // 3 ==> inner arrayleri sayar


    }
}
