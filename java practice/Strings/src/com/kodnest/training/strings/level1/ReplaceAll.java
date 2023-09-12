package com.kodnest.training.strings.level1;

import java.util.Scanner;

public class ReplaceAll {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String string=scan.nextLine();
		System.out.println(string);
		System.out.println(string.replaceAll("java","Lava"));
	}


}
