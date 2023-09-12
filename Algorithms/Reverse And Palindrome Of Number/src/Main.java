import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to reverse it!");
		int n = scan.nextInt();
		ReverseNumber rev = new ReverseNumber();
		boolean result = rev.checkPalindrome(n);
		if (result == true)
			System.out.println(n + " is a palindrome");
		else
			System.out.println(n + " is not a palindrome");

	}

}
