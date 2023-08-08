package day13_methodOlusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {

        // verilen bir string'i tersine cevirip
        // bize donduren bir method olusturun

        System.out.println(stringTersineCevir("Java Candir")); // ridnaC avaJ
    }

    public static String stringTersineCevir(String metin) {

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin += metin.charAt(i);
        }
        return tersMetin;

    }
}
