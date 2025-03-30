package java_8.forEach_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Demonstrates the usage of the forEach() method in Java 8. The forEach()
 * method allows performing operations on each element of a collection in a
 * functional style.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class ForEachDemo {

	public static void main(String[] args) {
		// List of names
		List<String> names = Arrays.asList("Mohan", "Sohan", "Rohan", "Aman");

		// Example 1: Using forEach() with a Lambda Expression
		System.out.println("Using Lambda Expression:");
		names.forEach(name -> System.out.println(name));

		System.out.println("\n<====================>");

		// Example 2: Using forEach() with a Method Reference
		System.out.println("\nUsing Method Reference:");
		names.forEach(System.out::println);

		System.out.println("\n<====================>");

		// Example 3: Using forEach() with a Custom Consumer
		System.out.println("\nUsing Custom Consumer:");
		Consumer<String> printName = name -> System.out.println("Hello, " + name + "!");
		names.forEach(printName);
	}
}
