package v6.Inheritance;

public class Test {
	public static void main(String[] args) {
		Test test = new Test();
		System.out.println(test instanceof Object);
		
		Audi audi = new Audi();
		audi.runEngine();// miras aldý.
		audi.color();
		
		Car audi2 = new Audi(); // Audi is a Car  Bu genelde interface  implementasyonu ile yapýlýr.
		audi2.runEngine();
//		audi2.color();Eriþemez çünkü referasnsý olan Car classýnda bu yok.
		//yan bilgi : has a ise bur classta baska classýnýn private B b; þeklinde objesi olmasýdýr.
	}
}
