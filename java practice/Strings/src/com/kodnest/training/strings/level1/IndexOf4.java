package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class IndexOf4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String string=scan.nextLine();
		System.out.println(string);
		System.out.println(string.indexOf("is",1));
	}


}
