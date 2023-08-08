package day18_multiDimensionalArrays;

public class C05_MDA {

    public static void main(String[] args) {

        int [][] arr={{3,5,7},{1,2,3,4},{1,2},{7}};

        // tolam element sayisi kactir

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i].length;
        }
        System.out.println("Toplam element sayisi : "+toplam); // 10

        // tum elementlerin toplamini bulun

        int elementToplami=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                elementToplami += arr[i][j];
            }
        }
        System.out.println("Tum elementlerin toplami : "+elementToplami);  // 35

        // MDA'lerde her bir elementi elden gecirmek istiyorsak
        // kat sayisi kadar nested for-loop kullaniriz
    }
}
