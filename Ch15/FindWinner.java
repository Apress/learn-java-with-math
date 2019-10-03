import java.util.Random;

public class FindWinner {

	private static int count_a, count_b, count_ab = 0;
	private static int totalsteps_a, totalsteps_b = 0;
	
	/// whoever gets below pattern first wins, or tie if both of them get them at the same round
	/// a: HH wins
	/// b: HT wins
	/// use boolean 'True' to represent Head, 'False' for Tail
	///
	public static void main(String[] args) {
		final int MAX = 10000;
		for(int i=0; i < MAX; i++) {
			flipCoin();
		}
		
		System.out.println("Summary");
		System.out.println("Total samples: " + MAX);
		System.out.println("Winning counts: a - " + count_a + "; b - " + count_b + "; ab - " + count_ab);
		int probability_a = count_a * 100 / (count_a + count_b);
		int probability_b = count_b * 100 / (count_a + count_b);
		System.out.println("Winning probability: HH=" + probability_a + "%; HT=" + probability_b + "%.");
		double average_a = totalsteps_a / (count_a + count_ab);
		double average_b = totalsteps_b / (count_b + count_ab);
		System.out.println("Average rounds to win: HH=" + average_a + "; HT=" + average_b + ".");
	}
	
	public static void flipCoin()
	{
		Random r = new Random();
		/// initial value, or first round result
		boolean current_a = r.nextBoolean();
		boolean current_b = r.nextBoolean();

		boolean win_a = false;
		boolean win_b = false;
		int round = 1;
		while(true) {
			round++;
			boolean next_a = r.nextBoolean();
			boolean next_b = r.nextBoolean();
			if (current_a && next_a) {
				win_a = true;			
			}				
			if (current_b && !next_b) {
				win_b = true;
			}
			if (win_a && win_b) {
				System.out.println("Both WIN! - round: " + round);
				count_ab++;
				totalsteps_a += round;
				totalsteps_b += round;
				break;
			}
			if (win_a && !win_b) {
				System.out.println("A WIN! - round: " + round);
				count_a++;
				totalsteps_a += round;
				break;			
			}
			if (!win_a && win_b) {
				System.out.println("B WIN! - round: " + round);
				count_b++;
				totalsteps_b += round;
				break;			
			}	
			current_a = next_a;
			current_b = next_b;
		}
	}
}
