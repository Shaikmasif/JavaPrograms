import java.util.Scanner;

public class UpperLowerCounterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to count the upper and lower case letters...");
		String s=scan.nextLine();
		UpperLowerCounter l=new UpperLowerCounter();
		l.caseCounter(s);
	}

}
