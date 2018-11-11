package v9.v7.Exception;

public class KonuAnlatim {

	/*
	 * Exception ortaya çýkan istisnayi durum.
	 * Try dikkat et catch yakala sonra programýn normal iþleyiþine devam ettirebilirsin.
	 * finaly her halukarda calýsýr.Hatayý dogru yakalamazsan koda devam etmez
	 * hata aldýgýnda try içine devam etmez ama projeyi devam ettirir
	 * catch içinde return olsa bile finaly calýsýr!!System.exit(0) bu sadece finaly calýstýrmaz.
	 * 
	 * Eger bir metot firlatilan bu exception’i desteklemiyorsa (yani yakalayamiyorsa) bu duruma ducked exception denilir.
	 * stack mantýgý ile calýsýr: main metodu doStuff() metodunu , doStuff() da doMoreStuff() metodunu cagirmakta.
	 * 
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at v9.v7.Exception.Test2.doMoreStuff(Test2.java:15)
	at v9.v7.Exception.Test2.doStuff(Test2.java:11)
	at v9.v7.Exception.Test2.main(Test2.java:6)


 en içtekinden baþlar en dýþa fýrlatýr.
 
 eðer metotlardan biri  catch ile yakalarsan proje cokmez
	 * */
}
