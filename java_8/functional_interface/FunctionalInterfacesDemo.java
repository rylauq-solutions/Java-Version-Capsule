package java_8.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Demonstrates built-in and custom functional interfaces in Java 8.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class FunctionalInterfacesDemo {

	public static void main(String[] args) {

		// Example 1: Predicate - checks if a number is even
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println("Is 4 even? " + isEven.test(4));
		System.out.println("Is 7 even? " + isEven.test(7));

		// Example 2: Consumer - prints each name
		Consumer<String> printName = name -> System.out.println("Name: " + name);
		List<String> names = Arrays.asList("Ravi", "Sneha", "Karan");
		names.forEach(printName);

		// Example 3: Supplier - supplies a random double value
		Supplier<Double> randomValue = () -> Math.random();
		System.out.println("Random value: " + randomValue.get());

		// Example 4: Custom Functional Interface - String operations
		StringOperation toUpper = str -> str.toUpperCase();
		StringOperation reverse = str -> new StringBuilder(str).reverse().toString();

		System.out.println("Uppercase: " + toUpper.operate("hello"));
		System.out.println("Reversed: " + reverse.operate("world"));
	}
}