package practice;
import java.util.*;
public class Array {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("enter the marks to be stored");
		
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("marks of the student"+i+1+":"+marks[i]);
		}
	}

}
