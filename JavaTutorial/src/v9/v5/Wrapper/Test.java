package v9.v5.Wrapper;

public class Test {

	public static void main(String[] args) {
		Boolean b = new Boolean("tRuE");
		Boolean b2 = new Boolean("onur");
		Boolean b3 = new Boolean(true);
		Boolean b4 = new Boolean(false);

		System.out.println("Boolean Test");
		System.out.println(b + " " + b2 + " " + b3 + " " + b4);
	
		Integer num = new Integer("10");
		
		double d = num.doubleValue();
		num = Integer.valueOf(5);
		
		System.out.println(num + " " + d );
		
		Integer comp = 1234;
		Integer comp2 = 1234;
		
		System.out.println(comp == comp2); //-128 den 127 ye kadar esitlik varsa true degeri dondurecektir. false döndü
	}
}
