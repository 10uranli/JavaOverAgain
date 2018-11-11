package v9.Constructor;

public class Dog extends Animal{

	public Dog(String type, String sound) {
		super(type, sound);
		System.out.println("Dog..");
	}
	
	public static void main(String[] args) {
		Dog dog = new Dog("Köpek", "Hav hav..");
	}

}
