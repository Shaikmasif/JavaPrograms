package printing;

import java.util.Scanner;

public class MethodOverloading {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the values of a,b,c");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		Calculator cal=new Calculator();
		cal.add((byte)a,(byte) b);
		cal.add(a, b,c);
		cal.sub(a, b);
		cal.sub(a, b, c);
		cal.mul(a, b);
		cal.mul(a, b, c);
		cal.div(a,b);
	}

}
