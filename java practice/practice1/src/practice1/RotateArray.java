package practice1;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the other dimension for the dimension"+(i+1));
			arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array elemets are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
