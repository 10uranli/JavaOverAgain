package v9.v7.Exception;

public class Test3 {

	public static void main(String[] args) {
		doStuff();
		System.out.println("Hata yakalandi, uygulama calismaya devam eder.");
		assert(4>5);
	}

	static void doStuff() {
		try{
		doMoreStuff();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

	static void doMoreStuff() {
		int x = 5 / 0; //
		// ArithmeticException hatasi firlatilacaktir.
	}
}
