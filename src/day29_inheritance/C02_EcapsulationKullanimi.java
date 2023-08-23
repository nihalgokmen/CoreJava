package day29_inheritance;

public class C02_EcapsulationKullanimi {

    public static void main(String[] args) {

        C01 obj = new C01();

        obj.isim = "Melike"; // write
        System.out.println(obj.isim); // read

        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read

        /*

         */
    }
}
