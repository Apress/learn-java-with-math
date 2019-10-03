import java.util.Scanner;
public class Factorization {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int iterations = 0;
		while (true) {
			iterations++;
			System.out.println("Enter an integer number:");
			int k = input.nextInt();
			if (k < 0) {
				k = -k;
			}

			System.out.println("v33 - ");
			listFactors_v33(k);
			System.out.println("v32 - ");
			listFactors_v32(k);
			System.out.println("v31 - ");
			listFactors_v31(k);
			System.out.println("v22 - ");
			listFactors_v22(k);
			System.out.println("v21 - ");
			listFactors_v21(k);
			System.out.println("v1 - ");
			listFactors_v1(k);

			if (iterations == 10)
				break;
		}
		input.close();
	}

	private static int listFactors_v33(int n) {
		String s = Integer.toString(n);
		int counter = 2;
		System.out.print("1");
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				System.out.print(", " + i);
				counter++;
				if (i != n / i) {
					s = n / i + ", " + s;
					counter++;
				}
			}
		}
		System.out.println(", " + s);
		System.out.println("Number of factors: " + counter);
		return counter;
	}

	private static int listFactors_v32(int n) {
		String s1 = "1";
		String s2 = Integer.toString(n);
		int counter = 2;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				s1 += ", " + i;
				counter++;
				if (i != n / i) {
					s2 = n / i + ", " + s2;
					counter++;
				}
			}
		}
		System.out.println(s1 + ", " + s2);
		System.out.println("Number of factors: " + counter);
		return counter;
	}

	private static int listFactors_v31(int n) {
		int counter = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (counter > 0) {
					System.out.print(", ");
				}
				System.out.print(i);
				counter++;
				if (i != n / i) {
					System.out.print(", " + n / i);
					counter++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of factors: " + counter);
		return counter;
	}

	private static int listFactors_v22(int n) {
		System.out.print("1"); // "1" is always the 1st factor
		int counter = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(", " + i);
				counter++;
			}
		}
		System.out.println(", " + n); // n is always the last factor
		counter++;
		System.out.println("Number of factors: " + counter);
		return counter;
	}

	private static int listFactors_v21(int n) {
		int counter = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				if (counter > 0) {
					System.out.print(", ");
				}
				System.out.print(i);
				counter++;
			}
		}
		System.out.println(", " + n);
		counter++;
		System.out.println("Number of factors: " + counter);
		return counter;
	}

	private static int listFactors_v1(int n) {
		int counter = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (counter > 0) {
					System.out.print(", ");
				}
				System.out.print(i);
				counter++;
			}
		}
		System.out.println();
		System.out.println("Number of factors: " + counter);
		return counter;
	}
}
