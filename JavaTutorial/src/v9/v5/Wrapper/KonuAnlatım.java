package v9.v5.Wrapper;

public class KonuAnlat�m {

	 /*Integer String vs... 
	  * Bunlar�n string int consructorlar� var.Integer i2 = new Integer("10"); gibi
	  * valueof() : String veya Primitivi wrapper a d�n��t�r�r.
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
       
       boxing : Integer i = new Integer(10)  unboxing : i.intValue --> int  k�saca boxing i�lemi d�n��t�rme i�lemidir.
       
       Integer comp = 1234;
		Integer comp2 = 1234;
		
		System.out.println(comp == comp2); //-128 den 127 ye kadar esitlik varsa true degeri dondurecektir. false d�nd�
	== --> wrapperlarda e�it olsa bile farkl� newlenenlerde hata verir
	.equals buna bakmaz
	
	== ile nesnelerin haf�zada ayn� yeri tutup tutmamas� kar��la�t�r�l�r.
.equals ile nesnelerin i�indeki de�erlerin birbirine e�it olup olmamas� kar��la�t�r�l�r


primitive de  == adrese bak�yor gibi yapm�yor e�it d�n�yor 

Ama yap� itibariyle bakarsan, primitive(ilkel) tipler zaten s�n�f bazl� de�i�kenler de�il ve i�inde bar�nd�rd�klar� bilgi bir adres bilgisi de�il. Bu y�zden direk olarak de�er kar��la�t�r�lmas� yap�l�r.  

	 * */
}
