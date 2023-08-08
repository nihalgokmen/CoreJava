package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {

        /*
             null bir deger degildir
             null bir pointer'dir, yanina yazildigi non-primitive variable'a
             deger atanmadigini isaret eder
         */

        String str;  // str olusturulu ama deger atanmadi

        // Java method icerisinde deger atamadan variable olsuturulmasina izin verir
        // ama deger atamadan kullanilmasina izin vermez

        // System.out.println(str);  CTE
        // str.concat("Java");  CTE

        /*

         */

        str = null;  // str= "null"; degil bu onemlidir, null'in bir deger olmadigini gosterir
        // degeri null degildir, null sadece bir isarettir

        System.out.println(str);  // null

        // System.out.println(str.concat("Java"));  // Run Time Error ---- NullPointerException

        System.out.println(str + "Java");  // nullJava

        String str2 = str + "Java";
        System.out.println("str2: " + str2); // nullJava

        // Sadece listelemeye ve + ile kullanima izin verir, bunundisinda hicbir method'ta kullanima izin vermez

        // int sayi= null;  primitive variable'lara null verilemez
        Integer sayi = null;

        // biz genelde String bir ifade olusturur sonra deger atayacaksak
        // hiclik degeri atariz

        String str3 = "";  // str3'e bir deger atanmis ve atanan deger hicliktir
        // boylece istedigimiz method'ta kullanilabilir

        System.out.println(str3.concat("Java"));  // Java


        System.out.println(str.isEmpty()); // deger atanmamis ki dolu ya da bos olamaz ----> NullPointerException
        // null olarak isaretlenmis str'i isEmpty de hata verir cunku hicbir methodla kullanilamaz


        System.out.println(str3.isEmpty());  //true
    }
}
