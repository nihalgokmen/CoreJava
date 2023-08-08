package day14_methodOverLoding_WhileLoop;

public class C02_isAsal {

    public static void main(String[] args) {

        //verilen 1'den buyuk bir tam sayi icin
        // sayi asla ise ==> ture
        // sayi asal degilse ==> false donen bir method olusturun

        System.out.println(isAsal(23));
        System.out.println(isAsal(78));

        boolean sonuc = isAsal(57);  // sonuc varable'ina false degeri atar

    }

    public static boolean isAsal(int sayi) {

        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }

        if (sayi==2){
            return true;
        } else if (flag==0) {
            return true;
        } else {
            return false;
        }

    }

}
