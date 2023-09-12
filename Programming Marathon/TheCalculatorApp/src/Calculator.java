import java.util.Scanner;

public class Calculator {
	Scanner scan = new Scanner(System.in);

	public void addition() {
		System.out.println("Enter two number to perform Addition");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Addition of " + x + " and " + y + " is " + (x + y));
	}

	public void subtraction() {
		System.out.println("Enter two number to perform Subtraction");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Subtraction of " + y + " and " + x + " is " + (y - x));
	}

	public void multiplication() {
		System.out.println("Enter two number to perform Multiplication");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Multiplication of " + x + " and " + y + " is " + (x * y));
	}

	public void division() {
		System.out.println("Enter two number to perform Division");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Division of " + x + " and " + y + " is " + (x / y));
	}

	public void findRemainder() {
		System.out.println("Enter two number to find Remainder");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Remainder of " + x + " and " + y + " is " + (x % y));
	}

	public void findSquare() {
		System.out.println("Enter a number to find Square");
		int x = scan.nextInt();
		System.out.println("Square of " + x + " is " + (x * x));
	}

}
