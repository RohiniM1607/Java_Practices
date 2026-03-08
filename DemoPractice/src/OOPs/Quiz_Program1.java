package OOPs;

class Base{
	int i;
	Base(){
		System.out.println("Hello");
	}
	void display() {
		System.out.println(i);
	}
}
class Derived extends Base{
	int j;
	Derived(){
		super();
	}
	void display() {
		//super();
		System.out.println(j);
	}
}

public class Quiz_Program1 {

	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.i = 5;
		obj.display();
		obj.j = 10;
		obj.display();
	}

}
