package assignment.coVarientPorg;

//Superclass
class Animal {
 public Animal makeSound() {
     System.out.println("Animal sound..");
     return this;
 }
}

//Subclass 1
class Dog extends Animal {
 @Override
 public Dog makeSound() {
     System.out.println("Dog: Woof..");
     return this;
 }
}

//Subclass 2
class Cat extends Animal {
 @Override
 public Cat makeSound() {
     System.out.println("Cat: Meow..");
     return this;
 }
}

// main class
public class CoVariantReturnType {

	public static void main(String[] args) {
        // Creating objects
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Using co-variant
        animal.makeSound();
        System.out.println();
        animal = dog.makeSound(); // Output: Woof
        animal = cat.makeSound(); // Output: Meow

        System.out.println();
        /// print
        System.out.println(animal instanceof Dog); // Output: false
        System.out.println(animal instanceof Cat); // Output: true
    }
	
}
