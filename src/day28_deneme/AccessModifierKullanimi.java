package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatas;

public class AccessModifierKullanimi {

    public static void main(String[] args) {

        C03_EncapsuleDatas obj = new C03_EncapsuleDatas();
        System.out.println(obj.toplamSatis); // read
        obj.toplamSatis = 100;  // write

    /*
        Baska bir class'taki variable veya method'a ulasmak istedigimizde
        - ulasmak istedigimiz class uyesinin static olup olmamasi
          erisim yontemini etkiler
          static ise  classIsmi.uyeIsmi  yazarken
          static degilse obje olusturup  objeIsmi.uyeIsmi

        - ulasmak istedigimiz uyenin access modifier'i ise
          o uyeye ulasip ulasamayacagimizi belirler

          ulasabilirsek o datayi okuyabilir veya dataya yeni deger atayabilirz
     */
    }
}
