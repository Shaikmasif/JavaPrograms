package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class Split {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String string=scan.nextLine();
		System.out.println(string);
		String []result=string.split("ka");
		for (String string2 : result) {
			System.out.print(string2+" ");
			
		}
	}
}
