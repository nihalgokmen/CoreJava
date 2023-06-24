package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {

        // kullanicidan pozitif bir tamsayi alin
        // sayi cift ise "sayi cift"
        // degilse "tek sayi" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift");
        } else {
            System.out.println("Sayi tek");
        }

        System.out.println(sayi%2==0 ? "Sayi cift" : "Sayi tek");
    }
}
