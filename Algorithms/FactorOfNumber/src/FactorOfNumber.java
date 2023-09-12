import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find its factor");
		int n = scan.nextInt();
		System.out.print("Factors of " + n + " are ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
