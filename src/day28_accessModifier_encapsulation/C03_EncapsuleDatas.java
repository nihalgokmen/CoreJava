package day28_accessModifier_encapsulation;

public class C03_EncapsuleDatas {

    static private String isim = "Yildiz Pazarlama";

    private int satisTutari;
    public int toplamSatis;


    public static String getIsim() {
        return isim;
    }

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatis += satisTutari;
    }
}
