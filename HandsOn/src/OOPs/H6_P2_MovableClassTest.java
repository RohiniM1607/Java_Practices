/*
 * The H6_P2_MovableClassTest class implements the program that illustrates to
 * test the classes for the implemented classes.
 */
package OOPs;

import java.util.Scanner;
interface Movable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable{
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	@Override
	public String toString() {
		return "MovablePoint [("+x+", "+y+"), speed=("+x+", "+y+")]";
	}
	public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
	
}

class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	@Override
	public String toString() {
        return center.toString() + ", radius=" + radius;
    }
	
	public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }
	
}

public class H6_P2_MovableClassTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter x coordinate:");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate:");
        int y = sc.nextInt();

        System.out.print("Enter x speed:");
        int xSpeed = sc.nextInt();

        System.out.print("Enter y speed:");
        int ySpeed = sc.nextInt();

        System.out.print("Enter radius of circle:");
        int radius = sc.nextInt();
        
        MovablePoint p = new MovablePoint(x, y, xSpeed, ySpeed);
        System.out.println("Point: " + p);

        p.moveUp();
        System.out.println("After moving up: " + p);

        MovableCircle c = new MovableCircle(x, y, xSpeed, ySpeed, radius);
        System.out.println("Circle: " + c);

        c.moveRight();
        System.out.println("After moving right: " + c);

	}

}
