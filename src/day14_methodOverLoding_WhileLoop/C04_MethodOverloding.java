package day14_methodOverLoding_WhileLoop;

public class C04_MethodOverloding {
    public static void main(String[] args) {

        /*
                 JAVA OVERLODING KURALLARI
             1- Isim ve parametreleri ayni olan birden fazla method olusturulamaz.
             2- Data turleri farkli olan parametrelerin yerlerini degistirirsek
                Java yeni bir method olarak kabul eder (int, double yerine double, int'e izin verir).

             Overloding olan class'larda
             Java hangi method'un calistirilacagina su sekilde karar verir

             1- Cagirilan isimde bir method var mi?
             2- Method call'da kullanilan arguments ile method'lardaki parametreler %100 uyumlu mu?
             3- Argument ile parametre ayni olmasa bile verilen argumentleri kabul edecek parametre var mi?
             4- Casting ile birden fazla method'u kullanabiliyorsa, en az casting ile calisacak method'u kullanir.
         */

        topla(3, 5);  // 8
        topla(3.4, 5.1);  // 8.5

        // topla(ali, veli); CTE ==> Bu argumentleri kabul edecek parametre yok

        topla('a', 'b');  // char parametresi yok ama bu argumentlerin ascii degerlerini topladi

        topla(3f, 4f); // Iki double sayinin toplami: 7.0 ==> floattan daha genis olan double'a aktarir

        topla(3f, 4); // Double ve int sayilarin toplami: 7.0

    }


    public static void topla(int a, int b) {
        System.out.println("Iki tam sayinin toplami: " + (a + b));
    }

    public static void topla(double a, double b) {
        System.out.println("Iki double sayinin toplami: " + (a + b));
    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("Int ve double sayilarin toplami: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, int sayi2) {
        System.out.println("Double ve int sayilarin toplami: " + (sayi1 + sayi2));
    }
}
