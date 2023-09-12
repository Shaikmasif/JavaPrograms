import java.util.Scanner;

public class LowerToUpperApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to convert it from lowercase to uppercase...");
		String s=scan.nextLine();
		LowerToUpper lp=new LowerToUpper();
		String result=lp.lowerupper(s);
		System.out.println(result);
	}

}
