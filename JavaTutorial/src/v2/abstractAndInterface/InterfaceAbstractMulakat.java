package v2.abstractAndInterface;

public class InterfaceAbstractMulakat {
/*
 * Ýnterfacede new yok ama poliformys katký saðlar.Pdf ile yapýlan bir rapor yarýn word olsun denýnce kodda az deðiþiklik
 * olsun diye interface ile raporu hazýrlayabilirsin.Deneme.Package3 de cok güzel ornek var.
 * 
 * ortak bi class düþün ama spasifik benzin deðeri olmalý bunu abstract yaparsan extend edenler spasifik olarak o metodu alýr
 * */
}

//abstract class Araba{
//    private int agirlik;
//    private String renk;
//    private String model;
// 
//    public int getAgirlik() {
//        return agirlik;
//    }
//    public void setAgirlik(int agirlik) {
//        this.agirlik = agirlik;
//    }
//    public String getRenk() {
//        return renk;
//    }
//    public void setRenk(String renk) {
//        this.renk = renk;
//    }
//    public String getModel() {
//        return model;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
// 
//    public abstract int saateYaktigiBenzinLitresi();
//}


//class Mercedes extends Araba{
//    private int cantKalinligi;
// 
//    public int getCantKalinligi() {
//        return cantKalinligi;
//    }
//    public void setCantKalinligi(int cantKalinligi) {
//        this.cantKalinligi = cantKalinligi;
//    }
// 
//    public int saateYaktigiBenzinLitresi() {
//        return getAgirlik()*2;
//    }
//}

//class AnaProgram{
//    public static void main(String[] args) {
//        Araba ford =new Ford();
//        ford.setAgirlik(1000);
//        ford.setModel("Fiesta");
//        ford.setRenk("Gri");
//        Araba mercedes=new Mercedes();
//        mercedes.setAgirlik(2000);
//        mercedes.setModel("E200");
//        mercedes.setRenk("Siyah");
// 
//        Araba arabalar[]=new Araba[]{mercedes,ford};
//        KullaniciEkrani ekran =new KullaniciEkrani();
//        ekran.goster(arabalar);
//    }
//}


//Gördüðünüz gibi Abstract sýnýflar daha çok nesneler arasýndaki ortak özelliklerin veya metodlarýn bir üst sýnýfta toplanarak kod tekrarýný önlemek ve kodu diðer sýnýflardan soyutlayarak deðiþimin etkisini en alt düzeye indirmektir.
//
//Aklýnýzda bulunsun herhangi bir sýnýfý Abstract bir sýnýftan türetmek istediðinizde genel olarak dikkat etmeniz gereken durum aralarýnda IS-A özelliði olmasýdýr.Yani Mercedes bir Arabadýr, Ford bir Arabadýr diyebiliriz.

//link : http://www.cihataltuntas.com/interface-mi-abstract-mi/


//Interfaceler çoklu kalýtýmý saðlamaya yardýmcý abstract classlar ise çoklu kalýtýmý desteklemez.
//Interfacelerde metodlarýn içerisini dolduramayýz ama abstract classlarda doldurabiliriz Böylece bütün alt sýnýflarýn belli bir özelliðe sahip olmasýný saðlayabiliriz.
//Interface ile yapabildiðimiz herþeyi hatta daha fazlasýný abstract classlar ile de yapabiliriz.
//Eðer türeteceðimiz classlarda belli baþlý varsayýlan özellikleri tekrar tekrar kopyala-yapýþtýr yapmak istemiyorsak o zaman abstract class kullanmamýz gerekir. Çünkü abstract classlarla bir metodu tüm alt classlarda varsayýlan metod þeklinde tanýmlayabiliriz ve alt classlarda bunlarý tekrar yazmamýza gerek kalmaz kalýtýmla aktarýlmýþ olur.
//Kalýtým saðlamak istiyorsak abstract classlar kullanmamýz gerekir.
//Abstract classlarý kullanmak hýz açýsýndan avantaj saðlar.
//Interface de yeni bir metod yazdýðýmýz zaman bu interfaceden implement ettiðimiz tüm classlarda bu metodun içini tek tek doldurmak gerekiyor ancak abstract classlarda durum farklýdýr burada bir metod tanýmlayýp içini doldurduðumuzda abstract sýnýfýmýzdan türetilmiþ bütün sýnýflar bu özelliði kazanmýþ olur.