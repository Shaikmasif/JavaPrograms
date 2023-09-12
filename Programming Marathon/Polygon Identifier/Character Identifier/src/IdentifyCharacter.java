import java.util.Scanner;

class IdentifyCharacter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);

	}

	public static void identifyCharacter(char ch) {
		if (Character.isDigit(ch)) {
			System.out.println("Entered Character " + ch + " is a digit");
		} else if (!Character.isLetter(ch)) {
			System.out.println("Entered Character " + ch + " is a special character");
		} else {
			switch (Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if (Character.isLowerCase(ch)) {
					System.out.println("Entered Character " + ch + " is a Lower-Case vowel");

				} else {
					System.out.println("Entered Character " + ch + " is a Upper-Case vowel");

				}
				break;
			default:
				if (Character.isLowerCase(ch)) {
					System.out.println("Entered Character " + ch + " is a Lower-Case consonant");

				} else {
					System.out.println("Entered Character " + ch + " is a Upper-Case consonant");
				}
				break;
			}

		}
	}

}