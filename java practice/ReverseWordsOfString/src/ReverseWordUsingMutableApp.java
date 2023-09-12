import java.util.Scanner;

public class ReverseWordUsingMutableApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to reverse it...");
		String s=scan.nextLine();
		ReverseWordsUsingMutable reverse=new ReverseWordsUsingMutable();
		String result=reverse.reverseString(s);
		System.out.println("Original String : "+s);
		System.out.println("Reversed String : "+result);
	}

}
