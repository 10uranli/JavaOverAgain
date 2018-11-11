package v9.v4.Block;

public class Test {

	
	static{
		System.out.println("Test class static");
	}
	
	static{
		System.out.println("Test class static2");
	}
	
	{
		System.out.println("Test instance..");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method started..");
		Audi audi = new Audi();
		Audi audi2 = new Audi();
		System.out.println("Main method ended..");
	}
}
