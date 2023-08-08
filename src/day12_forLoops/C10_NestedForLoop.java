package day12_forLoops;

public class C10_NestedForLoop {

    public static void main(String[] args) {

        /*
             verilen satir sayisina gore
             asgidaki sekli olusturan kod yaziniz

             *
             * *
             * * *
             * * * *

         */

        int satir=4;

        for (int i = 1; i <=satir ; i++) {  // satirlar Outer Loop / dis dongu

            for (int j = 1; j <=i ; j++) { // sutunlar Inner Loop / ic dongu

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
