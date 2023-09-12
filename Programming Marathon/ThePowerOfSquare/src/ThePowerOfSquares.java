import java.util.Scanner;

public class ThePowerOfSquares {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to obtain the square");
		int num = scan.nextInt();
		System.out.println(FindSquare.findSquare(num));
	}

}
