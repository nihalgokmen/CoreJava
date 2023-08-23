package day31_inheritance;

public class EPersonel {

    String isim = "personel isim belirtilmemis";
    String unvan = "personel unvan belirtilmemis";
    boolean izindeMi;

    public void standartMaas(){
        System.out.println("personel asgari ucreti : "+ 8500);
    }

    public void ozelSigorta(){
        System.out.println("personelden katki payi alinarak ozel sigorta yapilir");
    }
}
