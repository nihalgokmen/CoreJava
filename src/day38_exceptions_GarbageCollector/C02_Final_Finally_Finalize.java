package day38_exceptions_GarbageCollector;

public class C02_Final_Finally_Finalize {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); //

        // Integer.MIN_VALUE = 3; Constant Data

        System.out.println(Math.PI); // 3.141592653589793

        try {
            System.out.println(10 / 0);
            System.out.println("Bolmenin sonrasindaki satir");

        } catch (Exception e) {

            System.out.println("Catch blogundaki satir");

        } finally {

            System.out.println("Finally blogundaki satir");
        }
    }

}
