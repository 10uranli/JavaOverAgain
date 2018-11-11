package v9.v4.Block;

public class Car {

	static{
		System.out.println("Super class static");
	}
	
	static{
		System.out.println("Super class static2");
	}
	
	{
		System.out.println("Super instance..");
	}
	
	public Car() {
		System.out.println("Super class const.");
	}
}
