package OOPs;

class QBase3{
	public QBase3(){
		System.out.println("Base");
	}
}

public class Quiz_Program3 extends QBase3{
	public Quiz_Program3() {
		this("Java");
		System.out.println("Derived");
	}
	
	public Quiz_Program3(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		new Quiz_Program3();
	}

}
