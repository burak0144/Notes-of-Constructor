package day27_constructor;

public class KamyonRunner {
    public static void main(String[] args) {
        Kamyon kamyon1=new Kamyon();
        //toString metodunu kullanabilmek icin diger classta toStringi atamaliyiz
        //boylelikle direkt yazdirabiliriz
        System.out.println("kamyon1 bilgileri"+kamyon1);
        System.out.println("");
        Kamyon kamyon2=new Kamyon("Mercedes","1040",2000);
        System.out.println("kamyon2 bilgileri"+kamyon2);  //toString metodunda 4 degeri direkt yansitir
        //yazmadigin parametrenin instance degerini alir
        System.out.println("");
       Kamyon kamyon3=new Kamyon("Mercedes","1040",209000,2000);
        System.out.println("kamyon3 bilgileri"+kamyon3);

    }

}
