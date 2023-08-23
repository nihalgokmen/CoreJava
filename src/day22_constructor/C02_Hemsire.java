package day22_constructor;

public class C02_Hemsire {

    /*
        Ornegin bir hastane programinda,
        hastanede calisacak hemsirelerin hangi bilgilerini tutmak istiyorsak,
        hangi method'lari hemsireler icin kullanmak icin kullanmak
        istiyorsak  bir hemsire class'i olusturup
        tum bu ozellikleri (variable ve methodleri) o class'ta olustururuz.

        Programda ne zaman bir hemsireye ihtiyac olsa
        hemsire class'indan obje olustururuz
        boyle otomatik olarak tum ozelliklere sahip olur.

        Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
        Java class'tan obje olusturulabilmesi icin,
        class'a default bir constructor koyar.

        Default constructor GORUNMEZ,
        parametresi yoktur, constructor body'si bostur

        C02 Hemsire (){
        }                 Bir constructor olustursaydik boyle gorunurdu
                          olusturmadigimiz icin Java gorunmez bir cons. olusturur

        Biz de istedigimiz parametrelere sahip,
        istedigimiz kadar constructor olusturabiliriz

        COK ONEMLI : Eger biz bir constructor olusturursak
                     yani class'ta gozle gorunen bir cons. varsa
                     Java default cons.'u siler !!!!!
                     Bizim olusturdugumuz hic bir constructor'a default constructor DENMEZ!
     */



    String isim="Isim atanmamis";
    String soyisim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;

    public int  mesaiUcretiHesapla(int mesaiSaati) {

        return mesaiSaati * ekMesaiUcreti;


    }
}
