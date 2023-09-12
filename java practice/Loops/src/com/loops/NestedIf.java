package com.loops;

public class NestedIf {
	public static void main(String[] args) {
		int a = 40;
		int b = 30;
		int c = 20;
		int d = 10;
		if (a > b) {
			System.out.println("a is greater than b");
			if (b > c) {
				System.out.println("a is greater than b and c");
				if (a > d) {
					System.out.println("a is greater than b ,c and d");
				}
			}
		}
	}

}
