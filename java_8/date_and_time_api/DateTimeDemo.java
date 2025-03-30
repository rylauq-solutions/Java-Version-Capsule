package java_8.date_and_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Demonstrates the usage of the Java 8 Date and Time API. Explores LocalDate,
 * LocalTime, LocalDateTime, and ZonedDateTime.
 * 
 * @author er-YOUR_NEW_NAME
 */
public class DateTimeDemo {
	public static void main(String[] args) {
		// Example 1: Get the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date: " + currentDate);

		System.out.println("\n<====================>\n");

		// Example 2: Get the current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time: " + currentTime);

		System.out.println("\n<====================>\n");

		// Example 3: Get both date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + DateTimeUtil.formatDateTime(currentDateTime));

		System.out.println("\n<====================>\n");

		// Example 4: Specific Date and Time
		LocalDate customDate = LocalDate.of(2025, Month.MARCH, 29);
		LocalTime customTime = LocalTime.of(10, 30);
		LocalDateTime customDateTime = LocalDateTime.of(customDate, customTime);
		System.out.println("Custom Date and Time: " + DateTimeUtil.formatDateTime(customDateTime));

		System.out.println("\n<====================>\n");

		// Example 5: ZonedDateTime with Time Zones
		ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in India: " + indiaTime);
	}
}
