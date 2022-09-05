package day27_constructor;

import day26_constructor.Car;

public class ArabaRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        System.out.println(car1.marka); //diger paketteki variable'i cagirabilmek icin
        //variablein basina public yazilmalidir  public String marka=...
        Araba araba1=new Araba();
        System.out.println(araba1.fiyat); //fiyat degeri atanmadigindan ilk degerine gider
        //ordada atama yoksa default degerini alir 0

        Araba araba2=new Araba();
        araba2.model="Bmw";
        araba2.marka="C320";
        araba2.fiyat=150000;
        System.out.println("araba2 bilgileri\nMarka:"+araba2.marka+"\nModel:"+ araba2.model
        +"\nfiyat:"+araba2.fiyat); //yil yazmadigimdan yazdirmadi
        System.out.println("");
        Araba araba3=new Araba("Mercedes","C200",200000,2020);
        System.out.println("araba3 bilgileri\nMarka:"+araba3.marka+"\nModel:"+ araba3.model
                +"\nfiyat:"+araba3.fiyat+"\nyil:"+araba3.yil);
        //parametreli obje olusturdugumda diger classtada parametreli constructor
        //olmalidir(parametreye uygun)
        //parametreli constructor olusunca default constructor yok olur
        //ilk parametresiz obje calismaz bu yuzden diger classta birde parametresiz constructor olustururuz

    }
}
