public class TestDemo {
	public static void main(String[] args) {
		Demo demo1 = new Demo(21);
		System.out.println("demo1 myNumber: " + demo1.getNumber());
		System.out.println("object counts: " + Demo.getCounter());
		
		Demo demo2 = new Demo(57);
		System.out.println("demo2 myNumber: " + demo2.getNumber());
		System.out.println("object counts: " + Demo.getCounter());
		
		Demo demo3 = new Demo(99);
		System.out.println("demo3 myNumber: " + demo3.getNumber());
		System.out.println("object counts: " + Demo.getCounter());
	}
}