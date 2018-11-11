package v9.v7.Exception;

public class KonuAnlatim2 {
/**
 * Throwable : error: beklenmedik hata / exception: checked unchecked
 * checked : throws kullan metot hata fýrlatsýn dýye 
 *  RuntimeException tipinde bir expception unchecked exceptiondir
 *  unchecked : i java.lang.Error ve alt sinifi tipinde tum errorlar unchecked exception’tir. Dolayisiyla handle – declare kuralina uymak zorunda degiliz
 *  new StackOverflowError(); memery vs
 *  
 *  
 *  catchle yakalasýgýn hatayý throw e ile fýrlatabilirsin!!
 *  
 *  kýsca errorlar -->unchecked exceptionlarda runtýme olanlar unchecked diðerleri checked.
 *  
 *  Onceki yazilardan hatirladigimiz gibi Java Exception mekanizmasinda 2 tur exception vardi. Bunlar checked exception ve unchecked exception’di. Hatirlayacagimiz gibi Java’da error ve exception teknik acidan farkli kavramlardir. java.lang.Error sinifi tipinde tum exceptionlar/hatalar , error tipindedir. java.lang.Exception sinifi tipinde tum exception/hatalar , exception tipindedir. Java’da java.lang.RuntimeException sinifi tipinde ve alt sinifi tipinde tum exception’lar unchecked exception’dir. Bununla birlikte tum errorlar yani java.lang.Error tipinde veya alt sinif tipinde tum errorlar da unchecked exception’dir.
 */
	
	public static void main(String[] args) {
		System.err.println("Deneme");
	}
}
