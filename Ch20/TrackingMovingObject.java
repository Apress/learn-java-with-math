public class TrackingMovingObject {

	public static void main(String[] args) {
		System.out.println(ballBouncing(3.0));
		
		snail();
	}
	
	private static int ballBouncing(double originalHeight) {
		double currentHeight = originalHeight;
		int count = 0;
		while(currentHeight > 0.5) {
			currentHeight = currentHeight * 2 / 3;
			count++;
			System.out.println("Bounce No=" + count + 
					"; current height=" + currentHeight); 
		}
		return count;
	}

	
	private static void snail() {
		final int DEPTH = 12 * 40;
		int currentHeight = 0;
		int numOfDays = 0;
		while (currentHeight < DEPTH) {
			currentHeight += 12 * 4;
			numOfDays++;
			if (currentHeight >= DEPTH) {
				break;
			}
			currentHeight -= 12 * 2 + 6;
			System.out.println("No. " + numOfDays + " day - " + 
					(DEPTH - currentHeight) + " inches to the top.");
		}		
		System.out.println("No. " + numOfDays + " day - at the top.");
	}
}