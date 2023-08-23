package day25_PassByValue_ImmutableClasses;

public class C03_ImmutableClasses {

    public static void main(String[] args) {

        /*
            Java'da bir class ve o class'tan olusturulan objeler
            ya Mutable'dir ya da Immutable'dir

            Java metinsel ifadeleri atayabilecegimiz 3 class olusturmustur
            Bunlar:
            - String  ---- Immutable
            - StringBuilder  -----Mutable
            - StringBuffer  -----Mutable

            Immutable bir class'tan olusturulan objeler de Immutable'dir,
            String Immutable oldugundan str objesine yeni deger atandiginda
            Java eski degeri DEGISTIREMEZ bunun yerine istenen yeni dgere sahip yeni bir obje olusturur
            ve str'in pointer'ini yeni objeye yoneltir.

            Kullanilmayan eski objeler
            GARBAGE COLLECTOR tarafindan toplanmak uzere beklerler.
         */
        String str = "Java candir";

        str = str.toLowerCase();
        System.out.println(str); // java candir

        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDİR

        // Asagidaki kod calistiginda Java kac obje olusturur?

        String s = "Hava";

        for (int i = 0; i < 100; i++) {
            s = s + ".";
        }
        System.out.println(s);  // 100 tane for tarafindan 1 tane de basta olusan ==> 101 tane
    }
}
