package OOPs;

class QBase1{
	int i;
	QBase1(){
		System.out.println("Hello");
	}
	void display() {
		System.out.println(i);
	}
}
class QDerived1 extends QBase1{
	int j;
	QDerived1(){
		super();
	}
	void display() {
		//super();
		System.out.println(j);
	}
}

public class Quiz_Program1 {

	public static void main(String[] args) {
		QDerived1 obj = new QDerived1();
		obj.i = 5;
		obj.display();
		obj.j = 10;
		obj.display();
	}

}
