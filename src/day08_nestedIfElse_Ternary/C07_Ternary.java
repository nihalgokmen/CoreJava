package day08_nestedIfElse_Ternary;

public class C07_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        int kenar1= -12;
        int kenar2= -12;
        int kenar3= -12;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 && kenar1>0
                            ? "Eskenar ucgen"
                            : "Eskenar degil");
    }
}
