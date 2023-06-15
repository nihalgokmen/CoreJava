package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin uc kenar uzunlugunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        // Java'da uclu karsilastirma yoktur,
        // onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz

        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("girilen kenarlar bir eskenar ucgen olusturur");
        }
    }
}
