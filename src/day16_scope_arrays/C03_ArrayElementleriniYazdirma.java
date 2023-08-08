package day16_scope_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {

    public static void main(String[] args) {

        int[] arr={3,5,7,9,1,2};

        // tum array'i yazdirin
        System.out.println(Arrays.toString(arr));  // [3, 5, 7, 9, 1, 2] ==> bu bir array dir

        // Array'in tum elementlerini yan yana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+" ");  // 3 5 7 9 1 2 ==> bu da array'in elementleridir
        }
    }
}
