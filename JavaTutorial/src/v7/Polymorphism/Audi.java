package v7.Polymorphism;

public class Audi extends Car implements ITry {

	@Override
	public void Try() {
			System.out.println("Mecburi override eder.");
	}

}
