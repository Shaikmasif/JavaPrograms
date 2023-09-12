package com.loops;

public class NestedDoWhile {
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println(i);
			int j = 1;
			do {
				System.out.println(j);
				j++;
			} while (j < 5);
			i++;
		} while (i < 5);
	}

}
