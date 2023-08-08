package day15_doWhileLoop_Scope;

public class C05_LocaleVariable {
    public static void main(String[] args) {

        /*
            1- Bir method icerisinde olusturulan variable'in scope'u o method'tur.
               Baska bir method'ta KULLANILAMAZ, bu variable'lara Locale Variable denir.

            2- Her ne kadar bir method icinde olsalar da Loop'larin da ayri bir scope'u vardir.
               Loop icerisinde olusturulan varable'lar loop disinda kullanilamazlar.

            3- Locale Variable'lari deger atamadan olusturabiliriz
               ancak deger atamadan KULLANAMAYIZ.
         */


        String str="Ali Can";

       // System.out.println(sayi);

        for (int i = 0; i < 10; i++) {
            int j= i+1;
        }

        // System.out.println(i); ====> Loop icinde olan loop icinde kalir
        // System.out.println(j);       Loop'larin da kendi alani/ scope'u vardir disarda kullanilmaz.

    }

    public static void baskaMethod(){

        int sayi=3;

        // System.out.println(str);

    }
}
