package v9.v3.Variable;

public class Test {
	
	public static void main(String[] args) {
		Integer a = 5;
		Integer b = a;
		a = 7;
		
		System.out.println(a + "" + b);
		
		Numbers number = new Numbers(10,20);
		System.out.println("Before Method Call");
		System.out.println("numb1:" + number.num1);
		System.out.println("numb2:" + number.num2);

		number.addValue(number);

		System.out.println("After Method Call");
		System.out.println("numb1:" + number.num1);
		System.out.println("numb2:" + number.num2);
	}

}

class Numbers{
	
	int num1;
	int num2;

	public Numbers(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	protected void addValue(Numbers n) {
		System.out.println("main method");
		n.num1=n.num1+10;
		n.num2=n.num2+20;

		System.out.println("numb1:" + n.num1);
		System.out.println("numb2:" + n.num2);
	}
}
