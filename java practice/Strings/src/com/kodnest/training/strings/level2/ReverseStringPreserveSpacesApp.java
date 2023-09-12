package com.kodnest.training.strings.level2;
import java.util.Scanner;

public class ReverseStringPreserveSpacesApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to reverse it preserving the white spaces...");
		String s=scan.nextLine();
		ReverseStringPreserveSpaces reverse=new ReverseStringPreserveSpaces();
		String result=reverse.reverseString(s);
		System.out.println("Original String : "+s);
		System.out.println("Reversed String : "+result);
		
		
	}

}
