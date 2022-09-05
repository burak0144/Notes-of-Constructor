package day27_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen1"+ogretmen1);

        System.out.println("");

        Ogretmen ogretmen2=new Ogretmen("Berk","Karanfil","02/02/1991","Kimya","QA Tester");
        System.out.println("Ogretmen2"+ogretmen2);

        Ogretmen ogretmen3=new Ogretmen("Berk","Karanfil","02.02.1991");
        System.out.println("Ogretmen3"+ogretmen3);
    }
}
