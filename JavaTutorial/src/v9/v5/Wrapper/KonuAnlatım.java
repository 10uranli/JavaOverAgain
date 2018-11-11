package v9.v5.Wrapper;

public class KonuAnlatým {

	 /*Integer String vs... 
	  * Bunlarýn string int consructorlarý var.Integer i2 = new Integer("10"); gibi
	  * valueof() : String veya Primitivi wrapper a dönüþtürür.
	  * xxxValue() : wrapper --> primitive 
	  * parseXXX() :String -->primitive
	  * 
	  * double d = num.doubleValue();
		num = Integer.valueOf(5);
	  * */
	
	
	/*
	 * primitive/ilkel tipteki (int, float,long)  degiskenlerin , atama islemlerinde (assignment), ilgili Wrapper sinif tipine otomatik olarak donusturulmesi islemine autoboxing denir.
	 *Integer i3 = 10;  
	 * 
	 * Wrapper sinif tiplerindeki degiskenlerin , otomatik olarak  , ilgili primitive/ilkel tipe donusturulmesine auto-unboxing denilir.
	 * Integer i = new Integer(10);
	 * int autoboxing = i.intValue();
	 * 
	 * Integer i2 = 10;  // seklinde auto-boxing islemi gerceklestirilir
       int i3=i2;       //auto-unboxing islemi wrapper 35 bak
       
       
       primitive --> Wrapper autoboxing  : Integer a : 10; Double d : 10d;
       wrapper--> primitive autounboxing : int i = a; 
       
       boxing : Integer i = new Integer(10)  unboxing : i.intValue --> int  kýsaca boxing iþlemi dönüþtürme iþlemidir.
       
       Integer comp = 1234;
		Integer comp2 = 1234;
		
		System.out.println(comp == comp2); //-128 den 127 ye kadar esitlik varsa true degeri dondurecektir. false döndü
	== --> wrapperlarda eþit olsa bile farklý newlenenlerde hata verir
	.equals buna bakmaz
	
	== ile nesnelerin hafýzada ayný yeri tutup tutmamasý karþýlaþtýrýlýr.
.equals ile nesnelerin içindeki deðerlerin birbirine eþit olup olmamasý karþýlaþtýrýlýr


primitive de  == adrese bakýyor gibi yapmýyor eþit dönüyor 

Ama yapý itibariyle bakarsan, primitive(ilkel) tipler zaten sýnýf bazlý deðiþkenler deðil ve içinde barýndýrdýklarý bilgi bir adres bilgisi deðil. Bu yüzden direk olarak deðer karþýlaþtýrýlmasý yapýlýr.  

	 * */
}
