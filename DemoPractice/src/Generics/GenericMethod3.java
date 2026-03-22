package Generics;

class Demo3 {
    public <T, U> void display(T a, U b) {
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
    }
}

public class GenericMethod3 {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
        d.display("Rohini", 101);
	}

}
