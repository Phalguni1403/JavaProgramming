abstract class Animal { // abstract class
	public abstract void display(); // abstarct method

	/*
	 * String animal = "Woof"; // variable declaration
	 */ String animal = "Roar"; // variable declaration
}

class Lion extends Animal {
	public void display() {
		System.out.println(animal);
	}
}

/*
 * class Dog extends Animal { // inheritance //Dog is sub class inherits Animal
 * Class public void display() { // normal method System.out.println(animal); }
 * }
 */

public class AbstractClass {

	public static void main(String[] args) { // main method

		/*
		 * Animal object = new Dog(); // Abstarction takes place
		 */
		Animal object = new Lion(); // Abstarction takes place
		object.display(); // method calling
	}
}