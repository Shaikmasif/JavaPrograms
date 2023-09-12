package com.kodnest.training.strings.level3;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the strings to check whether they are Anagram or not...");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		if(s1.length()!=s2.length())
		{
			System.out.println("The strings are not Anagram");
		}
		else
		{
			boolean result=anagram(s1,s2);
			if(result==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}



	}
	public static boolean anagram(String s1,String s2)
	{
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char []n1=remove(s1).toCharArray();
		char []n2=remove(s2).toCharArray();
		if(n1.length==n2.length)
		{
			outer:for(int i=0;i<=n1.length-1;i++)
			{
				for(int j=0;j<=n2.length-1;j++)
				{
					if(n1[i]==n2[j])
					{
						if(checkCount(n1[i],s1)!=checkCount(n1[i],s2))
						{
							return false;
						}
						else
						{
							continue outer;
						}
					}
				}
				
				return false;

			}
			return true;
		}
		else
		{
			return false;
		}

	}
	public static String remove(String s)
	{
		String s2="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(!s2.contains(String.valueOf(s.charAt(i))))
			{
				s2=s2+s.charAt(i);
			}	
		}

		return s2;
	}
	public static int checkCount(char c,String str)
	{
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(c==str.charAt(i))
			{
				count++;
			}
		}
		return count;
	}
}

