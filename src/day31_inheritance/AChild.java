package day31_inheritance;

import day30_inheritance.GParent;

public class AChild extends GParent {

    String childStr;
    AChild(){
        System.out.println("Child class constructor calisti");
    }

    public static void main(String[] args) {

        // System.out.println(childStr); static degil
        // System.out.println(sayiParent);  static degil
        // System.out.println(sayiGrandParent); static degil

        // Bunlari kullanmak icin obje olusturmaliyiz

        AChild objeChild = new AChild();

        /*
            Java'da inheritance kullanirken child class'taki obje
            parent class'lardaki tum ozelliklere sahip olur bunu saglayan
            Java mekanizmasi super() constructor call'dur.

            extends keyword kullanan bir class'ta
            olusturulan her bir constructor'in ilk satirinda
            biz gormesek bile super() constructor call vardir.

            Yani super() ==> once parent class'a gidip oradaki parametresiz constructor'i calistir demektir
            child class'taki cons calistiginda extends keyword kullanmayan
            parent buluncaya kadar parent class'lara gider
         */

    }
}
