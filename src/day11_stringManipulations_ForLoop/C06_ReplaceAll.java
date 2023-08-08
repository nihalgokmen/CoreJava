package day11_stringManipulations_ForLoop;

public class C06_ReplaceAll {

    public static void main(String[] args) {

       /*
        Soru 2 : Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
                input1 : “15.30 €” , input2 : “11.40 €”
                output : 36.70 €
         */

        String input1="15.30 €";
        String input2="11.40 €";

        // input'larda digit olamayan herseyi yok edelim

        input1=input1.replaceAll("\\D","");  // 1530
        input2=input2.replaceAll("\\D","");  // 1140

        // digit olmayan olmayanlari yok ettik ama string olduklari icin toplayamayiz
        // o yuzden bunlari integer'a parse etmemiz gerekir

        double inp1=Double.parseDouble(input1);
        double inp2=Double.parseDouble(input2);

        System.out.println((inp1+inp2)/100 + " €");  // 26.7 €


    }
}
