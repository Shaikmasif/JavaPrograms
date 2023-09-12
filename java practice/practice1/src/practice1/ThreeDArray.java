package practice1;

import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first dimension of the array");
		int arr[][][]=new int[scan.nextInt()][][];
		System.out.println("Enter the second dimenssion for 1d");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=new int[scan.nextInt()][];
		}
		System.out.println("Enter the third dimesion for every 2d");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length;j++)
			{
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		System.out.println("enter the elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				for(int k=0;k<=arr[i][j].length-1;k++)
				{	
					System.out.print(arr[i][j][k]+" ");
				}
			}
			System.out.println();
		}
		
	}

}
