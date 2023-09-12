package com.loops;

public class NestedIfElse2 {
	public static void main(String[] args) {
		int a = 20;
		int b = 25;
		int c = 30;
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			if (b > c) {
				System.out.println("b is greater than c");
			} else {
				System.out.println("c is greater than b");
			}
		}
	}

}
