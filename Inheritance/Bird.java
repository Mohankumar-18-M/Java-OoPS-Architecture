package Inheritance;

class Animal{

	void Eat() {
		System.out.println("Animal can eat.");
	}
	void Sleep() {
		System.out.println("Animal can sleep");
	}
}
public class Bird extends Animal {
	
	void Eat() {
		System.out.println("Bird can eat.");
	}
	void Sleep() {
		System.out.println("Bird can sleep.");
	}
	void Fly() {
		System.out.println("Bird can fly.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird bird = new Bird();
		Animal animal = new Animal();
		Animal bird_animal = new Bird();
		animal.Eat();
		animal.Sleep();
		bird.Eat();
		bird.Sleep();
		bird.Fly();
		bird_animal.Eat();
		bird_animal.Sleep();
//		bird_animal.Fly();   Error its not a overriden property
	}

}
