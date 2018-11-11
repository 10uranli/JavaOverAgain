package v9.v8.Generic;

import java.util.HashMap;
import java.util.Map;

public class KonuAnlatim {
	
	/*
	 * Rederans kontrolleri için == ayný objeye bakýyor mu ? 
	 * 
	 * Map-->HashMap : unsorted ve unordered, TreeMap : ordered ve sorteddýr., HashTable : null dger yok, LinkedHashMapi         genel-->key unuqui, value dublicated
	 * Set-->Hashset :  unsorted ve unordered yapiya sahiptir.,Treeset : TreeSet ordered ve sorted bir yapiya sahiptir,LinkedHashSet :HashSet in ordered versiyonudur. genel : dublicate elemana yer  yok!!
	 * List-->ArrayList: sorted deðil , LinkedlÝST : insert deletede daha verýmlý,Vector : sýralý(ordered) ekler ve dublicated eleman olabilir
	 * queue-->Priorty	
	 * utility-->Collections, Arrays
	 * 
	 * *(ordered)Sýralý eklenmesi veya eklenmemesi 
	 * *(Sorted)Belli kurala göre sýralý olmasý
	 * *
	 * 
	 * java.util.ArrayList sinifi java.util.List arabirimini uygulamaktadir. ArrayList’ler dinamik olarak buyuyebilirler ve eleman ekleme(insert) ve arama(search) islemlerinde array/dizilere gore cok daha verimlidir.
	 */
	
	public static void main(String[] args) {
		Map a = new HashMap<>();
		a.put(null,"s");
	}

}
