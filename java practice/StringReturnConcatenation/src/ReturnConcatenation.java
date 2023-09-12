import java.util.Scanner;

public class ReturnConcatenation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 strings to concatenate if equal...");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		if(s1.equals(s2))
		{
			System.out.println(s1+s2);
		}
	}

}
