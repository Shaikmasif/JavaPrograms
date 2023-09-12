package com.loops;

import java.util.Scanner;

public class KodmanStudy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int page = 1;
		while (page > 0) {
			System.out.println("kodman read page " + page);
			page++;
			System.out.println("Hey KodMan Are you bore?");
			boolean bore = scan.nextBoolean();
			if (bore == true)
				break;
		}
	}

}
