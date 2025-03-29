package java_8.optional_class;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Demonstrates the usage of Optional class in Java 8.
 * 
 * @author er-YOUR_NEW_NAME
 */

public class OptionalDemo implements OptionalExample {

	private Map<Integer, String> userDatabase = new HashMap<>();

	public OptionalDemo() {
		// Sample user data
		userDatabase.put(1, "Mohan");
		userDatabase.put(2, "Sohan");
		userDatabase.put(3, "Rohan");
	}

	@Override
	public Optional<String> getUserNameById(int id) {
		return Optional.ofNullable(userDatabase.get(id));
	}

	public static void main(String[] args) {
		OptionalDemo demo = new OptionalDemo();

		// Example 1: Fetching existing user
		int userId1 = 2;
		Optional<String> user1 = demo.getUserNameById(userId1);
		user1.ifPresentOrElse(name -> System.out.println("User found: " + name),
				() -> System.out.println("User not found!"));

		System.out.println("\n<====================>\n");

		// Example 2: Fetching non-existing user
		int userId2 = 5;
		Optional<String> user2 = demo.getUserNameById(userId2);
		System.out.println("Fetched User: " + user2.orElse("Guest"));

		System.out.println("\n<====================>\n");

		// Example 3: Using map() with Optional
		Optional<Integer> nameLength = demo.getUserNameById(1).map(String::length);
		System.out.println("Length of Mohan's name: " + nameLength.orElse(0));
	}
}
