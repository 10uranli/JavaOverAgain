package v9.v8.Generic;

import java.util.HashMap;
import java.util.Map;

public class KonuAnlatim {
	
	/*
	 * Rederans kontrolleri i�in == ayn� objeye bak�yor mu ? 
	 * 
	 * Map-->HashMap : unsorted ve unordered, TreeMap : ordered ve sortedd�r., HashTable : null dger yok, LinkedHashMapi         genel-->key unuqui, value dublicated
	 * Set-->Hashset :  unsorted ve unordered yapiya sahiptir.,Treeset : TreeSet ordered ve sorted bir yapiya sahiptir,LinkedHashSet :HashSet in ordered versiyonudur. genel : dublicate elemana yer  yok!!
	 * List-->ArrayList: sorted de�il , Linkedl�ST : insert deletede daha ver�ml�,Vector : s�ral�(ordered) ekler ve dublicated eleman olabilir
	 * queue-->Priorty	
	 * utility-->Collections, Arrays
	 * 
	 * *(ordered)S�ral� eklenmesi veya eklenmemesi 
	 * *(Sorted)Belli kurala g�re s�ral� olmas�
	 * *
	 * 
	 * java.util.ArrayList sinifi java.util.List arabirimini uygulamaktadir. ArrayList�ler dinamik olarak buyuyebilirler ve eleman ekleme(insert) ve arama(search) islemlerinde array/dizilere gore cok daha verimlidir.
	 */
	
	public static void main(String[] args) {
		Map a = new HashMap<>();
		a.put(null,"s");
	}

}
