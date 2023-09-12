import java.util.Scanner;

public class HalveIt {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be halved");
		double num = scan.nextDouble();
		System.out.println(halveTheNumber(num));

	}

	public static double halveTheNumber(double num) {
		return num / 2;
	}
}
