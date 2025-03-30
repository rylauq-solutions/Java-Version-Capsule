package java_8.date_and_time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility interface for Java 8 Date and Time API operations. Contains static
 * methods for handling date and time formatting.
 *
 * @author er-YOUR_NEW_NAME
 */
public interface DateTimeUtil {

	/**
	 * Formats a given LocalDateTime using a custom pattern.
	 * 
	 * @param dateTime The LocalDateTime to format.
	 * @return A formatted date-time string.
	 */
	static String formatDateTime(LocalDateTime dateTime) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		return dateTime.format(formatter);
	}
}
