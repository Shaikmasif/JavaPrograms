package printing;

import java.util.Scanner;

public class SwitchWeeks {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Numbers between 1 and 7");
		int num=scan.nextInt();
		switch(num)
		{
			case 1:
				System.out.println("SuperFast Sunday");
				break;
			case 2:
				System.out.println("Lazy Monday");
				break;
			case 3:
				System.out.println("Boring Tuesday");
				break;
			case 4:
				System.out.println("Mysterious Wednesday");
				break;
			case 5:
				System.out.println("Happy Thursday");
				break;
			case 6:
				System.out.println("Fresh Friday");
				break;
			case 7:
				System.out.println("Colorful Saturday");
				break;
			default:
				System.out.println("Please read the message properly");
		}
	}

}
