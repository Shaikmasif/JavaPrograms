package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class StringsDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array length");
		
		char ch[]=new char[scan.nextInt()];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=scan.next().charAt(0);
		}
		
		System.out.print("Array 1 elements ---->");
		
		for (char c : ch) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		char []ch2=new char[ch.length];
		
		for(int i=0;i<=ch.length-1;i++)
		{
			ch2[i]=ch[i];
		}
		
		System.out.print("Array 2 elements ---->");
		for (char c : ch2) {
			System.out.print(c+" ");
		}
		System.out.println();
		
		char []ch3=new char[ch2.length];
		int j=ch3.length-1;
		for(int i=0;i<=ch2.length-1;i++)
		{
			ch3[j]=ch2[i];
			j--;
		}
		
		System.out.print("Array 3 elements ---->");
		for (char c : ch3) {
			System.out.print(c+" ");
		}
	}

}
