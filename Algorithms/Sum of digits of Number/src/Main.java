import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of the digits is " + sum);

		// your code here

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to sum it up!");
		int n = scan.nextInt();
		calculateSumOfDigits(n);
	}

}
