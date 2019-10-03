import java.util.Random;

public class PiExp {

	public static void main(String[] args) {
		for(int i=0; i < 10; i++) {
			System.out.println(computePi(100 * 1000 * 1000, 100));
		}
	}

	public static double computePi(long total, int n) {
		long count = 0;
		for(long i=0; i < total; i++) {
			double x = n * Math.random();
			double y = n * Math.random();
			if ((x - n/2) * (x - n/2) + (y - n/2) * (y - n/2) 
					< (n/2) * (n/2)) {
				count++;
			}
		}
		return (double)count * 4 / total; 
	}
	
	public static double computeArea(int total) {
		int count = 0;
		for(int i=0; i < total; i++) {
			double x = Math.random() * 3;
			double y = Math.random() * -18;
			if (-2 * x * x + 12 * x - 18 < y) {
				count++;
			}
		}
		return (double)count * 54 / total;		
	}	
}
