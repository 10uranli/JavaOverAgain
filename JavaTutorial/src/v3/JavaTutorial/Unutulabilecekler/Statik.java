package v3.JavaTutorial.Unutulabilecekler;

public class Statik {
		static int var1 = 10;

		static  {
			System.out.println("Static girdi.");
			var1++;
		}

		public static void main(String[] args) {
			System.out.println("Ýlk deðer yazýlýr atanýr sonra artýrýlýr : " + var1++);
			method1();
		}

		public static void method1(){
			System.out.println(++var1);
		}
}
