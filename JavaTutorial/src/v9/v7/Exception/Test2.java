package v9.v7.Exception;

public class Test2 {

		public static void main(String[] args) {
			doStuff();
			System.out.println("Uygulamamiz patladigi icin bu cikti ekrana basilamaz.");
		}

		static void doStuff() {
			doMoreStuff();
		}

		static void doMoreStuff() {
			int x = 5 / 0; //
			// ArithmeticException hatasi firlatilacaktir.
		}
}
