package v1x0.JavaTutorial.AccessModifier2;

import v1.JavaTutorial.AccessModifier.PublicClass;

public class Test {

	public static void main(String[] args) {
		PublicClass pc = new PublicClass();
//		DefaultClass df = new DefaultClass();Farkl� pakette eri�ilemiyor
		
		pc.publicMet();// di�er metotlara eri�emiyorum.
	
	}
}
