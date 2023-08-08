package day11_stringManipulations_ForLoop;

public class C01_IsEmpty_IsBlank {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.isEmpty()); // false

        System.out.println(str.isBlank()); // false ===> str space'lerden mi olusuyor?


        str = "  ";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.length()); // 3

        System.out.println(str.isBlank()); // true


        str = "";

        System.out.println(str.isEmpty()); // true
        System.out.println(str.length()); // 0

        System.out.println(str.isBlank()); // true  ===> hiclikte de true verdi


    }
}
