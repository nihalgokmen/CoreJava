package day36_exceptions;

public class C01_TryCatch {

    public static void main(String[] args) {

        /*
            Kodlarimizi yazarken
            sorun olusma ihtimali gordugumuzde
            sorun cikma potansilyeli olan kodlari
            Try - Catch - (Finally) blok(lari) ile cevreleriz
         */

        int sayi1 = 20;
        int sayi2 = 0;


        try {
            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

           // e.printStackTrace();  exceptoin'da gordugumuz tum hata aciklamalarini yazdirir
            System.out.println("Bolen sayi sifir olamaz");

           // System.out.println(e.getMessage()); ==> / by zero  hatanin kaynagini gosterir
        }

         /*
            Bir try-catch blogu 3 bolumden olusur

            1- Try blogu : 18-20(haric)
               exception olusturma potansiyeli olan kodlari yazariz

            2- Catch statement :
               olusma ihtimali olan exception
               e : karsilastigi exception'i kaydedecegimiz obje
                   (aritmetik excetion class'indan bir obje)

            3- Catch : 23-25(haric)
               ongorulen exception gerceklestiginde
               calsimasini istedigimiz kodlar

         */
    }
}
