package day41_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        ll1.add("K");
        ll1.add("T");

        // LinkedList 3 tane interface'i iplement etmistir
        // List, Queue, Deque interface'lerini
        // Dolaysiyla bu interface'lerden sonrq gelen ilk concrete class oldugundan
        // Bu 3 interface'deki tum abstract method'lari override etmistir.

        // LinkedList olusturulurken secilen data turune gore
        // Bu 3 interface'den birinin ozelliklerini alabilir
        // Veya data turu LinkedList secilirse, 3 interface'in ozelliklerini de toptan alir

        List<String> ll2 = new LinkedList<>();

        // Daha onceden rrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz.

        ll2.add("R"); // [R]

        ll2.add("Z"); // [R, Z]

        ll2.add(0,"A"); // [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z] ==> K ve T'yi butun olarak 2n index'e ekledi

        ll2.set(2, "M"); // [A, R, M, T, Z]

        System.out.println(ll2.get(0)); // A

        System.out.println(ll2.subList(2, 4)); // [M, T] ==> 2 dahil, 4 degil

        System.out.println(ll2.retainAll(ll1)); // true ==> ll1 disindakileri elemanlari siler

        System.out.println(ll2); // [T]



    }
}
