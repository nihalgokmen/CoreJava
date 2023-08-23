package day31_inheritance;

import java.security.SecureRandom;

public class FMuhasebe extends EPersonel{

    String sgkNo = "calisan skg no belirtilmedi";
    boolean raporluMu;

    public void ekMesai(int ekMesaiSaati){
        System.out.println(ekMesaiSaati*200);
    }

    public void nobetUcreti(int nobetSayisi){
        System.out.println(nobetSayisi*500);
    }
}
