package v9.v1.Static;

public class Test {

	private static int count;
	
	public Test() {
			count ++;
	}
	
	public static void main(String[] args) {
		new Test();
		new Test();
		new Test();
		float a = 5.1f;
		System.out.println(a);
		System.out.println(count);
	}
}
