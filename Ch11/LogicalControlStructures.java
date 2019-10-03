public class LogicalControlStructures {
	public static void main(String[] args) {
		// example code
		WhatIsIt(9, 4);

		// lab work, try with different integer numbers (x, y)
		System.out.println("Quadrant: " + quadrant(-2, 5));
	}
	
	public static void WhatIsIt(int x, int y) {
		int z = 4;
		if (z <= x) { 
        		z = x + 1; 
    		} else { 
        		z = z + 9; 
    		} 
    		if (z <= y) { 
        		y++; 
    		} 
    		System.out.println(z + " " + y); 
	}

	public static int quadrant(int x, int y) {
		if (x == 0 || y == 0) {
			return 0;
		}
		else if (x > 0)		// x > 0 and y <> 0
		{
			if (y > 0) {
				return 1;
			}
			return 4;
		}
		else				// x < 0 and y <> 0
		{
			if (y > 0) {
				return 2;
			}
			return 3;
		}		
	}
}
