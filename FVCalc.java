// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]) / 100;
		int numberOfYears = Integer.parseInt(args[2]);

		double futureValue = (currentValue * Math.pow((1 + rate), (double)numberOfYears));

		String messageTemplate = "After %d years, a $%d saved at %.1f%% will yield $%d";
		String messageTemplateFormatted = String.format(messageTemplate, numberOfYears, currentValue, rate * 100, (int)futureValue);

		System.out.println(messageTemplateFormatted);
	}
}