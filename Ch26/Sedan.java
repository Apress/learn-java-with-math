//Note: need to utilize the interface and class from Ch25
public class Sedan extends Car {
	public Boolean isFourDoorHatchback;
	public Boolean isFourWheelDrive(){
		return true;
	}
	
	public static void main(String[] args) {
		Sedan sedan = new Sedan();
		sedan.start();
		sedan.stop();
		sedan.turn();
		sedan.back();
		sedan.park();
		sedan.setMaker("Toyota");
		sedan.getMaker();
		
		sedan.isFourDoorHatchback = true;
		System.out.println("Is Sedan four wheel driving? " + sedan.isFourWheelDrive());
	}
}
