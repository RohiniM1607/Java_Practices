package OOPs;

interface Shape1{
	double DEFAULT_VALUE = 1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified dimension";
	}
}

abstract class Circle1 implements Shape1{
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}
	
	public Circle1() {
		this.radius = DEFAULT_VALUE;
	}
	@Override
	public double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String getDescription() {
		return "A circle with radius " + radius;
	}
	
}

class Rectangle1 implements Shape1{
	private double length;
	private double width;
	
	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle1() {
		this.length = DEFAULT_VALUE;
		this.width = DEFAULT_VALUE;
	}
	public double calculateArea() {
		return length*width;
	}
	
	public double calculatePerimeter() {
		return 2*(length+width);
	}
	public String getDescription() {
		return "A rectangle with length "+length+" and width "+width;
	}
}

public class InterfacePractice1 {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1(5, 4);

	    System.out.println(r.calculateArea());
	    System.out.println(r.calculatePerimeter());
	    System.out.println(r.getDescription());
		
	}

}
