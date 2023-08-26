package day35_interfaces;

public class C02_ChildOfI01veI03 implements I01_Interface,I03_Interface{

    /*
        Interface'in en onemli artisi bir class'in
        birden fazla interface'i implement edebilmesidir.

        Bir class'i extends ile de baska class'a child yapabiliriz

        Ancak birden fazla interface'i implement ederken dikkat etmemiz gereken
        bir konu vardir
        eger implement etmek istedigimiz farkli inteface'lerde
        ayni isimde fakat farkli return type'i olan method'lar varsa
        iki method'u birden ayni anda implement edemeyecegimiz icin
        o iki interface'den ancak birini implement edebiliriz.
     */

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {

        C02_ChildOfI01veI03 obj = new C02_ChildOfI01veI03();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.sayi);

        System.out.println(I02_Interface.str);
    }


}
