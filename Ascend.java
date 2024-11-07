// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int randomNumMaxLimit = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * randomNumMaxLimit);
		int b = (int) (Math.random() * randomNumMaxLimit);
		int c = (int) (Math.random() * randomNumMaxLimit);

		int minNum = Math.min(a, Math.min(b, c));
		int maxNum = Math.max(a, Math.max(b, c));
		int midNum = a + b + c - minNum - maxNum;

		System.out.println("Generated numbers: " + a + " " + b + " " + c);
		System.out.println("Sorted order: " + minNum + " " + midNum + " " + maxNum);
	}
}
