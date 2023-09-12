import java.util.Scanner;

public class GreaterStringComparision {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 string to compare which is greater...");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=ch1.length-1;i++)
		{
			sum1=sum1+(int)ch1[i];
		}
		for(int i=0;i<=ch2.length-1;i++)
		{
			sum2=sum2+(int)ch2[i];
		}
		if(sum1>sum2)
		{
			System.out.println("String 1 "+s1+" is greater than String 2 "+s2);
		}
		else
		{
			System.out.println("String 2 "+s2+" is greater than String 1 "+s1);
		}
	}

}
