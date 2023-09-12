import java.util.Scanner;

public class ReverseWordsOfStringsApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to reverse it preserving the white spaces...");
		String s=scan.nextLine();
		ReverseWordsOfString reverse=new ReverseWordsOfString();
		String[] result=reverse.reverseString(s);
		System.out.println("Original String : "+s);
		System.out.print("Reversed String : ");
		for (String string : result) {
			System.out.print(string+" ");
		}
		
		
		
	}

}
