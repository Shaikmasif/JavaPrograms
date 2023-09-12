
public class PrintMethod {
	void divisibleByTwo(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}
		}
	}

	void divisibleByThree(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");

			}
		}
	}

	void divisibleByFive(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");

			}
		}
	}

	void divisibleByTwoAndFive(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				System.out.print(i + " ");

			}
		}
	}

	void divisibleByThreeAndFive(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");

			}
		}
	}

	void primeNumbers(int n) {
		for (int i = 3; i <= n; i++) {
			for (int j = 2; j < i; i++) {
				if (i % j != 0) {
					System.out.print(i + " ");

				}
			}
		}
	}

	void evenNumbersByThree(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				if (i % 3 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

	void oddNumbersByFive(int n) {
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				if (i % 5 == 0) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
