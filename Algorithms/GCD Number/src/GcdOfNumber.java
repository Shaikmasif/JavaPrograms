import java.util.Scanner;

public class GcdOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int m = scan.nextInt();
		int n = scan.nextInt();
		while (n != 0) {
			int rem = m % n;
			m = n;
			n = rem;
		}
		int gcd = m;
		System.out.println("GCD is " + gcd);
	}

}
