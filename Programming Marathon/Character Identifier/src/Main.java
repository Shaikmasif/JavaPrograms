import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character ");
		char ch = scan.next().charAt(0);
		characterIdentifier(ch);
	}

	public static void characterIdentifier(char ch) {
		if (Character.isDigit(ch)) {
			System.out.println("You have enterd a digit");
		}

		else if (Character.isLowerCase(ch)) {
			if (isVowel(ch)) {
				System.out.println("Lower-case vowel");
			} else {
				System.out.println("Lower-case Consonant");
			}
		} else if (Character.isUpperCase(ch)) {
			if (isVowel(ch)) {
				System.out.println("Upper-case Vowel");
			} else {
				System.out.println("Upper-case Consonant");
			}
		} else {
			System.out.println("You have entered special character");
		}
	}

	private static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U';
	}

}
