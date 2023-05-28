package day04_dataCasting_WrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*
            24 ==> 11000
         a ==> 97 ==> 10100010
         b ==> 98
         ahmet
         */


        // Char data turundeki varable'lar ve
        // degerler sayisal data turlerine atanirsa
        // veya sayisal data turundeki datalarla isleme sokulursa
        // Ascii table'daki degerleri ile isleme girer

        System.out.println(5 + 'a');  //5+97=102

        char ilkHarf= 101;
        System.out.println(ilkHarf);  // e

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';

        System.out.println(girilenChar+1);  //102+1=103

        //103'u degil, 103'un ascii karsiligini almak icin explicit casting yapmaliyiz

        System.out.println("Girilen harfin bir sonrasi: " + (char) (girilenChar+1));

        //verilen Char'dan 2 onceki harfi yazdirin

                girilenChar='M';
                System.out.println(girilenChar-2); // 77 - 2= 75
              System.out.println((char)(girilenChar-2)); // K





    }
}
