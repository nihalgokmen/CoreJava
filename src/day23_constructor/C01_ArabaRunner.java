package day23_constructor;

public class C01_ArabaRunner {

    public static void main(String[] args) {

        Araba araba1= new Araba();

        System.out.println(araba1); // bunu boyle tek tek atayacagimiza

        Araba araba2= new Araba(10000, "BMW");
        System.out.println(araba2);
    }
}
