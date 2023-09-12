import java.util.Scanner;

public class StrongNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number to check whether it is a strong Number or not");
		int n=scan.nextInt();
		StrongNumber sn=new StrongNumber();
		int result=sn.checkStrong(n);
		if(result==n)
		{
			System.out.println("Entered Number "+n+" Is a Strong Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is not a Strong Number");
		}
	}

}
