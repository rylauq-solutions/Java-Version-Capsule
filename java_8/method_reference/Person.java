package java_8.method_reference;

/**
 * Represents a person with name and age. Demonstrates constructor reference.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}
