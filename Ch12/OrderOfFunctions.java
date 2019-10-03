public class OrderOfFunctions {
 	public static void main(String[] args) {
 		second();
 		first();
 		second();
 		third();
 	} 
 	public static void first() {
 		System.out.println("Inside the first function.");
 	} 
 	public static void second() {
 		System.out.println("Inside the second function.");
 		first();
 	}
 		public static void third() {
 		System.out.println("Inside the third function.");
 		first();
 		second();
 	}
}
