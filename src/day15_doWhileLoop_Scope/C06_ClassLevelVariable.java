package day15_doWhileLoop_Scope;

public class C06_ClassLevelVariable {

    /*
        Bir class icinde tum method'larin erisebilecegi variable'lar istenirse
        class level'da (class'in icinde ama method'larin disinda) olusturulmalidir.

        1- Class Level'da olusturulan variable'larin scope'u tum class'tir
        2- Class Level'da olusturulan variable'lara deger atanmasa bile
           Java onlar icin tanimlanmis DEFAULT degerler atar.

        3- Class Level'da olusturulan variable'lar STATIC veya INSTANCE (static olmayan) olabilir,
           Mutlaka static olusturmak zorunda degiliz.

        4- Static olarak tanimlanan variable'lar tum method'larda direkt kullanilabilir.

        5- Method static ise icine static olmayan hic bir sey almaz
     */

    static int sayi = 10;
    static String isim;
    static boolean bl;
    static char chr;
    static int in1;

    public static void main(String[] args) {
        System.out.println(sayi);

        System.out.println("String : "+ isim);  // non primitive icin ==> null
        System.out.println("Boolean : "+ bl);  // false
        System.out.println("Char : "+chr);  //  '' hiclik
        System.out.println("Int : "+in1);  //  sayisal icin ==> 0
    }

    public static void staticMethod() {
        sayi++;
        System.out.println(sayi);
    }

    public void staticOlmayanMethod() {
        sayi--;
        System.out.println(sayi);
    }
}
