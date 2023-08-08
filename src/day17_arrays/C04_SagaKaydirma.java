package day17_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C04_SagaKaydirma {

    public static void main(String[] args) {

        // Verilen int bir Array'deki tum elementleri
        // bir saga kaydirip sondaki elementi de en basa kaydedin.
        // ornek: [3,4,5,6] ==> [6,3,4,5] seklinde olmali.

        int[] arr = {3, 4, 5, 6};

        int temp = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
        }

        arr[0]=temp;

        System.out.println(Arrays.toString(arr));
    }
}
