package day14_methodOverLoding_WhileLoop;

public class C01_AsalSayiYazdir {

    public static void main(String[] args) {

        // verilen 1'den buyuk pozitif bir tam sayinin
        // asal sayi olup olmadigini yazdiran bir method olusturun

        asalMiYazdir(45);
        asalMiYazdir(71);

    }

    public static void asalMiYazdir(int sayi) {

        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }

        if (sayi==2){
            System.out.println("Girdiginiz 2 sayisi ASAL bir sayidir");
        } else if (flag==0) {
            System.out.println("Girdiginiz "+ sayi+ " sayisi ASAL bir sayidir");
        } else {
            System.out.println("Girdiginiz "+ sayi+ " sayisi ASAL bir sayi degildir");
        }

    }

}
