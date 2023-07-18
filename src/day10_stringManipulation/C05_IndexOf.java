package day10_stringManipulation;

import javax.swing.*;

public class C05_IndexOf {
    public static void main(String[] args) {

        String str = "Java cok ama cok guzel";

        System.out.println(str.indexOf("c")); // 5

        System.out.println(str.indexOf("a")); // birden fazla ise ilk buldugunu verir ===> 1

        System.out.println(str.indexOf("cok")); // baslangic index'ini verir ===> 5

        System.out.println(str.indexOf("cok", 6)); // 6. index'ten sonraki cok'a bakar ==> 13
        System.out.println(str.indexOf("cok", 5)); // 5

        System.out.println(str.indexOf("java")); // -1
        // aranan string yoksa hep -1 doner

        // Verilen bir cumlede istenen bir String icin
        // asagidaki cumlelerden uygun olani yazdirin
        // 1- aradiginiz kelime cumlede 1 defa kullanilmis
        // 2- aradiginiz kelime cumlede 2 defa kullanilmis
        // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
        // 4- aradiginiz kelime cumlede hic kullanilmamis

        String cumle = "Yasasin Java, iyiki Java ogreniyorum";
        String kelime= "Java";

        if (cumle.indexOf(kelime) == -1){
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        }else { // kesinle kelime cumlede var, ama kac tane?
            int kelimeIlkIndex=cumle.indexOf(kelime); // 8
            if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                System.out.println("aradiginiz kelime cumlede 1 defa kullanilmis");
            } else {
                int ikinciKelimeIndex=cumle.indexOf(kelime, (kelimeIlkIndex+1));
                if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 2 defa kullanilmis");
                }else {
                    System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");
                }
            }

        }




    }
}
