package day10_stringManipulation;

public class C06_LastIndexOf {
    public static void main(String[] args) {

        String str= "Java bazen beyin yakar";

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.lastIndexOf("a")); // 20

        System.out.println(str.indexOf("a", 2)); //3

        System.out.println(str.lastIndexOf("a", 19)); // 19. indexten geriye gidip
                                                                   // ilk buldugu a'nin index'ini verir  ==> 18

        System.out.println(str.indexOf("a", 4)); // 6

        System.out.println(str.lastIndexOf("a", 17)); // 6

        System.out.println(str.indexOf('e')); // 8

        System.out.println(str.lastIndexOf('e')); //12

        System.out.println(str.lastIndexOf("Ayse"));  // -1



        // Verilen bir cumlede istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 defa kullanilmis
        // 2- aradiginiz kelime cumlede 1'den fazla kullanilmis
        // 3- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Yasasin Java, iyiki Java ogreniyorum";
        String kelime= "Java";

        int ilkIndex= cumle.indexOf(kelime);
        int lastIndex= cumle.lastIndexOf(kelime);

        if (ilkIndex== (-1)){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex==lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 defa kullanilmis");
        } else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");
        }
    }
}
