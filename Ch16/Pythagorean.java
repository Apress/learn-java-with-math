public class Pythagorean {

	public static void main(String[] args) {
		System.out.println("Total count: " + PrintAllPythagoreanNumbers(100));
	}
	
	private static int PrintAllPythagoreanNumbers(int upperBound) {
		int count = 0;
		for(int a = 1; a < upperBound; a++) {
			for(int b = a; b < upperBound; b++) {
				for(int c = b; c < upperBound; c++) {
					if (a * a + b * b == c * c) {
						System.out.println("(" + a + ", " + b + ", " + c + ")");
						count++;
					}
				}
			}
		}
		return count;
	}
}
