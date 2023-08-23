package day25_PassByValue_ImmutableClasses;

public class C04_StringHavuzu {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = "Ja"+"va"; // Java
        String s = "Ja";
        String t= "va";
        String str5 = s.concat(t); // Java

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true

        System.out.println("=======");

        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // true
        System.out.println(str1==str5); // false

        /*
            Double equal sing == hem referansi hemde degeri karsilastirir
            Equals() ise sadece degerleri karsilastirir

            Eger String havuzunda olup hem referansi hem degeri ayni olan
            Stringler == ile karsilastirilirlarsa sonuc true olur,

            Ancak new Keyword kullanilarak veya method kullanilan
            Stringler == ile karsilastirilirlarsa sonuc false olur.
         */
    }
}
