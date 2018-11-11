package v3.JavaTutorial.Unutulabilecekler;

public class Genel {
//	final anahtar kelimesi metotlar icin kullanildiginda , alt sinif tarafindan bu metodun ezilmesini (override) engeller.
//	tek bir adet abstract metota sahip olsa bile mutlaka bu sinif abstract olarak tanimlanmalidir.
//	abstract sinifi extends eden bir sinif , abstract metotlari ezmek (override) zorundadir. Eger extends eden sinif abstract ise ezmek zorunda degildir.
//	synchronized olarak tanimlanan bir metoda ayni anda sadece bir tek adet thread erisebilir.
	
	
//	Javada 2 tip degisken vardir.
//	primitive
//	reference variable (referans degiskeni)
	
//	metot tanimlamasinda kullanilan degiskenler parametredir, methodu cagirirken gonderilen degiskenler ise argumandir .
	
	
//	primitive degiskenler su 8 tipden biri olabilir ;
//	char, boolean, byte , short , int , long , double , float
//	primitive bir degisken tanimlandiginda turu degistirilemez yani int a ,bir alt satirda short a olarak degismez
/*
 * Local degiskenin adiyla instance degiskenin adi ayni olabilir. Buna Shadowing denir.
 * 
 * 
 * Butun static degisken ve metotlar yeni bir obje olusturmadan once hazir ve nazirdir.
 * Bir static uyenin bir kopyasi vardir. Yani ortak maldir 
 * 
 * 
 * arguman (argument) ; Bir metodu cagirirken parantezler arasinda yazdigimiz ifadelerdir.
 * parametre(parameter) ; Bir metodu tanimlarken , nasil cagirilacagini belirttigimiz tanimladigimiz ifadeler ise parametredir.
 * 
 * void method1(int... x) {
		System.out.println(x.length);
	}
 * */
	
}
