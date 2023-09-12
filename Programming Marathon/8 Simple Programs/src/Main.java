import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range to print prime numbers");
		int n = scan.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			int result = checkPrime(i);
			if (result != 0) {

				System.out.println(result);
				count++;
			}

		}
		System.out.println("Number of prime numbers are " + count);
	}

	public static int checkPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % 2 == 0) {
				return 0;
			}
		}
		return n;
	}

}
