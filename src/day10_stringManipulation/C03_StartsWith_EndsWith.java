package day10_stringManipulation;

public class C03_StartsWith_EndsWith {
    public static void main(String[] args) {

        String str= "Java harika";
        System.out.println(str.startsWith("java"));  // false
        System.out.println(str.startsWith("Ja"));  // true
        System.out.println(str.startsWith(str));  // ture

        System.out.println(str.startsWith(""));  // true

        System.out.println("=========");


        System.out.println(str.endsWith("a")); //true
        System.out.println(str.endsWith("ka"));
        System.out.println(str.endsWith(str));
        System.out.println(str.endsWith(""));

        System.out.println(str.endsWith(str.substring(str.length() - 1)));  // true

    }
}
