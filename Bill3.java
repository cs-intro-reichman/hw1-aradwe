// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// Parsing the diner names and total bill amount from input arguments:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int totalBillAmount = Integer.parseInt(args[3]);
		
		// Splits the bill and round up the result
		double amountPerPerson = Math.ceil((double) totalBillAmount / 3);
		
		// Format and print the finel output message
		String messageTemplate = "Dear %s, %s and %s: pay %.1f Shekels each";
		String messageTemplateFormatted = String.format(messageTemplate, name3, name2, name1, amountPerPerson);
		
		System.out.println(messageTemplateFormatted);
	}
}
