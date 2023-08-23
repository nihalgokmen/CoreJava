package day29_inheritance;

public class C04_Child extends C03_ParentClass{

    int c = 20;
    int a;
    String s = "Child class";
    String m;


    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        C03_ParentClass objC03 = new C03_ParentClass();
        objC03.a = 20;
        objC03.b = 22;
        objC03.s = "p";
        objC03.t = "k";
        objC03.method1(); // Parent method1 calisti
        objC03.method2(); // Parent method2 calisti

        // ==== EXTENDS ONCESI =====
        C04_Child objC04 = new C04_Child();
        objC04.a = 50;
        objC04.c= 20;
        objC04.s = "u";
        objC04.m = "l";
        objC04.method1(); // Parent method1 calisti


        // ===== EXTENDS SONRASI ====    C04 class'inin C03'e child olmasi sonrasi yeni ozellikler eklendi !!!

        objC04.b = 8;
        objC04.t = "y";
        objC04.method2(); // Parent method2 calisti

        /*
            Java'da parent class'lar child edinmez
            child class'lar parent edinir

            Bir class'in baska bir class'daki TUM OZELLIKLERI
            otomatik olarak edinmesini istiyorsak
            class'imizi extends keyword ile o class'a child yapariz
            (size baba diyebilir miyim? Hatta sizi parent yaptim)
         */
    }

}
