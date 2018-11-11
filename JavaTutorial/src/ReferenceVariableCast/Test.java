package ReferenceVariableCast;


	class Animal {
		
		void eat() {
			System.out.println("Animal Eat");
		}
	}

	class Dog extends Animal {

		@Override
		void eat() {
			super.eat();
			System.out.println("Dog special eat");
		}
		
		void bark(){
			System.out.println("Bark");
		}
		
	}

	public class Test {
		public static void main(String[] args) {
			
			Animal[] animal = { new Animal(), new Dog(), new Animal() };

			for(Animal a: animal){
				a.eat();
				if(a instanceof Dog) {
					//a.bark();
					((Dog) a).bark();
				}
			}
			
			//upcasting
			System.out.println("Upcast");
			Dog dogUp = new Dog();
			
			Animal animalUp = dogUp;
			animalUp.eat();
			
			Animal a2 = (Animal) dogUp;
			a2.eat();
			
		}
//		Animal animal = new Animal();
//		Dog d = (Dog) animal; runtime da hata alýr.
	
		
	}
