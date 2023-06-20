package day07_genelTekrar_IfElseSatatement;

import java.util.Scanner;

public class C04_IfElseIf {
    public static void main(String[] args) {


        // kullanicidan pozitif bir tam sayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolune biliyorsa "5'in kati"
        // sayi hem 3 hemde 5 ile bolunebiliyorsa "hem 3 hem 5'in kati"


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("hem 3'un hem de 5'in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");
        }

        /*
            Bazen sartlar olasi tum durumlari karsilamaz
            bu durumda if else if ... cumleleri else ile BITMEZ

            Else ile bitmeyen else if cumlelerinde
            bazi durumlarda HICBIR if body'si devreye girmeyebilir


         */
    }
}
