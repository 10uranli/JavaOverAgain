package v7.Polymorphism;

public class Test {
	public static void main(String[] args) {
		Audi car = new Audi();
		ITry carTry = new Audi();
		Car carAudi = new Audi();

		car.runEngine();//miras aldýðýný gördü.
		car.Try();
		
//		carTry.runEngine();referansta yok göremez.
		carTry.Try();
		
		carAudi.runEngine();
//		carAudi.Try(); referansta yok
	}
}
