public class ArrayWork {
	public static void main(String[] args) {
		// demonstrates three different ways to declare and initialize an array
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 2;
		numbers[3] = 4;
		numbers[4] = 5;
		
		int[] numbers2 = new int[ ] { 1, 3, 2, 4, 5 }; 

		int[]  numbers3 = new int[7];
		for (int i = 0; i < numbers3.length; i++) {
			numbers3[i] = 2 * i + 1;
		}
	}
}