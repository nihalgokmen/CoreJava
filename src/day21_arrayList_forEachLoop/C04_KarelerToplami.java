package day21_arrayList_forEachLoop;

public class C04_KarelerToplami {

    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip,
        //         karelerinin toplamini yazdiran bir method olusturun.

        int[] arr = {2, 3, 5, 4, 0, 2};

        karelerToplaminiYazdir(arr);

    }

    public static void karelerToplaminiYazdir(int[] arr) {

        int karelerToplami = 0;

        for (int each : arr
        ) {
            karelerToplami += each * each;
        }

        System.out.println("Verilen arr'deki elementlerin kareleri toplami : "+ karelerToplami);
    }
}
