package v7.Polymorphism;

public class Test {
	public static void main(String[] args) {
		Audi car = new Audi();
		ITry carTry = new Audi();
		Car carAudi = new Audi();

		car.runEngine();//miras ald���n� g�rd�.
		car.Try();
		
//		carTry.runEngine();referansta yok g�remez.
		carTry.Try();
		
		carAudi.runEngine();
//		carAudi.Try(); referansta yok
	}
}
