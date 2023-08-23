package day25_PassByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar); // [3, 4, 5]

        elemntleriArtir(sayilar);
        // elementleri artir methodunu calistirdiktan sonra
        System.out.println("element artir methodundan : "+sayilar);

        yeniListeAta(sayilar);
        System.out.println("yeni liste ata methodundan : "+sayilar);
    }

    public static void elemntleriArtir(List<Integer> sayilar){
        // Tum elementleri iki katina cikaralim

        for (int i = 0; i < sayilar.size() ; i++) {
            sayilar.set(i, 2*sayilar.get(i));
        }

        System.out.println("elementleri artir methodundan : "+sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){
        // Sayilar listesine yeni bir List atayip
        // Sonra 1,2,3 elemenlerini ekleyin

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("yeni liste ata methodundan : "+sayilar);


         /*
             Pass by Value ile ilgili en kritik noktalar:
            1- Size interview (iş görüşmesi, mülakat)'de sorduklarında Java "Pass by Value" yi
               tercih etmiştir diyeceksiniz. (Pass by Reference değil )

            2- Pass by Value, bir methoda parametre olarak gönderdiğimiz variable'ımızın değeri
               method'da değiştirildiğinde, bizim main methoddaki variable'ımızın değerinin değişmemesidir.

            3- Method'a gönderdiğimiz bir "List" veya "Array" gibi bir obje ise, bu durumda Pass by Value
               nasıl çalışır? Eğer method'da "New" diye yeni bir değer ataması yoksa, sadece elementler değişiyorsa,
               o zaman bizim main method'daki elementler de değişmiş olur. Yani araba aynı, yolcular değişmiş olur.
               Ama eğer method'da "New" keyword ile objemize yeni bir değer atanmışsa, o zaman o yeni methoda atanan
               değer method'da kalır, bizim main method'daki hem List'imiz ve Array'imiz hem de içindeki elementler
               değişmemiş olur. Yani yeni araba varsa bizim değişimle işimiz yok.
         */
    }
}
