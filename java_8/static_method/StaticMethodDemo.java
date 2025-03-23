package java_8.static_method;

/**
 * Demonstrates static methods in interfaces in Java 8. Static methods are
 * called using the interface name.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class StaticMethodDemo {
	public static void main(String[] args) {
		int max = MathOperations.findMax(15, 30);
		System.out.println("Maximum: " + max);

		int min = MathOperations.findMin(15, 30);
		System.out.println("Minimum: " + min);

		System.out.println("\nCalling default method using object:");
		MathOperationsImpl ops = new MathOperationsImpl();
		ops.greet();
	}
}
