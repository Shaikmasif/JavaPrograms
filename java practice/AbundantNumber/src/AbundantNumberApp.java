import java.util.Scanner;

public class AbundantNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Abundant of not");
		int n=scan.nextInt();
		AbundantNumber an=new AbundantNumber();
		boolean result=an.checkAbundant(n);
		if(result==true)
		{
			System.out.println("Entered Number "+n+" Is a Abundant Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is a not a Abundant Number");
		}
	}

}
