import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere in real number");
		double radius = scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.println(explorer.calculateSurfaceArea(radius));
	}

}
