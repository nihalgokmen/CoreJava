package day30_inheritance;

public class EChild extends DParentAccessModifier{

    static int sayiChildStatic;

    public static void main(String[] args) {

        // inheritance'da private class uyeleri inherit edilemez
        //

        EChild eChild = new EChild();

        System.out.println(eChild.sayiPublic);
        System.out.println(eChild.sayiProtected);
        System.out.println(eChild.sayiDefault);

        // icinde buludugumuz class'taki static variable'lar
        // obje uzerinden otomatik glemez ama manuel
        // yazdigimizda Java kabullenir
        System.out.println(eChild.sayiChildStatic);

        // ancak parent class'taki static variable'lar
        // obje uzerinden KULLANILAMAZ
        // System.out.println(eChild.sayiStaticPrivite);

        System.out.println(DParentAccessModifier.sayiStaticDefault);
        // bu kullanim icin inheritance'a ihtiyac yok
        // herhangi bir class'taki static variable'i
        // classIsmi.staticVariableIsmi seklinde kullanabilirz
    }
}
