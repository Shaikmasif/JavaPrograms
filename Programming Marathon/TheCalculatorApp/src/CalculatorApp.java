import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator calculator = new Calculator();
		while (true) {
			System.out.println("Hello User, Welcome To KodNest Calculator");
			System.out.println("+ --------> Addition");
			System.out.println("- --------> Subtraction");
			System.out.println("* --------> Multiplication");
			System.out.println("/ --------> Division");
			System.out.println("% --------> Find Remainder");
			System.out.println("^ --------> Find Square");
			System.out.println("! --------> STOP");
			System.out.println("Select Your Choice.....?");
			char c = scan.next().charAt(0);
			switch (c) {
			case '+':
				calculator.addition();
				break;
			case '-':
				calculator.subtraction();
				break;
			case '*':
				calculator.multiplication();
				break;
			case '/':
				calculator.division();
				break;
			case '%':
				calculator.findRemainder();
				break;
			case '^':
				calculator.findSquare();
				break;
			case '!':
				System.out.println("Bye Bye,See You,Ta Ta");
				return;
			default:
				System.out.println("Read the message properly");

			}
		}

	}

}
