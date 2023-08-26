package day38_exceptions_GarbageCollector;

public class C03_Iterator {

    public static void main(String[] args) {

        int[] arr = {3,8,1,9,15};
        
        // tum elementleri yazdirin

        for (int each:arr
             ) {
            System.out.print(each + "  ");
        }

        System.out.println(" ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "  ");
        }

        // Index kullanmdan tum elementleri 3 artirip kaydedin
        // index istenedigi icin normal loop kullanamayiz
        // for-each loop ile deneyelim

        System.out.println(" ");
        for (int each:arr
             ) {

            each = each+3;
            System.out.print(each + "  ");
        }

    }
}
