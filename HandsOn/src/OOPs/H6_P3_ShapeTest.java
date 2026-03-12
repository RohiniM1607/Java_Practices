/*
 * The H6_P3_ShapeTest class implements the program that illustrates to
 * the class hierarcy and the classes for method implementation.
 */
package OOPs;

import java.util.Scanner;

abstract class Shape{
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape() {
		
	}
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	
	
}

class Circle extends Shape{
	protected double radius = 1.0;
	public Circle() {
		
	}
	Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
	public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[" + super.toString() + ", radius=" + radius + "]";
    }
}

class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle() {}

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}

class Square extends Rectangle {

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}




public class H6_P3_ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter circle radius:");
        double r = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter circle color:");
        String cColor = sc.nextLine();

        System.out.print("Is circle filled (true/false):");
        boolean cFilled = sc.nextBoolean();

        Circle c = new Circle(r, cColor, cFilled);

        System.out.println("\nCircle Details:");
        System.out.println(c);
        System.out.println("Area = " + c.getArea());
        System.out.println("Perimeter = " + c.getPerimeter());


        System.out.print("\nEnter rectangle width:");
        double w = sc.nextDouble();

        System.out.print("Enter rectangle length:");
        double l = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter rectangle color:");
        String rColor = sc.nextLine();

        System.out.print("Is rectangle filled (true/false):");
        boolean rFilled = sc.nextBoolean();

        Rectangle rect = new Rectangle(w, l, rColor, rFilled);

        System.out.println("\nRectangle Details:");
        System.out.println(rect);
        System.out.println("Area = " + rect.getArea());
        System.out.println("Perimeter = " + rect.getPerimeter());


        System.out.print("\nEnter side of square:");
        double side = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter square color:");
        String sColor = sc.nextLine();

        System.out.print("Is square filled (true/false):");
        boolean sFilled = sc.nextBoolean();

        Square sq = new Square(side, sColor, sFilled);

        System.out.println("\nSquare Details:");
        System.out.println(sq);
        System.out.println("Area = " + sq.getArea());
        System.out.println("Perimeter = " + sq.getPerimeter());
	}

}
