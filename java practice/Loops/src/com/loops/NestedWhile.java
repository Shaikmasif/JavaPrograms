package com.loops;

public class NestedWhile {
	public static void main(String[] args) {
		int i = 10;
		while (i > 0) {
			System.out.println(i);
			int j = 5;
			while (j > 0) {
				System.out.println(j);
				j--;
			}
			i--;
		}
	}
}
