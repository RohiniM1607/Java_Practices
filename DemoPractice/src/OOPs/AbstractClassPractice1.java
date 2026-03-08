package OOPs;

abstract class Shape{
	void draw() {
		System.out.println("Drawing");
	}
	
	abstract void area();
	abstract void perimeter();
}

class Rectangle extends Shape{
	private int length, breadth;
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	void area(){
		System.out.println("Area of Rectangle: "+(length*breadth));
	}
	
	void perimeter() {
		System.out.println("Perimeter of Rectangle: "+(2*(length+breadth)));
	}
}

class Square extends Shape{
	private int side;
	Square(int side){
		this.side = side;
	}
	void area() {
		System.out.println("Area of Square: "+(side*side));
	}
	void perimeter() {
		System.out.println("Perimeter of Square: "+(4*side));
	}
}

class Circle extends Shape{
	private int radius;
	private final double PI = 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	void area() {
		System.out.println("Area of Circle: "+(PI*radius*radius));
	}
	
	void perimeter() {
		System.out.println("Perimeter of Circle: "+(2*PI*radius));
	}
}

public class AbstractClassPractice1 {

	public static void main(String[] args) {
		Shape s;
		s = new Rectangle(3, 7);
		System.out.println("Rectangle");
		s.area();
		s.perimeter();
		
		s = new Square(3);
		System.out.println("\nSquare");
		s.area();
		s.perimeter();
		
		s = new Circle(4);
		System.out.println("\nCircle");
		s.area();
		s.perimeter();
	}

}
