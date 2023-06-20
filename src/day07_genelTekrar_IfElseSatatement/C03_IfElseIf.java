package day07_genelTekrar_IfElseSatatement;

import java.util.Scanner;

public class C03_IfElseIf {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tam sayi alin
        // sayi 3 ile bolunebiliyorsa "3'un kati"
        // sayi 5 ile bolune biliyorsa "5'in kati"
        // sayi hem 3 hemde 5 ile bolunebiliyorsa "hem 3 hem 5'in kati"
        // ikisine de bolunemiyorsa "ne 3'un ne de 5'in kati" yazidirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("Sayi hem 3'un hemde 5'in kati");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayi 3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayi 5'in kati");
        } else {
            System.out.println("Sayi ne 3'un ne de 5'in kati degildir");
        }

        /*
            Eger bir if else if... cumleri else ile bitiyorsa
            MUTLAKA if body'lerinden 1 TANESI CALISIR
         */
    }
}
