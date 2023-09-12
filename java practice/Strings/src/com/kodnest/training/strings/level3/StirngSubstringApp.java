package com.kodnest.training.strings.level3;
import java.util.Scanner;

public class StirngSubstringApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String s=scan.nextLine();
		StringSubstring substring=new StringSubstring();
		substring.substring(s);
		
	}


}
