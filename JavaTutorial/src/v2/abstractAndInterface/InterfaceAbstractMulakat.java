package v2.abstractAndInterface;

public class InterfaceAbstractMulakat {
/*
 * �nterfacede new yok ama poliformys katk� sa�lar.Pdf ile yap�lan bir rapor yar�n word olsun den�nce kodda az de�i�iklik
 * olsun diye interface ile raporu haz�rlayabilirsin.Deneme.Package3 de cok g�zel ornek var.
 * 
 * ortak bi class d���n ama spasifik benzin de�eri olmal� bunu abstract yaparsan extend edenler spasifik olarak o metodu al�r
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


//G�rd���n�z gibi Abstract s�n�flar daha �ok nesneler aras�ndaki ortak �zelliklerin veya metodlar�n bir �st s�n�fta toplanarak kod tekrar�n� �nlemek ve kodu di�er s�n�flardan soyutlayarak de�i�imin etkisini en alt d�zeye indirmektir.
//
//Akl�n�zda bulunsun herhangi bir s�n�f� Abstract bir s�n�ftan t�retmek istedi�inizde genel olarak dikkat etmeniz gereken durum aralar�nda IS-A �zelli�i olmas�d�r.Yani Mercedes bir Arabad�r, Ford bir Arabad�r diyebiliriz.

//link : http://www.cihataltuntas.com/interface-mi-abstract-mi/


//Interfaceler �oklu kal�t�m� sa�lamaya yard�mc� abstract classlar ise �oklu kal�t�m� desteklemez.
//Interfacelerde metodlar�n i�erisini dolduramay�z ama abstract classlarda doldurabiliriz B�ylece b�t�n alt s�n�flar�n belli bir �zelli�e sahip olmas�n� sa�layabiliriz.
//Interface ile yapabildi�imiz her�eyi hatta daha fazlas�n� abstract classlar ile de yapabiliriz.
//E�er t�retece�imiz classlarda belli ba�l� varsay�lan �zellikleri tekrar tekrar kopyala-yap��t�r yapmak istemiyorsak o zaman abstract class kullanmam�z gerekir. ��nk� abstract classlarla bir metodu t�m alt classlarda varsay�lan metod �eklinde tan�mlayabiliriz ve alt classlarda bunlar� tekrar yazmam�za gerek kalmaz kal�t�mla aktar�lm�� olur.
//Kal�t�m sa�lamak istiyorsak abstract classlar kullanmam�z gerekir.
//Abstract classlar� kullanmak h�z a��s�ndan avantaj sa�lar.
//Interface de yeni bir metod yazd���m�z zaman bu interfaceden implement etti�imiz t�m classlarda bu metodun i�ini tek tek doldurmak gerekiyor ancak abstract classlarda durum farkl�d�r burada bir metod tan�mlay�p i�ini doldurdu�umuzda abstract s�n�f�m�zdan t�retilmi� b�t�n s�n�flar bu �zelli�i kazanm�� olur.