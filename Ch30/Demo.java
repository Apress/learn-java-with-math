public class Demo {
	private static int counter;
	public static int getCounter() {
		return counter;
	}
	
	private int myNumber;
	public int getNumber() {
		return this.myNumber;
	}

	public Demo(int number) {
		this.myNumber = number;
		counter++;
		System.out.println("I am no. " + counter + " object so far.");
	}	
}