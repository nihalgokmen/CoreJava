package day42_collections_queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01_LinkedList_QueueDataTuru {

    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();

        q1.add("H");
        q1.add("Y"); // [H, Y]

        q1.offer("K"); // [H, Y, K]
        // kapasite sinirlamasi yapmadiginiz surece add() ile ayni isi yapar

        System.out.println(q1.remove()); // H
        // Queue eklemeyi sona yapip kullanmayi bastan yaptigi icin,
        // parametre giredgimizde bastaki elemani remove eder ve bize döndürür.

        System.out.println(q1); // [Y, K]
        q1.remove();
        q1.remove(); // queue bos kaldi []

        // q1.remove(); // queue bos oldugundan NoSuchElementException verir.

        System.out.println(q1.poll()); // null
        // q1.poll() remove ile ayni islemi yapar yani bastaki elemani sile ve bize döndürür
        // aralarindaki fark : bos queue'da calsitirildiklerinda
        // remove exception firlatirken, poll exception firlatmaz.

        q1.add("H");
        q1.add("Y"); // [H, Y]

        System.out.println("Peek : "+q1.peek()); // H
        // silmeden sadece queue'nun basindaki elemani bize getirir
        // bossa null getirir

        System.out.println("Element : "+q1.element()); // H
        //peek ile aynidir fakat bossa element exception firlatir

        System.out.println(q1); // []

    }
}
