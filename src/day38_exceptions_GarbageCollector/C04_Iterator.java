package day38_exceptions_GarbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {

    public static void main(String[] args) {

        /*
            Java'da collections konusunda ogrenecegimiz
            Set gibi bazi yapilar index desteklemez

            Bu durumda index olmadigindan elementleri yazdirmak yazdirmak
            istersek for-each loop kullanabilirz

            Ama elementler arasinda dolasmak, belirli sartlari saglayanlari
            update etmek isterseniz for-each loop ile yaamazsiniz

            Hatta List'te istenmeyen elementleri silmak istedigimizde
            her silme isleminde uzunluk degistigi icin kodlar saglikli calismaz

            Bu sorunlari cozmek icin Java Iterator Interface'ini olsuturmustur
        */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(7);

        // cift olan sayilari silin

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i)%2 == 0){
                sayilar.remove(i);
            }
        }
        System.out.println(sayilar);
    }
}
