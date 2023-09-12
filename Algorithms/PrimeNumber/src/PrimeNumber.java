import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is prime or not");
		int n = scan.nextInt();
		boolean isPrime = true;
		if (n < 2) {
			System.out.println(n + " is not a prime number");
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println(n + " is a prime number");
			} else {
				System.out.println(n + " is not a prime number");
			}
		}
	}

}
