import java.util.Scanner;

public class LengthChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 strings...");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		if(s1.length()==s2.length())
		{
			System.out.println("Both strings are of same length");
		}
		else
		{
			System.out.println("Both strings are of different Length");
		}
	}

}
