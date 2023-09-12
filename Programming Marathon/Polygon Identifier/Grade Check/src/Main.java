import java.util.Scanner;

public class Main {
	public static void gradeCheck(int marks) {
		if (marks > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the marks of the student");
		int marks = scan.nextInt();
		gradeCheck(marks);

	}

}
