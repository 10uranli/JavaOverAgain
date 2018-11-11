package v9.v4.Block;

public class Audi extends Car {

	static{
		System.out.println("Audi class static");
	}
	
	static{
		System.out.println("Audi class static2");
	}
	
	{
		System.out.println("Audi instance..");
	}
	
	public Audi() {
		System.out.println("Audi const.");
	}
}
