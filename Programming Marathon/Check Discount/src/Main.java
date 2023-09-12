import java.util.Scanner;

public class Main {
	public static void checkDiscount(double purchaseAmount) {
		if (purchaseAmount > 100) {
			System.out.println("Discount Applicable");
		} else {
			System.out.println("Discount not Applicable");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the purchase Amount...");
		double purchaseAmount = scan.nextDouble();
		checkDiscount(purchaseAmount);

	}

}
