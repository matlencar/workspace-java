package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double totalArea() {
		return width * height;
	}
	
	public double totalPerimeter() {
		return  (width + height + height + width);
	}
	
	public double totalDiagonal() {
		return Math.sqrt(width * width  +  height * height);
	}
}
