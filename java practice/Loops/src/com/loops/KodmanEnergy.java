package com.loops;

import java.util.Scanner;

public class KodmanEnergy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the energy level of kodman");
		int energy = scan.nextInt();

		while (energy > 0) {
			System.out.println("Energy level of kodman is " + energy);
			energy--;
		}
	}

}
