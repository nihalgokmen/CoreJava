package day30_inheritance;

import java.awt.*;

public class CToyotaCorolla extends BToyota{

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit = "Dizel, benzinli ve elektrikli olabilir";

    public void motor(){
        System.out.println("Corolla araclar Turkiye'de uretilen motor kullanir");
    }
    public void uretimYeri(){
        System.out.println("Corolla araclar Turkiye'de uretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik); // Bu class'tan alir ==> Lassa 205-55-15
        System.out.println(corolla.model); // Corolla
        System.out.println(corolla.yakit); // Dizel, benzinli ve elektrikli olabilir
        corolla.motor(); // Bu class'takini alir
        corolla.uretimYeri(); // Bu class'takini alir

        System.out.println(corolla.marka); // BToyota class'indan ==> Toyota
        System.out.println(corolla.aku); // BToyota class'indan ==> Inci Aku
        corolla.saglamlik(); // BToyota class'indan alir

        System.out.println(corolla.vites); // Araba class'indan alir



    }
}
