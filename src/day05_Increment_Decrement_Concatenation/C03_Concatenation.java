package day05_Increment_Decrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {

        // Bir String baska bir String veya baska data turunden
        // bir variable ile + isareti ile birlestirilebilir

        String a= "java";
        String b= "guzeldir";

        System.out.println((a + b));  // javaguzeldir

        System.out.println(a+ " " + b);  // java guzeldir

        int c=10;
        int d=20;

        System.out.println(a+c+d);  //java1020

        // Eger String ile baska data turundeki
        // bir deger toplanirsa Java sonucu String yapar

        // Peki Java30 yazmak istersek
        System.out.println(a+(c+d)); // java30

        System.out.println(a+c*d);  //java200  ==> islem onceligi carpmada

        System.out.println(d+c+a);  //30java  ==> islem onceligi soldan saga


    }
}
