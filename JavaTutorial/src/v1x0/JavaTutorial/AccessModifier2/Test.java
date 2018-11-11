package v1x0.JavaTutorial.AccessModifier2;

import v1.JavaTutorial.AccessModifier.PublicClass;

public class Test {

	public static void main(String[] args) {
		PublicClass pc = new PublicClass();
//		DefaultClass df = new DefaultClass();Farklý pakette eriþilemiyor
		
		pc.publicMet();// diðer metotlara eriþemiyorum.
	
	}
}
