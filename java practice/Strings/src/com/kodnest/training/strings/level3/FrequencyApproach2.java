package com.kodnest.training.strings.level3;

import java.util.Scanner;

public class FrequencyApproach2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String str=scan.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]!=' ')
			{
				int count=1;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(arr[i]+"----->"+count);
			}
		}
	}

}
