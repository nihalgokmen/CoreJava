package day31_inheritance;

public class BAraba {

    String str1 = "Araba";

    protected BAraba(){
        System.out.println("Araba parametresiz consructor calisti");
    }

   protected BAraba(String str){
        System.out.println("Araba str parametreli consructor calisti");
    }

    protected BAraba(int a, int b){
        System.out.println("Araba iki int parametreli consructor calisti");
    }
}
