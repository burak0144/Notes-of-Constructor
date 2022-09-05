package day27_constructor;

public class Kamyon {
   String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil;
    int fiyat;

    public Kamyon(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public Kamyon() {

    }

     Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat ;

    }
}
