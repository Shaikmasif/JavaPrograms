import java.util.Scanner;

public class PerfectNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check the whether it is perfect or not");
		int n=scan.nextInt();
		PerfectNumber pn=new PerfectNumber();
		int result=pn.checkPerfect(n);
		if(result==n)
		{
			System.out.println("Entered Number "+n+" Is a Perfect Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is not a Perfect Number");
		}
	}

}
