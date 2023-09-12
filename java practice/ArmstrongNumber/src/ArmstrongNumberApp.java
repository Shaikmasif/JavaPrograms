import java.util.Scanner;

public class ArmstrongNumberApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is a armstrong number or not");
		int n=scan.nextInt();
		ArmstrongNumber an=new ArmstrongNumber();
		int result=an.checkArmstrong(n);
		if(result==n)
		{
			System.out.println("Entered Number "+n+" Is a ArmStrong Number");
		}
		else
		{
			System.out.println("Entered Number "+n+" Is not a ArmStrong Number");
		}
	}
}
