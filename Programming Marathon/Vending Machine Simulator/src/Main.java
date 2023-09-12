import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode) {
		switch (productCode) {
		case "P01":
			System.out.println("Pepsi");
			break;
		case "P02":
			System.out.println("fanta");
			break;
		case "P03":
			System.out.println("Sprite");
			break;
		case "P04":
			System.out.println("Coca Cola");
			break;
		default:
			System.out.println("Not available");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode = scan.next();
		getProduct(productCode);

	}

}
