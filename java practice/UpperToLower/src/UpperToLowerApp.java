import java.util.Scanner;

public class UpperToLowerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to convert from uppercase to lowercase...");
		String s=scan.nextLine();
		UpperToLower upperlower=new UpperToLower();
		String result=upperlower.upperlower(s);
		System.out.println(result);
		
	}

}
