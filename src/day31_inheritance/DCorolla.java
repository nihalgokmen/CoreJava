package day31_inheritance;

public class DCorolla extends CToyota{

    String str3 = "Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor'i calisti");
    }

    DCorolla(int sayi){
        this();
        System.out.println("Int parametreli Corolla constructor'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);

    }
}

    /*
        Biz gorunur bir constructor olusturdugumuzda
        Java'nin default constructor'i silmesine benzer olarak

        extends keyword kullanilmis bir class'taki
        herhangi bir constructor'in ilk satirinda
        gozle gorunur bir constructor call yazilmissa
        Java default olarak koydugu super() i siler

        bir constructor'un icinde sadece bir tane
        constructor call olabilir o da ilk satirda olmak zorundadir

        eger this(parametreler) veya super() ile
        constructor call yaptigimizda
        yazdigimiz argument ile uyumlu parametreye sahip
        bir constructor yoksa Java CTE verir.
    */