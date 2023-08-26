package day37_exceptions;

import java.util.Scanner;

public class C01_ThrowKeyword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        try {
            if (yas<0){
                throw new IllegalArgumentException("Giris formati yanlis");

            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
