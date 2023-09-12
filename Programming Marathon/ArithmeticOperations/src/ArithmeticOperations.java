
public class ArithmeticOperations {
	public static void main(String[] args) {
		int sub = subtractNumbers(30, 10);
		int mul = multiplyNumbers(10, 2);
		double div = divideNumbers(40, 2);
		int rem = findRemainder(30, 2);
		System.out.println(sub);
		System.out.println(mul);
		System.out.printf("%.2f\n", div);
		System.out.println(rem);
	}

	public static int subtractNumbers(int num1, int num2) {
		return num2 - num1;
	}

	public static int multiplyNumbers(int num1, int num2) {
		return num1 * num2;
	}

	public static double divideNumbers(int num1, int num2)

	{
		return num1 / num2;
	}

	public static int findRemainder(int num1, int num2)

	{
		return num1 % num2;
	}

}
