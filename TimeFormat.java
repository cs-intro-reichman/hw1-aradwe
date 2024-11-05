// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        
		// Determine if it's AM or PM
		String period;
		if (hours >= 12) {
			period = "PM";
		}
		else period = "AM";

		// Prepare hour output
		String hourFormat;
		if (hours > 12) {
			hourFormat = String.valueOf(hours - 12); // Convert to 12-hour format
		}
		else hourFormat = String.valueOf(hours);

		 // Format minutes with zero if needed
		String minuteFormat;
		if (minutes < 10) {
			minuteFormat = "0" + minutes;			
		}
		else minuteFormat = String.valueOf(minutes);

		// Print the final time in the new format
		System.out.println(hourFormat + ":" + minuteFormat + " " + period);


/*
		SOLUTION USING '?' INSTEAD OF 'IF STATEMENTS' FOR A MORE ELEGANT AND CLEAN CODE:

		// Determine if it's AM or PM
		 String period = hours >= 12 ? "PM" : "AM";

		  // Prepare hour output
		  String hourFormat;
		  hourFormat = hours > 12 ? String.valueOf(hours - 12) : String.valueOf(hours); // Convert to 12-hour format if needed 
  
		  // Format minutes with zero if needed
		  String minuteFormat = minutes < 10 ? "0" + minutes : String.valueOf(minutes);
  
		  // Print the final time in the new format
		  System.out.println(hourFormat + ":" + minuteFormat + " " + period);
*/

	}
}