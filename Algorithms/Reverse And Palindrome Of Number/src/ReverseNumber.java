
public class ReverseNumber {
	int reverse(int n) {
		int reverse = 0;
		while (n != 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}
		return reverse;
	}

	boolean checkPalindrome(int n) {
		if (n == reverse(n)) {
			return true;
		}
		return false;

	}

}
