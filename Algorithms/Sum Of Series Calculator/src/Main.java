import java.util.Scanner;

public class Main {
	public static void calculateSumOfSeries(double n) {
		// your code here
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (1.0 / i);
		}
		System.out.println("sum is " + sum);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of series");
		double n = scan.nextDouble();
		calculateSumOfSeries(n);

	}

}
