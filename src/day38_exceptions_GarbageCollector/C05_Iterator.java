package day38_exceptions_GarbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(4);
        sayilar.add(72);

        // cift olan sayilari silin

        Iterator it1 = sayilar.iterator();

    }
}
