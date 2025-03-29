# Java-Version-Capsule

A Java project that demonstrates **essential Java features** through practical and beginner-friendly examples. This repository provides clean, well-documented code that highlights real-world applications of modern Java capabilities, supporting developers in writing efficient and maintainable software.

---

## Java 8 Features

> **Java 8 (JDK 1.8)**, released in **March 2014**, is one of the most significant and **widely adopted Long-Term Support (LTS)** versions of Java. It introduced several stable features that have since become foundational in modern Java development, particularly in the areas of functional programming and streamlined data processing.

### 📌 Functional Interfaces  
Interfaces with exactly **one abstract method**, enabling the use of **lambda expressions** and **method references**. Functional interfaces simplify development by allowing concise and expressive behavior definitions.

- Promotes clean, modular code.
- Examples include `Runnable`, `Callable`, and custom interfaces.

### 📌 Lambda Expressions  
Lambda expressions provide a concise way to represent **anonymous functions**. They are typically used to implement the abstract method of a functional interface.

- Enhances code readability and reduces boilerplate.
- Syntax: `(parameters) -> expression` or `(parameters) -> { statements }`

### 📌 Stream API  
The Stream API allows **declarative processing of collections** using operations like `filter()`, `map()`, and `collect()`.

- Supports functional-style operations on data.
- Enables parallel execution and lazy evaluation for performance.
- Ideal for transforming, filtering, and aggregating data.

### 📌 Method References  
Method references provide a shorthand notation for calling methods via functional interfaces.

- Simplifies lambda expressions that only call existing methods.
- Syntax: `ClassName::methodName` or `objectRef::methodName`
- Used for static methods, instance methods, and constructors.

### 📌 Default Methods in Interfaces  
Interfaces can now have **default methods with implementations**, enabling backward compatibility and **interface evolution**.

- Allows interfaces to define behavior without breaking existing implementations.
- Implementing classes can **override** these methods if needed.

### 📌 Static Methods in Interfaces  
Interfaces can define **static utility methods** that are accessed via the interface name.

- Static methods **cannot be overridden** by implementing classes.
- Helps in organizing helper methods logically within interfaces.

### 📌 Optional Class  
The `Optional` class helps **eliminate null checks** by providing a wrapper around potentially null values.

- Prevents `NullPointerException` by enforcing explicit handling.
- Supports methods like `ofNullable()`, `orElse()`, `ifPresentOrElse()`, and `map()`.
- Useful in database queries, API responses, and method return values.

---

## ▶️ Upcoming Java 8 Features (To Be Added)

Additional features from Java 8 will be covered in upcoming updates. Each will include **unique examples**, **Javadoc comments**, and **separate interface and class files** for clarity and maintainability:

- **forEach() Method**  
- **Date and Time API**

---

## ✨ Highlights

- Each feature includes **2–3 clear, beginner-friendly examples**.
- Code is organized with **separate files** for interfaces and their implementations.
