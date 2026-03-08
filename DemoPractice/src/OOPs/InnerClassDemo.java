package OOPs;

class OuterClass{
	int age = 18;
	public void checkAge() {
		System.out.println("In CheckAge() Method call of outer class");
	}
	class InnerClass{
		public void show() {
			System.out.println("In show() Method call of inner class");
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println("OuterClass.Age: "+outer.age);
		System.out.print("OuterClass.checkAge: ");
		outer.checkAge();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.print("InnerClass.show(): ");
		inner.show();
	}

}
