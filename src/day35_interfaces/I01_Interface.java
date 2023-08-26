package day35_interfaces;

public interface I01_Interface {

   static int sayi = 10;
   final String str = "Java Candir";

   public static final boolean b = true;

   /*
    Interface'de tum variable'lar (Yazilmasa bile)
    public static ve final'dir.

    Final old icin sonradan degistirme imkani yoktur olustururken deger atanmallidir.

    Bu ozellikler standart olarak tum variable'lara tanimlandigindan
    bu tanimlamalari yapmak gerekli degildir. (IntelliJ Gri Yapti)
    */

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();

    /*
        Tum method'lar da standart olarak public ve abstract'tir. (Yazilmasa Bile!)
     */

}
