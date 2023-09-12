package com.kodnest.training.strings.level3;

import java.util.Scanner;

public class Anagram2App {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the strings...");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		if(s1.length()!=s2.length())
		{
			System.out.println("The strings are not Anagram");
		}
		else
		{
			Anagram2 anagram=new Anagram2();
			boolean result=anagram.checkAnagram(s1, s2);
			if(result==true)
			{
				System.out.println("The strings are Anagram");
			}
			else
			{
				System.out.println("The strings are not Anagram");
			}
		}
	}

}
