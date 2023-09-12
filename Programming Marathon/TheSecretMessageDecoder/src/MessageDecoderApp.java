import java.util.Scanner;

public class MessageDecoderApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to decode it to its Unicode");
		char c = scan.next().charAt(0);
		MessageDecoder messageDecoder = new MessageDecoder();
		System.out.println(messageDecoder.decodeCharacter(c));
		scan.close();
	}

}
