import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int n = scan.nextInt();
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println("factorial of " + n + " is " + result);
	}

}
