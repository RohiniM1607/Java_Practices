package OOPs;

class QBase4 {
	public void displayBase(){
		System.out.println("Base class Method");
	}
}


public class Quiz_Program4 extends QBase4 {
	public void displayDerived(){
		System.out.println("Derived class Method");
	}
	public Quiz_Program4(String s){
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		//new Quiz_Program4();
	}

}
