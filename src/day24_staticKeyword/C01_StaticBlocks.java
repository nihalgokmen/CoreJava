package day24_staticKeyword;

public class C01_StaticBlocks {

    C01_StaticBlocks() {
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

        System.out.println("======");

        C01_StaticBlocks obj1= new C01_StaticBlocks();

    }

    static {
        /*
            Static bloclar class ilk calaismaya bsaladiginda calisir,
            genel olarak class icin gerekkli on ayarlamalari yapmak icin kullanilir.

            Birden fazzla static block varsa,
            yukaridan asagi dogru sirali olarak calisir.
         */

        System.out.println("Static block calisti");
    }

    static {
        System.out.println("Alttaki static block calisti");
    }

    {
        /*
            Static olmayan blocks ise obje olusturulurken constructor'dan once calisir
            obje icin yapilmasi gereken on ayarlamalar yapmak icin kullanilir.
         */
        System.out.println("Static olmayan block calisti");
    }

}
