package day29_inheritance;

public class C05_Child extends C03_ParentClass{

    int c = 20;
    int a;
    String s = "Child class";
    String m;


    public void method1(){
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        // child class'ta bir obje olusturalim
        // ve ozelliklerini yazdiralim

        C05_Child objC05 = new C05_Child();
        System.out.println(objC05.a); // 0
        System.out.println(objC05.c); // 20
        System.out.println(objC05.b); // 0 ==> burada yok ama parent class'ta b var
        System.out.println(objC05.m); // null
        System.out.println(objC05.s); // Child class
        // bir deger hem bu class'ta hem parent'da varsa en guncele yani bu class'a bakariz

        System.out.println(objC05.t); // null

        objC05.method1(); // Child class method1 ==> en yakin parent'a bakar ve oradaki degeri alir
        objC05.method2(); // Parent method2 calisti
    }




}