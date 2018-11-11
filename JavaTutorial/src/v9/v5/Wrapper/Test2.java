package v9.v5.Wrapper;

public class Test2 {

	public static void main(String[] args) {

		Integer i =new Integer(10);
		Integer i2 =new Integer(10);

		System.out.println("Integer Test");
		System.out.println(i==i2);   //false 
		System.out.println(i.equals(i2)); //true
		System.out.println(i==10);   //true
		System.out.println(i.equals(10));  //true

		Long lo1 = new Long(10);
		Long lo2 = new Long(10);

		System.out.println("Long Test");
		System.out.println(lo1==lo2);   //false 
		System.out.println(lo1.equals(lo2)); //true
		System.out.println(lo1==10);   //true
		System.out.println(lo1.equals(10));  //false

		System.out.println("Long - Integer Test");
		System.out.println(lo1.equals(i));  //false
		//System.out.println(lo1==i);  //compiler error 
		
		System.out.println("Benim");
		
		int in = 4;
		int in2 = 4;
		
		System.out.println(in == in2);
		// kýsaca == adrese bakar wrapperlarda equals kullan. primitive de == kullan. cunku bi adres mevzusu yok.
				

	}
}
