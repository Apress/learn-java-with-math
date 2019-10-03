public class CountingMore{
	
	public static void main(String[] args) {
		countDivisibility();
		countBase10Numbers();
		
		convertDigit(15);
	}
	
	private static boolean isPalindrome(String numberStr) {
	    String reversed = new StringBuffer(numberStr).reverse().toString();
	    return reversed.equals(numberStr);
	}
	
	private static void countDivisibility() {
		int count = 0;
		int total = 0;
		for(int i = 1000; i < 10001; i++) {
			//if(isPalindrome(Integer.toString(i))) {
			if(isPalindrome2(Integer.toString(i))) {
				total++;
				if (i % 7 == 0)
				{
					count++;
					System.out.println(i);
				}
			}			
		}
		System.out.println("Probability=" + count + "/" + total);
	}
	
	private static boolean isPalindrome2(String s) {
		int len = s.length();
	    for( int i = 0; i < len / 2; i++ ) {
	        if (s.charAt(i) != s.charAt(len - i - 1)) {
	        	return false;
	        }
		}
	    return true;    
	}

	private static void countBase10Numbers() {
		int count = 0;
		for(int i = 100; i < 1000; i++) {
			String base9Number = convertToBaseN(i, 9);
			String base11Number = convertToBaseN(i, 11);
			if (base9Number.length() == 3 &&
				base11Number.length() == 3) {
				count++;
				System.out.println(i + " -> " + base9Number + 
						"; " + base11Number);
			}
		}
		System.out.println(count + " out of " + (1000 - 100));
	}
	
	private static String convertToBaseN(int base10, int n) {
		if(n < 2 || n > 16) {
			return "";
		}
		String baseN = myOneDigit[base10 % n];
		base10 = base10 / n;
		while(base10 > 0) {
			baseN = myOneDigit[base10 % n] + baseN;
			base10 = base10 / n;
		}
		return baseN;
	}
	
	private static String[] myOneDigit = 
		{ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

	private static String convertDigit(int digit) {
		String s = "";
		switch(digit) {
			case 10:
				s = "A";
				break;
			case 11:
				s = "B";
				break;
			case 12:
				s = "C";
				break;
			case 13:
				s = "D";
				break;
			case 14:
				s = "E";
				break;
			case 15:
				s = "F";
				break;
			default:
				s = Integer.toString(digit);
				break;
		}
		return s;
	}
}