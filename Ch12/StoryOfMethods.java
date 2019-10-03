public class StoryOfMethods {
	public static void main(String[] args) {
 		method1();
 		method2();
 		System.out.println("Done with main.");
 	}
 	public static void method1() {
 		System.out.println("This is from method1.");
 	}
 	public static void method2() {
 		System.out.println("This is from method2.");
 		method1();
 		System.out.println("Done with method2.");
 	}
}
