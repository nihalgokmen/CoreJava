package day08_nestedIfElse_Ternary;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan  gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        harf=Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("Pazar, Pazartesi ya da Persembe");
        } else if (harf=='S') {
            System.out.println("Sali");
        } else if (harf=='C') {
            System.out.println("Carsamba, Cuma ya da Cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("==============");

        // Daha duzenli ve kullanisli olarak switch statements kullanabiliriz
        // switch statements switch'in onunde yazilan degiskene esit olan
        // case'i calistirir AMA
        // calismaya basladiktan sonra Break gorunceye kadar ya da switch'in sonuna kadar calisir

        switch (harf){
            case 'S':
                System.out.println("Sali");
                break;

            case 'P':
                System.out.println("Pazar, Pazartesi ya da Persembe");
                break;

            case 'C':
                System.out.println("Carsamba, Cuma ya da Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }
    }
}
