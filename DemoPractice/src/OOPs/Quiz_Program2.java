package OOPs;

class QBase2{
	int i;
	void display() {
		System.out.println(i);
	}
}

class QDerived2 extends QBase2 {
	int j;
	void display() {
		super.display();
		System.out.println(j);
	}
} 
public class Quiz_Program2 {

	public static void main(String[] args) {
		QDerived2 obj = new QDerived2();
		obj.i=5;
		obj.j=10;
		obj.display();
	}

}
