import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string...");
		String str = scan.nextLine();
		char[] ch = str.toCharArray();
		int len = str.length();
		for (int i = 0; i <= ch.length - 1; i++) {
			int num = counting(ch, ch[i]);
			System.out.println("'" + ch[i] + "' " + ": " + num);
		}
	}

	static int counting(char[] ch, int key) {
		int count = 0;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (key == ch[i]) {
				count++;
			}
		}
		return count;
	}

}
