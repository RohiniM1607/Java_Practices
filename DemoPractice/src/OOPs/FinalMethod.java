package OOPs;

class Base1 {
	public final void display(String s) { //final method
		System.out.println(s);
	}
}


public class FinalMethod extends Base1 {
//	public void display(String s) {
//		System.out.println(s);
//	}
	public static void main(String[] args) {
		Base1 obj = new Base1();
		obj.display("TRY ME");
	}

}
