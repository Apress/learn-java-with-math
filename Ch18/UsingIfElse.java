public class UsingIfElse {

	public static void main(String[] args) {
		// example code - compare three different versions of implementations
		int pts = 99;
		System.out.println("GPA score: " + getGpaScore_v0(pts));
		System.out.println("GPA score: " + getGpaScore_v1(pts));
		System.out.println("GPA score: " + getGpaScore_v2(pts));
	}
	
	/*
	 * 90 to 100 --- A
	 * 80 to 89	 --- B
	 * 70 to 79	 --- C
	 * 65 to 69  --- D
	 * below 65  --- F
	 */
	public static char getGpaScore_v2(int points) {
		if (points > 89) {
			return 'A';
		} else if (points > 79) {
			return 'B';
		} else if (points > 69) {
			return 'C';
		} else if (points > 64) {
			return 'D';
		} else {
			return 'F';
		}
	}
	
	public static char getGpaScore_v1(int points) {
		if (points > 89) {
			return 'A';
		} else {
			if (points > 79) {
				return 'B';
			} else {
				if (points > 69) {
					return 'C';
				} else {
					if (points > 64) {
						return 'D';
					} else {
						return 'F';
					}
				}
			}
		}
	}
	
	public static char getGpaScore_v0(int points) {
		if (points > 89) {
			return 'A';
		}
		if (points < 90 && points > 79)	{
			return 'B';
		}
		if (points < 80 && points > 69)	{
			return 'C';
		}
		if (points < 70 && points > 64)	{
			return 'D';
		}
		// if (points < 65) <-- this line can be omitted
		return 'F';		
	}
}
