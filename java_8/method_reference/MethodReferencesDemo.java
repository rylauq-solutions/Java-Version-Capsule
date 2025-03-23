package java_8.method_reference;

import java.util.*;

/**
 * Demonstrates different types of method references in Java 8. Includes static
 * method reference, instance method reference, and constructor reference.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class MethodReferencesDemo {

	public static void main(String[] args) {

		// Example 1: Static method reference
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
		System.out.println("Square of numbers:");
		numbers.forEach(MethodReferencesDemo::printSquare);

		// Example 2: Instance method reference on an object
		MessagePrinter printer = new MessagePrinter();
		List<String> greetings = Arrays.asList("Hello", "Hi", "Welcome");
		System.out.println("\nPrinting greetings:");
		greetings.forEach(printer::printMessage);

		// Example 3: Constructor reference
		System.out.println("\nCreating Person objects using constructor reference:");
		PersonCreator creator = Person::new;
		Person p1 = creator.create("Alice", 25);
		Person p2 = creator.create("Bob", 30);

		p1.displayInfo();
		p2.displayInfo();
	}

	/**
	 * Prints the square of a number.
	 *
	 * @param num the number to be squared
	 */
	public static void printSquare(int num) {
		System.out.println(num + " squared = " + (num * num));
	}
}
