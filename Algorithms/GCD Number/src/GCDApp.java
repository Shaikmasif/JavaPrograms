import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to find the GCD");
		int m = scan.nextInt();
		int n = scan.nextInt();
		GCDApp gcd = new GCDApp();
		int res = gcd.findGCD(m, n);
		System.out.println("GCD OF " + m + " AND " + n + " IS " + res);
	}

	int findGCD(int m, int n) {
		while (n != 0) {
			int rem = m % n;
			m = n;
			n = rem;
		}
		return m;

	}

}
