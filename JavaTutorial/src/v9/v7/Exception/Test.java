package v9.v7.Exception;

public class Test {

	
		public static void main(String[] args) {

			System.out.println("#####test 1#####");
			try {
				System.out.println("try 1");
				String a = null;
				a.equals("");
				System.out.println("deneme");
			} catch (NullPointerException e) {
				System.out.println("catch 1");
				
			} finally {
				System.out.println("finally 1");
			}

			System.out.println("#####test 2#####");

			try {
				System.out.println("try 2");
			} catch (NullPointerException e) {
				System.out.println("catch 2"); // bu kisim calismayacak
			} finally {
				System.out.println("finally 2"); // finally catch calissa da
													// calismasa da calisacaktir.
			}

			System.out.println("#####test 3#####");

			try {
				System.out.println("try 3");
				System.out.println(10 / 0);
			} catch (NullPointerException e) {

			} finally {
				System.out.println("finally 3"); // 10/0 islemi ArihtmeticException
													// a neden olur, dolayisiyla
													// catchte yakalamaz.
			}

			System.out.println("Deneme");
		}
	
}
