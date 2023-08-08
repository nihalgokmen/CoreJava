package day14_methodOverLoding_WhileLoop;

public class C03_MethodOverloding {

    public static void main(String[] args) {

        /*
            Bir classta ayni isme sahip farkli islem yapan
            method'lar olabilir,
            Java bu method'lardan hangisinin calisacagina
            parametrelere gore karar verir.

            Bu isleme bir class'ta ismi ayni parametreleri farkli
            methodlar olmasina Method OVERLODING denir.
         */

        String str = "Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel")); // Java guzel olacak
        System.out.println(str.replace('u', 'e')); // Be is olacak


    }
}
