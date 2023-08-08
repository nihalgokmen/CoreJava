package day16_scope_arrays;

public class C01_Hastane {

    public static void main(String[] args) {

        ADoktor dok1 = new ADoktor();

        System.out.println(dok1.askerlikYaptiMi);  // false ==> deger atanmadigi icin
        dok1.isim = "Kemal";
        dok1.soyIsim = "Yilmaz";
        dok1.dogumYili = 1980;

        System.out.println(dok1.isim);  // Kemal


        ADoktor dok2 = new ADoktor();
        System.out.println(dok2.isim);  // null ==> deger atanmadigi icin
        dok2.soyIsim = "Celik";
        System.out.println(dok2.soyIsim);  // Celik

        System.out.println(dok1);  // non-primitive old icin referansini yazdirir

        System.out.println(dok1.fakulte);  // Tip
        System.out.println(dok2.fakulte);  // Tip

        dok1.isim= "Burcu";
        System.out.println(dok2.isim);  // null ==> isim ve digerleri instance old icin birbirinden bagimsizdir

        dok1.fakulte="Tip Fakultesi";
        System.out.println(dok2.fakulte);  // Tip Fakultesi ==> static old icin 30. satirdan itibaren tum fakulte degerlerini degistirir

        ADoktor dok3= new ADoktor();
        System.out.println(dok3.dogumYili); // 0
        System.out.println(dok3.fakulte);  // Tip Fakultesi

        System.out.println(ADoktor.fakulte);
        // Static variable'lar icin tavsiye edilen erisim yontemi
        // classIsmi.staticUyeIsmi seklinde yazimdir.
        // Bu kullanim bicimine STATIC YONTEM denir.

    }
}
