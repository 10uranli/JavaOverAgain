package v4.JavaTutorial.Enum;

public class EnumClass {

	
	enum mevsim{
		Ilkbahar,Yaz,Sonbahar,Kýs;
	}
	
	enum Season{   
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);   
		  
		private int value;  
		private Season(int value){  
		this.value=value;  
		}  
		
	}
	public static void main(String[] args) {
		System.out.println(mevsim.Ilkbahar);
		System.out.println(mevsim.Ilkbahar.name());
		
		System.out.println(Season.FALL);
		System.out.println(Season.FALL.value);
	}
}
