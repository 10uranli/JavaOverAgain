package v6.Inheritance;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test instanceof Object);
		
		Audi audi = new Audi();
		audi.runEngine();// miras ald�.
		audi.color();
		
		Car audi2 = new Audi(); // Audi is a Car  Bu genelde interface  implementasyonu ile yap�l�r.
		audi2.runEngine();
//		audi2.color();Eri�emez ��nk� referasns� olan Car class�nda bu yok.
		//yan bilgi : has a ise bur classta baska class�n�n private B b; �eklinde objesi olmas�d�r.
	}
}
