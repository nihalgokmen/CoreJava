package day23_constructor;

public class C03_StaticKeyword {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "02120000000";
    static String bashekimIsmi = "Kemal Aydin";

    String perIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1 = new C03_StaticKeyword();

        System.out.println(personel1.perIsmi);  // null
        System.out.println(hastaneIsmi); // Yildiz Hastanesi
        System.out.println(personel1.bashekimIsmi); // Kemal Aydin

        C03_StaticKeyword personel2 = new C03_StaticKeyword();

        personel2.perIsmi="Dogan";

        System.out.println(personel1.perIsmi); // null
        System.out.println(personel2.perIsmi); // Dogan

        personel2.bashekimIsmi="Sumerya Surel";
        System.out.println(personel1.bashekimIsmi);  // Sumerya Surel

        /*
            1- Static variable'lar tum class icin gecerlidir (class variable)
            2- Static variable'lar tum objeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olsuturulmaz sadece bir variable olur.
            3- Static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya
               gerek yoktur, direkt ulasilabilir.
               Baska class'tan static variable'a ulasmak icin classIsmi.staticVariableIsmi yazilir
         */
    }
}
