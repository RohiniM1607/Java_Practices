package OOPs;

class Person1{
	int age = 21;
	static int weight = 48;
	static class Gender{
		void nonStaticDisplay() {
			System.out.print("In NonStatic Display Method");
			System.out.println("Weight Value: "+weight);
		}
		static void staticDisplay() {
			System.out.println("In Static Display Method");
			System.out.println("Weight value: "+weight);
		}
	}
	Gender gender = new Gender();
}

public class InnerClassDemo2 {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.gender.nonStaticDisplay();
		Person1.Gender.staticDisplay();
	}

}
