package java_8.default_method;


/**
 * Demonstrates default methods in interfaces in Java 8. Shows how a class can
 * use and override default methods.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class DefaultMethodDemo {
	public static void main(String[] args) {
		Calculator calc = new SimpleCalculator();
		int result = calc.add(10, 20);
		System.out.println("Addition Result: " + result);

		calc.showInfo(); // default method from interface

		System.out.println("\n<====================>\n");

		Calculator advancedCalc = new AdvancedCalculator();
		int sum = advancedCalc.add(30, 40);
		System.out.println("Addition Result: " + sum);

		advancedCalc.showInfo(); // Overridden Default Method
	}
}
