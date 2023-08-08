package day11_stringManipulations_ForLoop;

public class C04_ReplaceAll {
    public static void main(String[] args) {

        String str= "J1a23va34 5C54and65ir87";

        // str'daki sayilari methodla temizleyin

        /*
            Eger degistirmek istedigimiz metin tek bir metin degil
            ortak ozelligi olan farkli metinlerse

            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space'ler
            - space olamayan tum karakterler

            bu ortak ozellikleri belirtmek icin Java Regex tanimlamistir

         */

        // Replace'de hem char hem String kullanilir,
        // Replace all da Regex kullanilir ama char KULLANILAMAZ

        /*
           (Regular Expressions)
           \\s bosluk (
           \\S bosluk disindaki tum karakterler
           \\w harfler ve rakamlar (a z A Z, 0 9)
           \\W harfler ve rakamlar disindaki tum karakterler
           \\d rakamlar 0 9
           \\D rakamlar disindaki tum karakterler,

        */

        str=str.replaceAll("\\d","");
        System.out.println(str);  // Java Candir

    }
}
