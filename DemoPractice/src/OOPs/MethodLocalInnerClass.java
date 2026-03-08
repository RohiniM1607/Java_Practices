package OOPs;

class Outer{
	int value = 56;
	public void outerClassMethod() {
		System.out.println("Inside the Method of outer class");
		class Inner{
			public void innerClassMethod() {
				System.out.println("Inside the Method of inner class");
				System.out.println("Value: "+value);
			}
		}
		Inner inner = new Inner();
		inner.innerClassMethod();
	}
}

public class MethodLocalInnerClass {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerClassMethod();
	}

}
