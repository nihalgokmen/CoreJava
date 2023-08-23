package day28_accessModifier_encapsulation;

public class C01 {

    String str; // class level'daki her class uyesinin access modifier'i olur
                // eger access modifier gorunmuyorsa Java o class uyesini default access modifier olarak isaretler

    static String s;

    public static int a;
    public int d;
    private int b;
    private static int c;


    public static void main(String[] args) {

        int sayi = 10;

        // public int sayi2 = 20;
        // static String b;

        // Bir method icerisinde public, protected, privite gibi access modifier'lar
        // veya static keyword KULLANILAMAZ

        // System.out.println(b); ==> staticten dolayi ulasamaz
        System.out.println(c);

        // str = "Java";  ==> static degil
        s = "Hava";

        a=10;
        // d=20; ==> static degil instance old icin kabul etmedi

    }

    void method1(){
        System.out.println(b);
        System.out.println(c);

        str = "Java";
        s = "Hava";

        a=10;
        d=20;

    }

    static void method2(){

    }

    public void method3(){

    }


}
