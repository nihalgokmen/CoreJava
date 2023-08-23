package day22_constructor;

public class C05_DoktorRunner {

    public static void main(String[] args) {

        C04_Doktor doktor1 = new C04_Doktor();

        doktor1.isim = "Kemal";
        doktor1.yas = 40;

        System.out.println(doktor1.soyisim); // Soyisim atanmamis
        System.out.println(doktor1.yas); // 40

        C04_Doktor doktor2 = new C04_Doktor();

        C04_Doktor doktor3;

         // System.out.println(doktor3.yas);
        // constructor calismadan bir obje olusturulup deger atanmasi mumkun degildir

        System.out.println("variable'a atanmayan obje " + new C04_Doktor().yas);
        // bir variable'a atanmadigi icin sadece bu satir icin bilgi getirir bir dahah kullanilmaz

    }
}
