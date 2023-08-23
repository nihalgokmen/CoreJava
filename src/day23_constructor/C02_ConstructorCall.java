package day23_constructor;

public class C02_ConstructorCall {

    /*
        Java'da ihtiyac olursa bir constructor icinden baska cons cagirilabilir
        this(ilgili parametreler) yazarak istedigimiz constructor'u cagirabiliriz

        Constructor call icin 2 kural vardir
        1- Constructor call icinde bulundugu constructor'in ilk satirinda olmalidir,
        2-
     */
    int sayi;
    String str;

    public C02_ConstructorCall() {
        System.out.println("parametresiz constructor calisti");
    }

    public C02_ConstructorCall(int sayi) {
        System.out.println("int parametreli constructor calisti");
        this.sayi = sayi;
    }

    public C02_ConstructorCall(String str) {
        this(5);
        System.out.println("String parametreli constructor calisti");
        this.str = str;
    }

    public C02_ConstructorCall(int sayi, String str) {
        // C02_ConstructorCall(); ==> boyle yazildiginda method call olarak algilar
        this(); // Java syntax olarak constructor call olarak bunu belirlemistir

        this.sayi = sayi;
        this.str = "Java";
        System.out.println("2 parametreli cons calisti");

    }

    public static void main(String[] args) {

        C02_ConstructorCall obj3 = new C02_ConstructorCall(7,"Selcuk");
        System.out.println(obj3.sayi); // 7
        System.out.println(obj3.str); // Java

        /*
        C02_ConstructorCall obj2 = new C02_ConstructorCall("Java");
        System.out.println(obj2.sayi);// 5
        System.out.println(obj2.str); // Java
         C02_ConstructorCall obj1 = new C02_ConstructorCall();
         */

    }
}
