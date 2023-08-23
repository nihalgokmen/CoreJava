package day28_accessModifier_encapsulation;

public class C02 {

    public static void main(String[] args) {

        C01 obj = new C01();
        // System.out.println(C01.b);  ==> access modifier privite old icin ulasamayiz
        // System.out.println(C01.c);

        obj.str = "tava";
        C01.s = "TAVA";

        C01.a = 50;

        obj.d = 40; // ==> obje uzerinden ulasabilirz
    }
}
