import java.util.Scanner;

public class Main {
	public static void checkMultipleOfTen(int n) {
		if (n % 10 == 0) {
			System.out.println("The number " + n + " is a multiple of 10");
		} else {
			System.out.println("The number " + n + " is not a multiple of 10");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check the multiple of 10...");
		int n = scan.nextInt();
		checkMultipleOfTen(n);

	}

}
