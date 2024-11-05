// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int input_num = Integer.parseInt(args[0]);
	   
	   int hundreds = input_num / 100;
	   int tens = (input_num % 100) / 10;
	   int ones = input_num % 10;
	   
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}