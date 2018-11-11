package v9.v7.String;

public class KonuAnlatim {

	/*
	 * String immutabledir.
	 * a = "5" a = a.concat("4"); adres deðiþir yani "54" yeni objedir.Immutable budur deðiþmez. "5" objesi hala heapte yaþar
	 *  a = yapmasan a.concat yapsak sadece yeni obje olusur ama a referans deðiþkeni yine "5" i gösterir.
	 * ,
	 * String str = "levent";
String str2 ="levent";
String str3 = "erguder";

burada 2 obje oluusur
compare lexicographically olaraka bakar

String objeleri uzerinden cok fazla degisiklik yapilacagi zaman String sinifini kullanmak yerine StringBuffer veya StringBuilder siniflarini kullanmak verimlilik saglayacaktir. StringBuffer ve StringBuilder objeleri immutable degildir dolayisiyla bu objeler uzerinde degisiklik yapilabilir.
StrinBuffer ve StringBuilder ayni metotlara sahiptir . Bu siniflar arasindaki fark sudur ; StringBuilder thread-safe degildir yani StringBuilder sinifinin metotlari syncronized degildir. Dolayisiyla StringBuilder , StringBuffer sinifa gore daha hizli calisacaktir.
	 *
	 * 56-66 geçildi.
	 * */
	
	public static void main(String[] args) {
		System.out.println("a".compareTo("d"));
		System.out.println("b".compareTo("d"));
		System.out.println("e".compareTo("a"));
		System.out.println("ABa".compareTo("ABc"));
		System.out.println("a".compareToIgnoreCase("A"));
	
		System.out.println("l".compareTo("e"));
		System.out.println("levent".compareTo("leventa"));

		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb = " + sb); //cikti sb = abcdef olacaktir
	}
}
