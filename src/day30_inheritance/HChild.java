package day30_inheritance;

import javafx.scene.Parent;

public class HChild extends GParent {

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor'i calisti");
    }


    public static void main(String[] args) {

        HChild objChild = new HChild();
        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandParent);

        /*
           Child class'tan olusturdugumuz bir obje
           parent ve grandparent class'larindaki
           tum ozelliklere sahip olur (privite-staticler haric)

           Bir obje olusturuldugunda ilk degerleri alabilmesi icin
           mutlaka bir cnstructor calismalidir.

           Constructor call bizim cok kullandigimiz bir ozellik degildir,
           ancak inheritance'i tam olarak anlayabilmek icin
           constructor call konusunu bilmemiz gerekir.

           Bu class'tan obje olusturmak icin
           HChild() constructor'ini kullandik
           ama objemiz parent ve grandparent'daki ozellikleri de sahiplendi
           peki bu nasil oldu?

           Her ne kadar objeyi child class'tan olustursak da
           bu objenin parent ve grandparent class'larindaki ozellikleri alabilmesi icin
           o class'larin constructor'lari da calismak ZORUNDADIR.

           Java bu mecburi calismayi saglayabilmek icin
            cok ozel bir sistem gelistirmistir;

           Bunun adi super() : SUPER CONSTRUCTOR CALL'dur.

         */

    }

}
