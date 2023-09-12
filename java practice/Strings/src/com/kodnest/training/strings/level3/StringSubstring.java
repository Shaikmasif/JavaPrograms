package com.kodnest.training.strings.level3;

public class StringSubstring {
	void substring(String s)
	{
		for(int i=0;i<=s.length()-1;i++)
		{
			String temp="";
			for(int j=i;j<=s.length()-1;j++)
			{
				temp=temp+s.charAt(j);
				System.out.println(temp);
			}
			System.out.println();
		}
	}

}
