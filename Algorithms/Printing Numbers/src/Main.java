import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number...");
		int n = scan.nextInt();
		PrintMethod p = new PrintMethod();
		p.divisibleByFive(n);
		p.divisibleByThree(n);
		p.divisibleByTwo(n);
		p.divisibleByTwoAndFive(n);
		p.divisibleByThreeAndFive(n);
		p.evenNumbersByThree(n);
		p.oddNumbersByFive(n);
		p.primeNumbers(n);
	}

}
