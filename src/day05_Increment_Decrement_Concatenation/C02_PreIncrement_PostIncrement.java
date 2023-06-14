package day05_Increment_Decrement_Concatenation;

public class C02_PreIncrement_PostIncrement {
    public static void main(String[] args) {

        /*
            Eger sayinin degerini SADECE 1 artacak veya azalacaksa;

            Artirip sonra yazdirma/ atama,
            yazdirip sonra artirma/ atama

            islemleri tek satirda yapilabilir

         */


        // a'nin degerini 1 artirin ve yeni degeri olusturacaginiz b variableína atayin

        int a= 20;
        int b= ++a;  // ==> tek satirda once artirip sonra atama yapariz

        /*
        a ++ ;
        int b= a;
         */

        System.out.println("a: "+a+", b: "+b);  // a: 21, b: 21

        // a'nin degerini b'ye atayin, sonra a'nin degerini 1 artirin

        a=20;
        b=a++;  // ==> tek satirda once atayip sonra artirabiliriz

        /*
        b=a;
        a++;
         */

        System.out.println("a: "+a+", b: "+b); // a: 21, b: 20


        // a'nin degerini yazdirin ve sonra a'yi 1 artirin

        a=20;

        System.out.println("a: "+a);  // a: 20  ====> bunu da tek satirda yapabliriz
        a++;

        System.out.println("=======");

        a=20;
        System.out.println("a: " + a++);  // a: 20
        System.out.println("Bir sonraki satirda a: " +a);  // Bir sonraki satirda a: 21

        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin

        a=20;
        System.out.println("a: " + --a); // a: 19








    }
}
