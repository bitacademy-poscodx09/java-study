package prob05;

public abstract class Shape {
	protected double width;
	protected double height;
	
	protected Shape(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
}