package day24_staticKeyword;

public class C02_PassByValue {

    public static void main(String[] args) {

        double fiyat = 200;


        /*
        int fiyat=500;
        String fiyat= "Java pass by value kullanir";

        Java ayni method icerisinde ayni isimde
        birden fazla variable olusturulmasina IZIN VERMEZ.
         */

        indirimYap10(fiyat);
        System.out.println("Method call'dan sonra : "+fiyat);

        indirimYap25(fiyat);
        System.out.println("2. Method call'dan sonra : "+fiyat);

        System.out.println("Return yapilan method'dan donen fiyat : " + indirimliFiyatiGetir(fiyat));
        System.out.println("3. Method call'dan sonra : "+fiyat);

        // main method'taki fiyati kalici olarak degistirmek istersek,
        // main method icerisinde atama yapmaliyiz.

        fiyat = indirimliFiyatiGetir(fiyat);
        System.out.println("Main method'ta atama yapildiktan sonra : "+fiyat);
    }

    public static void indirimYap10(double fiyat){  // double fiyat = degeri method'un cagirildigi yerden gelir
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat : "+fiyat);

    }

    public static void indirimYap25(double fiyat){
        fiyat = fiyat*0.75;
        System.out.println("%25 indirimli fiyat : "+fiyat);
    }

    public static double indirimliFiyatiGetir(double fiyat){
        fiyat = fiyat*0.9;
        return fiyat;
    }
}
