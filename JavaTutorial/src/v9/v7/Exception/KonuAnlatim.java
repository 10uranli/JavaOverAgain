package v9.v7.Exception;

public class KonuAnlatim {

	/*
	 * Exception ortaya ��kan istisnayi durum.
	 * Try dikkat et catch yakala sonra program�n normal i�leyi�ine devam ettirebilirsin.
	 * finaly her halukarda cal�s�r.Hatay� dogru yakalamazsan koda devam etmez
	 * hata ald�g�nda try i�ine devam etmez ama projeyi devam ettirir
	 * catch i�inde return olsa bile finaly cal�s�r!!System.exit(0) bu sadece finaly cal�st�rmaz.
	 * 
	 * Eger bir metot firlatilan bu exception�i desteklemiyorsa (yani yakalayamiyorsa) bu duruma ducked exception denilir.
	 * stack mant�g� ile cal�s�r: main metodu doStuff() metodunu , doStuff() da doMoreStuff() metodunu cagirmakta.
	 * 
	 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at v9.v7.Exception.Test2.doMoreStuff(Test2.java:15)
	at v9.v7.Exception.Test2.doStuff(Test2.java:11)
	at v9.v7.Exception.Test2.main(Test2.java:6)


 en i�tekinden ba�lar en d��a f�rlat�r.
 
 e�er metotlardan biri  catch ile yakalarsan proje cokmez
	 * */
}
