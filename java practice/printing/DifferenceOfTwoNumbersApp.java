package printing;
import java.util.*;
public class DifferenceOfTwoNumbersApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		DifferenceOfTwoNumbers d=new DifferenceOfTwoNumbers();
		int result=d.difference(num1,num2);
		System.out.println("The difference is : "+result);
	
}
}
