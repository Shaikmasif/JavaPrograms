import java.util.Scanner;

public class AutomorphicNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is automorphic or not");
		int n=scan.nextInt();
		AutomorphicNumber an=new AutomorphicNumber();
		boolean result=an.checkAutomorphic(n);
		if(result==true)
		{
			System.out.println("Entered Number "+n+" Is an Automorphic Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is not an Automorphic Number");
		}
	}

}
