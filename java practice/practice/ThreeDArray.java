import java.util.Scanner;

public class ThreeDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements into the array");
		int arr[][][] = new int[2][2][2];
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					arr[i][j] = scan.nextInt();
				}
			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j <= arr[i].length - 1; j++) {
				for (int k = 0; k <= arr[i][j].length - 1; k++) {
					System.out.print(arr[i][j]);
				}
			}
		}
	}

}
