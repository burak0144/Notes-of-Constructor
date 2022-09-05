package day27_constructor;

public class Ogretmen {
    String isim="Isim belirtilmedi";
    String soyIsim="Soyisim belirtilmedi";
    String dogumTarihi="Dogum Tarihi belirtilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan Brans belirtilmedi";
    public Ogretmen(){

    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
    }

    public Ogretmen(String isim, String soyIsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;


    }

    @Override
    public String toString() {
        return
                "\nisim:" + isim +
                "\nsoyIsim:" + soyIsim +
                "\ndogumTarihi:" + dogumTarihi +
                "\nbrans:" + brans +
                "\nyanBrans:" + yanBrans
                ;
    }
}
