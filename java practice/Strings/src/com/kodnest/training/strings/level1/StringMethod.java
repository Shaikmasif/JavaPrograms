package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String string=scan.nextLine();
		System.out.println(string);
		System.out.println("====================================");
		System.out.println(string.toUpperCase());
		System.out.println("====================================");
		System.out.println(string.toLowerCase());
		System.out.println("====================================");
		System.out.println(string.charAt(3));
		System.out.println("====================================");
		System.out.println(string.indexOf('A'));
		System.out.println("====================================");
		System.out.println(string.contains("AV"));
		System.out.println("====================================");
		System.out.println(string.substring(2));
		System.out.println("====================================");
		System.out.println(string.substring(2, 5));
		
	}

}
