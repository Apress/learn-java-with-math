import java.util.Random;

public class Counting {

	public static void main(String[] args) {
		calculateBusTickets();
		furniture();
		scoring();
		countNumbers();
		countNumbers2();
		countCoins();
		countWays();
		
		distributeCandy();
		distributeCandies_Recursive(0);
		System.out.println("Total count: " + count);
	}
	
	private static void calculateBusTickets() {
		for(int tickets = 0; tickets < 46; tickets++) {
			int totalMoney = 4 * tickets + 6 * (45 - tickets);
			if (totalMoney == 230) {
				System.out.println(tickets + " $4.00 tickets were sold.");
				break;
			}
		}
	}
	
	private static void furniture() {
		for(int tables = 0; tables < 19; tables++) {
			if (tables + 4 * 4 * tables + 3 * (18 - tables - 4 * tables) == 60) {
				System.out.println((18 - tables) + " stools.");
				break;
			}
		}
	}
	
	private static void scoring() {
		for(int c = 0; c < 20; c++) {
			for(int w = 0; w < 20 - c; w++) {
				if (5 * c - 2 * w == 48) {
					System.out.println("Correct answers: " + c 
							+ "; wrong answers: " + w);
				}
			}
		}
	}

	private static void countNumbers() {
		int totalCount = 0;
		for(int i = 1000; i < 10000; i++) {
			if (i % 3 == 0 && i % 100 == 23) {
				int firstDigit = i / 1000;
				int secondDigit = i / 100 % 10;
				if (firstDigit != secondDigit &&
					firstDigit != 2 && 
					firstDigit != 3 &&
					secondDigit != 2 &&
					secondDigit != 3) {
					totalCount++;
					System.out.println(i);
				}
			}
		}	
		System.out.println("Total count = " + totalCount);
	}
	
	private static boolean isDistinct(int a, int b, int c, int d) {
		if (a == b) {
			return false;
		} else if (a == c) {
			return false;
		} else if (a == d) {
			return false;
		} else if (b == c) {
			return false;
		} else if (b == d) {
			return false;
		} else if (c == d) {
			return false;
		} else {
			return true;
		}
	}
	
	private static void countNumbers2() {
		int totalCount = 0;
		for(int i = 1000; i < 10000; i++) {
			if (i % 3 == 0 && i % 100 == 23) {
				int firstDigit = i / 1000;
				int secondDigit = i / 100 % 10;
				if (isDistinct(firstDigit, secondDigit, 2, 3)) {
					totalCount++;
					System.out.println(i);
				}
			}
		}	
		System.out.println("Total count = " + totalCount);
	}
	
	private static void countCoins() {
		for(int n = 1; n < 9; n++) {
			for(int d = 1; d < 10 - n; d++) {
				int q = 10 - n - d;
				if (5*n + 10*d + 25*q == 5*q + 10*n + 25*d){
					System.out.println((5*n+10*d+25*q)+" cents.");
					System.out.println("N="+n+"; D="+d+"; Q="+q);
				}
			}
		}
	}
	
	private static void countWays() {
		int count = 0;
		for(int first=0; first <= 6; first++) {
			for(int second = 0; second <= 6 - first; second++) {
				int third = 6 - first - second;
				if (first > 0 && second > 0 && third > 0) {
					count++;
					System.out.println("first=" + first +"; second=" + second + "; third=" + third);
				}
			}
		}
		System.out.println("Total count=" + count);
	}
	
	private static int count = 0;
	private static String[] bag = { "", "", "" };
	private static String[] CANDY = new String[] { "A", "B", "C", "D", "E", "F", "G" };
	private static String RemoveLastChar(String s) {
		if (s == null && s.length() < 1) {
			System.out.println("Input string is invalid!");
			return "";
		}
	    return s.substring(0, s.length() - 1);
	}
	private static void distributeCandies_Recursive(int pointer) {
		for(int i=0; i < 3; i++) {
			bag[i] += CANDY[pointer];
			if (pointer == CANDY.length - 1) {
				if (bag[0].length() > 0 && bag[1].length() > 0) {
					count++;
					System.out.println("Red=" + bag[0] + " Blue=" + bag[1] + " White=" + bag[2]);
				}
			} 
			else {
				distributeCandies_Recursive((pointer + 1));
			}
			bag[i] = RemoveLastChar(bag[i]);
		}
	}
	
	/// BAG - red: 0, blue: 1, white: 2
	private static void distributeCandy() {
		int count = 0;
		String[] bag = { "", "", "" };
		for(int i=0; i < 3; i++) {
			bag[i] += "A";
			for(int j=0; j < 3; j++) {
				bag[j] += "B";
				for(int k=0; k < 3; k++) {
					bag[k] += "C";
					for(int l=0; l < 3; l++) {
						bag[l] += "D";
						for(int m=0; m < 3; m++) {
							bag[m] += "E";
							for(int n=0; n < 3; n++) {
								bag[n] += "F";
								for(int p=0; p < 3; p++) {
									bag[p] += "G";
									if (bag[0].length()>0 && bag[1].length()>0){
										count++;
										System.out.println("Red=" + bag[0] + " Blue="
													+ bag[1] + " White=" + bag[2]);
									}
									bag[p] = bag[p].replace("G", "");
								}
								bag[n] = bag[n].replace("F", "");
							}
							bag[m] = bag[m].replace("E", "");
						}
						bag[l] = bag[l].replace("D", "");
					}
					bag[k] = bag[k].replace("C", "");
				}
				bag[j] = bag[j].replace("B", "");
			}
			bag[i] = bag[i].replace("A", "");
		}
		System.out.println("Total count: " + count);
	}
	
	private static int getRandomIntegerInRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("Error: min cannot be greater than max!");
		}
		
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}
