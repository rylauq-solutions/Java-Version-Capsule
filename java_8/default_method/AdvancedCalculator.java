package java_8.default_method;

/**
 * Implements Calculator and overrides the default method.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class AdvancedCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public void showInfo() {
		System.out.println("Using AdvancedCalculator with enhanced features.");
	}
}
