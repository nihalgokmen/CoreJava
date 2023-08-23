package day31_inheritance;

public class CToyota extends BAraba {

    String str2 = "Toyota";

   protected CToyota(){
        super("Java");
       System.out.println("Parametresiz Toyota constructor'u calisti");
    }

   protected CToyota(int sayi){
        System.out.println("Int parametreli Toyota constructor'u calisti");
    }

    protected CToyota(String s){
        System.out.println("String parametreli Toyota constructor'u calisti");
    }
}
