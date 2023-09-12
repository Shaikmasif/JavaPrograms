package printing;

import java.util.Scanner;

public class SwitchString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String name = scan.next();
		switch (name) {
		case "asif":
			System.out.println("Assalamu'Alaikum Asif!");
			break;
		case "moin":
			System.out.println("Assalamu'Alaikum Moin!");
			break;
		case "saif":
			System.out.println("Assalamu'Alaikum Saifulla!");
			break;

		default:
			System.out.println("Please enter proper name...?");
		}
	}
}
