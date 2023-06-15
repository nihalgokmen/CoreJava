package day06_bagimsizIfCumleleri;

public class C01_IfStatements {
    public static void main(String[] args) {

        /*
             Buradaki sartlar birbirinden bagimsizdir
             uygun sayilar olursa 3 if body'si de calisir
             bazen de hicbir if body'si devereye girmeyebilir

             kodumuz konsolda hicbirsey yazdirmadi ancak
             Process finished with exit code 0
             yazmasindan kodun hicbir sorun olmadan calistigini anlariz

             sadece degerler sartlari saglamadigi icin
             konsolda bir sey yazdirmadi
         */

        int a= 13;
        int b= 97;

        if (a>b){
            System.out.println("a b'den buyuktur");
        }

        if (a%2==0){
            System.out.println("a cift sayidir");
        }

        if (b>100){
            System.out.println("b 100'den buyuktur");
        }


    }
}
