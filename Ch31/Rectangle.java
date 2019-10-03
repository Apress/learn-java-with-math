
public class Rectangle {
	public float x_min;	
	public float x_max;
	public float y_min;
	public float y_max;
	
	public Rectangle(float xmin, float ymin, float xmax, float ymax) {
		if (xmin >= xmax || ymin >= ymax) {
			throw new IllegalArgumentException("Not a valid rectangle!"); 
		}
		this.x_min = xmin;
		this.y_min = ymin;
		this.x_max = xmax;
		this.y_max = ymax;
	}
	
	public float getWidth() {
		return this.x_max - this.x_min;
	}
	
	public float getHeight() {
		return this.y_max - this.y_min;
	}
}
