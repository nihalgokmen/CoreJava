package day37_exceptions;

public class C02_ThrowKeyword {

    public static void main(String[] args) {

        String a = null;
        String b = "";

        try {
            int c = a.length() + b.length();
        } catch (NullPointerException e) {
            if (b.length() == 0){
            }
            throw new RuntimeException(e);
        }

        System.out.println("Selam!");
    }
}
