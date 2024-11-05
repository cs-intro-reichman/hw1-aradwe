// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int inputNum = Integer.parseInt(args[0]);
	   
		int hundreds = inputNum / 100;
	    int tens = (inputNum % 100) / 10;
	    int ones = inputNum % 10;
	   
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}