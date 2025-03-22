package java_8.lambda_expression;

/**
 * A functional interface representing a simple calculator that performs
 * arithmetic operations on two integers.
 * 
 * This interface is intended for use with lambda expressions and demonstrates
 * functional programming capabilities introduced in Java 8.
 * 
 * Example usage:
 * 
 * <pre>
 * Calculator add = (a, b) -> a + b;
 * int result = add.operate(5, 3); // result = 8
 * </pre>
 * 
 * @author er-YOUR_NEW_NAME
 */
@FunctionalInterface
public interface Calculator {
	int operate(int a, int b);
}
