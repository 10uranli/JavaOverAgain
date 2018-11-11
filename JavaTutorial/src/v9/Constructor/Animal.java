package v9.Constructor;

public class Animal {

	private String type;
	private String sound;
	
	public Animal(String type,String sound) {
		
		this.type = type;
		this.sound = sound;
		System.out.println("Animal..");
		
	}
	public void sesVer(){
		System.out.println("Türüm : " + type + "Sesim : " + sound);
	}
}
