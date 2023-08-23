package day31_inheritance;

public class HHemsire extends FMuhasebe{

    String unvan = "Hemsire";

    public void standartMaas(){
        System.out.println("Hmesireler minimum 10bin tl maas alir");
    }

    public void ozelSigorta(){
        System.out.println("hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir");
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*200);
    }

    public static void main(String[] args) {
        HHemsire hemsire = new HHemsire();
        hemsire.method();
    }

    public void method() {

        HHemsire hemsire = new HHemsire();
        System.out.println(hemsire.unvan); // hemsire
        System.out.println(super.unvan); // personel unvan belirtilmemis
        System.out.println(this.sgkNo); // calisan skg no belirtilmedi
        this.standartMaas(); // 10bin

        this.ekMesai(3); // 600
        super.ekMesai(3); // 800

        this.ozelSigorta(); // aylik 300
        super.ozelSigorta(); // personelden katki payi alinarak ozel sigorta
    }
}
