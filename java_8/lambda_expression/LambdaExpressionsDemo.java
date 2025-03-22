package java_8.lambda_expression;

/**
 * Demonstrates the usage of Lambda Expressions introduced in Java 8. This class
 * includes examples of lambda usage with threads (Runnable), sorting with
 * Comparator, and operations using a custom functional interface.
 * 
 * It aims to provide beginner-friendly and practical examples that show how
 * lambda expressions can simplify code and make it more readable.
 * 
 * Examples covered:
 * <ul>
 * <li>Creating and running a thread using a lambda expression</li>
 * <li>Sorting a list of strings by length using a lambda-based Comparator</li>
 * <li>Performing arithmetic operations with a custom functional interface</li>
 * </ul>
 * 
 * @author er-YOUR_NEW_NAME
 */

public class LambdaExpressionsDemo {

	public static void main(String[] args) {

		// Example 1: Lambda with Runnable (Thread)
		Runnable task = () -> {
			System.out.println("Running a thread using Lambda!");
		};
		Thread thread = new Thread(task);
		thread.start();

		// Example 2: Lambda with Comparator (Sorting Strings by length)
		java.util.List<String> names = java.util.Arrays.asList("Mohan", "Sohan", "Jackal", "Jill", "John", "Doe");
		names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println("Sorted by length: " + names);

		// Example 3: Lambda with custom functional interface
		Calculator add = (a, b) -> a + b;
		Calculator multiply = (a, b) -> a * b;
		System.out.println("Sum: " + add.operate(5, 3));
		System.out.println("Product: " + multiply.operate(5, 3));
	}
}
