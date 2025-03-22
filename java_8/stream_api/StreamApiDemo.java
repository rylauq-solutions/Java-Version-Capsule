package java_8.stream_api;

import java.util.*;
import java.util.stream.*;

/**
 * Demonstrates usage of Java 8 Stream API for data processing. Includes
 * filtering, mapping, and reducing examples.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class StreamApiDemo {

	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Pineapple");

		// Example 1: Filter fruits with length > 5 and print them
		System.out.println("Fruits with name length > 5:");
		fruits.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);

		// Example 2: Convert fruits to uppercase using map()
		System.out.println("\nFruits in uppercase:");
		List<String> upperFruits = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
		upperFruits.forEach(System.out::println);

		// Example 3: Reduce numbers to sum
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("\nSum of numbers: " + sum);

		// Example 4: Collect fruits into a single comma-separated string
		String fruitList = fruits.stream().collect(Collectors.joining(", "));
		System.out.println("\nAll fruits: " + fruitList);
	}
}
