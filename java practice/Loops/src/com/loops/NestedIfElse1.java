package com.loops;

public class NestedIfElse1 {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int c = 30;
		if (a > b) {
			System.out.println("a is greater than b");
			if (a > c) {
				System.out.println("a is greater than c");
			} else {
				System.out.println("c is greater than a");
			}
		}
	}

}
