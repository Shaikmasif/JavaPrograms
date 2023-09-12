import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides) {
		switch (sides) {
		case 1:
			System.out.println("Dot");
			break;

		case 2:
			System.out.println("Line");
			break;
		case 3:
			System.out.println("Triange");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Polygon");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of sides");
		int sides = scan.nextInt();
		identifyPolygon(sides);
	}

}
