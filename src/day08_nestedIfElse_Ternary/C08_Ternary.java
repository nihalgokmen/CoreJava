package day08_nestedIfElse_Ternary;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        char krk = 'e';

        System.out.println(krk > 'a' && krk < 'z'
                ? Character.toUpperCase(krk)
                : krk);

    }
}
