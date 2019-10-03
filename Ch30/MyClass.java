public class MyClass {
	// class design part
	public int myNumber;
	public MyClass() {	}
	public int doubleMe() {
		return this.myNumber * 2;
	}

	// test part
	public static void main(String arg[]) {
		// declare and initialize an object
		MyClass myObject = new MyClass();
		myObject.myNumber = 2019;
		int output = myObject.doubleMe();
		// output the resulting data and validate it
		System.out.println("My result is: " + output);
	}
}
