package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked-Exceptions kod yazilir yazilmaz daha run etmeden
            Java'nin riskli kodlari tanimlayip
            calistirmadan once "bana bir yol gostermelisin" dedigi
            exceptions turleridir

            Checked Exceptions genelde dosya okuma ve yazma IO islemlerinde olusur

            IO (input-output) exception olusma ihtimaline karsi
            kodu yazar yazmaz Java altini kirmizi cizer
            Checked exception icin kodun altini kirmizi cizdiginden
            kodumuzun calisir hale gelmesi icin
            kirmizi cizgiyi kaldirmamiz lazim :

            1- Try-Catch blogu kullanarak
               exception handle edilebilir
               ve Java'ya exception olustugunda
               ne yapmasini istedigimiz gosterilebilir

            2- Eger exception'i handle etmek istemiyorsak
               sadece kodumuzun calismasini istiyorsak
               method declerasyonuna bu exception ihtimalini yazarak
               kodu calisir hale getirebiliriz

               Method signature'ini throws keyword'u ile
               beklenen exception turunu yazarsak
               kod calisir duruma gelir
               ANCAK Java'ya cozum yolu sunulmadigindan
               kodun calismasi durur
         */

        String dosyaYolu = "src/day36_exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);
    }
}
