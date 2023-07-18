package day10_stringManipulation;

public class C02_Contains {
    public static void main(String[] args) {

        String str= "Java ogren isi kap";
        System.out.println(str.contains("Java")); // true

        String s = "k";
        System.out.println(str.contains(s)) ; // true

        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains(""));  // true
        System.out.println(str.contains("java"));  // false ===> ignore case burada yoktur


    }
}
