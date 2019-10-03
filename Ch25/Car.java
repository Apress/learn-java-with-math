public class Car implements Auto, MovingObject {
	private String maker;	
	public void start() {
		// car starts its engine
	}	
	public void stop() {
		// car stops its engine
	}	
	public void turn() {
		// car turns left or right at a corner
	}	
	public void back() {
		// car backs
	}	
	public void park() {
		// car parks
	}	
	public String getMaker() {
		return this.maker;
	}	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void movingNorth() {
		// car moves North
	}	
	public void movingSouth() {
		// car moves South
	}	
}

