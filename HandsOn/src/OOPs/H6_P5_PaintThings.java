/*
 * The H6_P5_PaintThings class implements the program that illustrates
 * to calculate the amount of pain needed to paint different objects.
 */

package OOPs;

import java.util.Scanner;

abstract class Shape2 {
    String shapeName;

    Shape2(String name) {
        shapeName = name;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }
}

class Sphere extends Shape2 {
    double radius;

    Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    public String toString() {
        return super.toString() + " with radius " + radius;
    }
}

class Rectangle2 extends Shape2 {
    double length;
    double width;

    Rectangle2(double l, double w) {
        super("Rectangle");
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " with length " + length + " and width " + width;
    }
}

class Cylinder extends Shape2 {
    double radius;
    double height;

    Cylinder(double r, double h) {
        super("Cylinder");
        radius = r;
        height = h;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " with radius " + radius + " and height " + height;
    }
}

class Paint {
    double coverage;

    Paint(double c) {
        coverage = c;
    }

    public double amount(Shape2 s) {
        System.out.println("Computing paint for " + s);
        return s.area() / coverage;
    }
}


public class H6_P5_PaintThings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter paint coverage: ");
        double coverage = sc.nextDouble();

        Paint paint = new Paint(coverage);

        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle width: ");
        double width = sc.nextDouble();

        System.out.print("Enter sphere radius: ");
        double radiusSphere = sc.nextDouble();

        System.out.print("Enter cylinder radius: ");
        double radiusCylinder = sc.nextDouble();

        System.out.print("Enter cylinder height: ");
        double height = sc.nextDouble();

        Shape2 deck = new Rectangle2(length, width);
        Shape2 bigBall = new Sphere(radiusSphere);
        Shape2 tank = new Cylinder(radiusCylinder, height);

        double amountDeck = paint.amount(deck);
        double amountBall = paint.amount(bigBall);
        double amountTank = paint.amount(tank);

        System.out.println("\nPaint needed for deck = " + amountDeck);
        System.out.println("Paint needed for bigBall = " + amountBall);
        System.out.println("Paint needed for tank = " + amountTank);
	}

}
