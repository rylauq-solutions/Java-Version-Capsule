package java_8.default_method;

/**
 * Implements Calculator and uses default method without overriding.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class SimpleCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
