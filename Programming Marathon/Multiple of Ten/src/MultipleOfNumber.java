import java.util.Scanner;

public class MultipleOfNumber {
	public static void checkMultipleOfTen(int n, int m) {
		if (n % m == 0) {
			System.out.println("The number " + n + " is a multiple of " + m);
		} else {
			System.out.println("The number " + n + " is not a multiple of " + m);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 1st and 2nd number to check the multiple");
		int n = scan.nextInt();
		int m = scan.nextInt();
		checkMultipleOfTen(n, m);

	}

}
