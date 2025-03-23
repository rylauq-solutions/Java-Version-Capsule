package java_8.default_method;

/**
 * Functional interface for performing addition. Includes a default method to
 * show calculator info.
 * 
 * @author er-YOUR_NEW_NAME
 */
public interface Calculator {

	int add(int a, int b);

	default void showInfo() {
		System.out.println("Using default Calculator for basic operations.");
	}
}
