package day35_interfaces;

public class C03_ChildOfI04 implements I04_InterfaceIstisnalar{

    @Override
    public void toplama() {

    }

    public static void main(String[] args) {

        // implement edilmeyen methodlara ulasmak icin
        C03_ChildOfI04 obj = new C03_ChildOfI04();

        // Static'e ulasmak icin method uzerinden
        obj.ekIsler(); // Default keyword ile body'si olan method olusturulabilir

        // Default'a ulasmak icin interface adi uzerinden
        I04_InterfaceIstisnalar.aciklama(); // Bu methodu implement etmek mecburi degil
    }
}
