import java.util.Scanner;

public class FinanceCalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount,rate of interest and time");
		double principal = scan.nextDouble();
		double rate = scan.nextDouble();
		double time = scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		System.out.println(calculator.calculateSimpleInterest(principal, rate, time));
	}

}
