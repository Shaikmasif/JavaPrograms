package com.kodnest.training.strings.level2;

public class ReverseStringPreserveSpaces {
	String reverseString(String s)
	{
		char arr[]=s.toCharArray();
		char rev[]=new char[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==' ')
			{
				rev[i]=arr[i];
			}
		}
		int j=rev.length-1;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]!=' ')
			{
				if(rev[j]==' ')
				{
					j--;
				}
				rev[j]=arr[i];
				j--;
			}
		}
		return new String(rev);
	}

}
