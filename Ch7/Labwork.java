import java.util.Scanner;
public class Labwork {
	public static void main(String[] args) {
		// example code in chapter 7
		// "Quotes"
		System.out.println("Forward slashes \\//"); 
		// Forward slashes \//
		System.out.println("How '\"profounding' \"\\\" it is!"); 
		// How '"profounding' "\" it is!
		
		// lab work in chapter 7
		// replace next() with nextLine() and see how it will work differently
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string for c");
		String c = sc.next();
		System.out.println("c is "+c);
		System.out.println("enter string for d");
		String d = sc.next();
		System.out.println("d is "+d);
		System.out.println("\"Quotes\"");
	}
}