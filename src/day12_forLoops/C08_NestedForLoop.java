package day12_forLoops;

public class C08_NestedForLoop {

    public static void main(String[] args) {

        // dinamik olarak verilen satir ve sutun sayisina gore
        // yildizlardan bir dikdortgen olusturun

        /*
            * * * * *
            * * * * *
            * * * * *
         */

        int satirSayisi=3;
        int sutunSayisi=5;

        for (int k=1; k<=satirSayisi ; k++) {  // satir sayisini kontrol eder
            for (int i = 1; i <=sutunSayisi ; i++) {  // sutun sayisini kotrol eder
                System.out.print("* ");
            }
            System.out.println("");  // bir satirdaki tum sutunlar birince alt satira gecer
        }

        System.out.println("=======");

        for (int i = 1; i <=satirSayisi ; i++) { // satirlar

            for (int j = 1; j <=sutunSayisi ; j++) { // sutunlar

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
