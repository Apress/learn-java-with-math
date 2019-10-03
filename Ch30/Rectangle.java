public class Rectangle { 
	private int width; 
	private int height; 
	private int area; 
	private double diagonal; 
	private int perimeter; 

	// need to review and think about how to improve the implementations here
	public Rectangle (int width, int height) { 
		this.width = width; 
		this.height = height; 
		this.area = width*height; 
		this.diagonal = Math.sqrt(width * width + height * height); 
		this.perimeter = (width + height) * 2; 
	} 

	public int getArea() { 
		return this.area; 
	} 
	public double getDiagonal() { 
		return this.diagonal; 
	} 
	public int getPerimeter() { 
		return this.perimeter;
	} 
}
