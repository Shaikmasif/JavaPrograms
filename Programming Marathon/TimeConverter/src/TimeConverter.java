import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minutes to convert to hours");
		int minutes = scan.nextInt();
		System.out.println(convertToHours(minutes));

	}

	public static double convertToHours(int minutes) {
		return minutes / 60.0;
	}
}
