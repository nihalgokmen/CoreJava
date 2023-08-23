package day30_inheritance;

public class BToyota extends Araba{

    String marka = "Toyota";
    String aku = "Inci Aku";
    String lastik = "Bridgestone";

    public void motor(){
        System.out.println("Toyota'lar cevreci toyota motorlari kullanir");
    }

    public void saglamlik(){
        System.out.println("Toyota araclar extra guvenlik onlemleri barindirir");
    }


}
