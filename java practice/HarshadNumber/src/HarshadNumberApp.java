import java.util.Scanner;

public class HarshadNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number to check whether it is Harshad or not...");
		int n=scan.nextInt();
		HarshadNumber hn=new HarshadNumber();
		boolean result=hn.checkHarshad(n);
		if(result==true)
		{
			System.out.println("Entered Number "+n+" Is a Harshad Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is Not a Harshad Number");
		}
		
	}

}
