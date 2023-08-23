package day28_deneme;

import day28_accessModifier_encapsulation.C01;
import day28_accessModifier_encapsulation.C03_EncapsuleDatas;

public class EncapsulationKullanimi {

    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatas.getIsim()); // Yildiz Pazarlama

        C03_EncapsuleDatas obj = new C03_EncapsuleDatas();
        obj.setSatisTutari(100);
        obj.setSatisTutari(200);
        obj.setSatisTutari(300);

        System.out.println(obj.toplamSatis); // 600

    }

    /*
        C03_EncapsuleDatas class'indaki
     */
}
