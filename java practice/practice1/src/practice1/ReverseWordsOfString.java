package practice1;

import java.util.Scanner;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String s=scan.nextLine();
		String str[]=s.split(" ");
		ReverseWordsOfString r=new ReverseWordsOfString();
		for(int i=0;i<=str.length-1;i++)
		{
			System.out.print(r.reverse(str[i])+" ");
		}
		
	}
	String reverse(String s)
	{
		char ch[]=s.toCharArray();
		char ch2[]=new char[ch.length];
		int j=ch.length-1;
		for(int i=0;i<=ch.length-1;i++)
		{
			ch2[j]=ch[i];
			j--;
		}
		String result=new String(ch2);
		return result;
	}

}
