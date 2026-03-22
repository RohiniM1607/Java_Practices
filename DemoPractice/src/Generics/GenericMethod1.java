package Generics;

class Demo1 {
    public <T> void show(T value) {
        System.out.println("Value: " + value);
    }
}

public class GenericMethod1 {

	public static void main(String[] args) {
		Demo1 d = new Demo1();

        d.show("Rohini");
        d.show(100);
        d.show(45.6);
	}

}
