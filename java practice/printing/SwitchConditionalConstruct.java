package printing;
import java.util.Scanner;
public class SwitchConditionalConstruct {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter + or - or * or / : ");
		char opt=scan.next().charAt(0);
		switch(opt)
		{
			case '+':
				System.out.println("Addition operator");
				break;
			case '-':
				System.out.println("Subtraction operator");
				break;
			case '*':
				System.out.println("Multiplication operator");
				break;
			case '/':
				System.out.println("Division operator");
				break;
			default:
				System.out.println("Please read the message properly");
		}
	}

}
